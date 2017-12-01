package repository;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.QueryException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import filter.HorarioFilter;
import model.Horario;
import model.HorarioJornada;
import model.Jornada;
import service.NegocioException;

@Stateless
public class Horarios implements Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "safiraPU")
	private EntityManager em;

	@Inject
	private Jornadas jornadas;

	@SuppressWarnings("unchecked")
	public List<Horario> filtrados(HorarioFilter filtro) {
		Session session = em.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Horario.class);
		return criteria.addOrder(Order.asc("horario")).list();
	}

	public Horario porId(Long id) {
		Session session = em.unwrap(Session.class);
		return (Horario) session.get(Horario.class, id);
	}

	public Horario guardar(Horario horario) {
		Horario hor = new Horario();
		try {
			Session session = em.unwrap(Session.class);
			session.getTransaction().begin();
			hor = (Horario) session.merge(horario);
			session.getTransaction().commit();
			horario = new Horario();
			return hor;
		} catch (Exception e) {
			throw new RuntimeException("Erro salvando Horario", e);
		}
	}

	@Transactional
	public void remover(Horario horarioSelecionado) {

		try {
			horarioSelecionado = porId(horarioSelecionado.getId());
			Session session = em.unwrap(Session.class);
			session.getTransaction().begin();
			session.delete(horarioSelecionado);
			session.getTransaction().commit();

		} catch (Exception e) {
			throw new NegocioException("Horario nao pode ser excluido");
		}

	}

	public List<Horario> carregarListaHorarios() {
		Session session = em.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Horario.class);
		return criteria.addOrder(Order.asc("horario")).list();
	}

	public List<HorarioJornada> carregarHorarioJornada(Long id) {
		Session session = em.unwrap(Session.class);
		return session.createQuery("from HorarioJornada where horario_id = :id order by horario_id,seq")
				.setParameter("id", id).list();
	}

	public HorarioJornada horarioJornadaporId(Long id) {
		Session session = em.unwrap(Session.class);
		return (HorarioJornada) session.createQuery("from HorarioJornada where horario_id = :id ")
				.setParameter("id", id).uniqueResult();
	}

	// apaga para depois inserir
	public void apagaJornadasHorario(Long id) {
		try {
			int seq = 1;
			Session session = em.unwrap(Session.class);
			session.getTransaction().begin();
			session.createQuery("delete from HorarioJornada where horario_id = :id").setParameter("id", id)
					.executeUpdate();
			session.getTransaction().commit();
			session.flush();
		} catch (QueryException e) {
			throw new NegocioException("Horário não pode ser excluido");
		}

	}

	public void insereJornadasHorario(Long id, List<Jornada> listaJornada) {
		try {
			int seq = 1;
			String insertSql = " insert into horario_jornada (horario_id, jornada_id, seq) "
					+ " values(:hor_id,:jor_id,:seq) ";
			Session session = em.unwrap(Session.class);
			for (Jornada lista : listaJornada) {

				session.getTransaction().begin();
				session.createSQLQuery(insertSql).setParameter("hor_id", id).setParameter("jor_id", lista.getId())
						.setParameter("seq", seq).executeUpdate();
				session.getTransaction().commit();
				session.flush();
				seq += 1;
			}
			session.flush();
		} catch (PersistenceException e) {
			throw new NegocioException("Horário Jornada não pode ser inserido");
		}

	}

}

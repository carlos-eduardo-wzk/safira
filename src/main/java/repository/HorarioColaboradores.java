package repository;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import filter.HorarioColaboradorFilter;
import model.Feriado;
import model.HorarioColaborador;
import model.HorarioColaboradorPK;
import service.NegocioException;


@Stateless
public class HorarioColaboradores implements Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "safiraPU")
	private EntityManager em;
	

	@SuppressWarnings("unchecked")
	public List<HorarioColaborador> filtrados(HorarioColaboradorFilter filtro) {
		Session session = em.unwrap(Session.class);
		Criteria criteria = session.createCriteria(HorarioColaborador.class);
		criteria.add(Restrictions.eq("colaborador", filtro.getColaboradorId()));
		return criteria.addOrder(Order.asc("colaborador")).list();
	}

	public HorarioColaborador porId(Long id) {
		Session session = em.unwrap(Session.class);
		return (HorarioColaborador) session.get(HorarioColaborador.class, id);
	}

	public HorarioColaborador guardar(HorarioColaborador horarioColaborador) {
		
		HorarioColaborador horacol = new HorarioColaborador();
		Session session = em.unwrap(Session.class);
		session.getTransaction().begin();
		horacol =   (HorarioColaborador) session.merge(horarioColaborador);
		session.getTransaction().commit();
		return horacol;		
	
		
	}

	@Transactional
	public void remover(HorarioColaborador horarioColaboradorSelecionado) {

		try {
			Session session = em.unwrap(Session.class);

			// crio pelo construtor a chave primaria
			HorarioColaboradorPK hcpk = new HorarioColaboradorPK(
					horarioColaboradorSelecionado.getColaborador(),
					horarioColaboradorSelecionado.getHorario(),
					horarioColaboradorSelecionado.getDataInicio());
			// acho o registro
			HorarioColaborador hc = (HorarioColaborador) session.get(
					HorarioColaborador.class, hcpk);
			

			session.getTransaction().begin();
			session.delete(hc);			
			session.getTransaction().commit();
			session.flush();
			
			
		} catch (PersistenceException e) {
			throw new NegocioException(
					"Horario Colaborador n�o pode ser excluido");
		}

	}

	public List<HorarioColaborador> carregarListaHorarioColaboradores(Long id) {
		System.out.println(" carregarListaHorarioColaboradores " + id);
		Session session = em.unwrap(Session.class);
		return session
				.createQuery(
						"from HorarioColaborador where Colaborador_id = :idcola ").setParameter("idcola", id)
				.list();
	}

	
	public HorarioColaborador porColaboradorHorario(Long colaid, Long horaid) {
		Session session = em.unwrap(Session.class);
		HorarioColaborador hc = (HorarioColaborador)
				 session.createQuery("from HorarioColaborador where colaborador_id = :colaborador_id and horario_id=:horario_id")
				.setParameter("colaborador_id", colaid)
				.setParameter("horario_id", horaid).uniqueResult();
		return hc;

	}	
	
	
}

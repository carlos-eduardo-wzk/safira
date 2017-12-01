package repository;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import filter.JornadaFilter;
import model.Jornada;
import service.NegocioException;

@Stateless
public class Jornadas implements Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "safiraPU")
	private EntityManager em;


	@SuppressWarnings("unchecked")
	public List<Jornada> filtrados(JornadaFilter filtro) {
		Session session = em.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Jornada.class);
		criteria.add(Restrictions.ilike("jornada", filtro.getJornada(), MatchMode.ANYWHERE));
		return criteria.addOrder(Order.asc("jornada")).list();
	}

	public Jornada porId(Long id) {
		Session session = em.unwrap(Session.class);
		return (Jornada) session.get(Jornada.class, id);
	}

	public Jornada guardar(Jornada jornada) {

		Jornada jor = new Jornada();
		Session session = em.unwrap(Session.class);
		session.getTransaction().begin();
		jor = (Jornada) session.merge(jornada);
		session.getTransaction().commit();
		session.flush();

		return jor;
	}

	@Transactional
	public void remover(Jornada jornadaSelecionado) {
		try {
			jornadaSelecionado = porId(jornadaSelecionado.getId());
			Session session = em.unwrap(Session.class);
			session.getTransaction().begin();
			session.delete(jornadaSelecionado);
			session.getTransaction().commit();
			session.flush();

		} catch (PersistenceException e) {
			throw new NegocioException("Jornada n�o pode ser excluido");
		}
	}

	public List<Jornada> porNome(String nome) {
		Session session = em.unwrap(Session.class);
		return session.createQuery("from Jornada where upper(jornada) like :nome")
				.setParameter("nome", nome.toUpperCase() + "%").list();
	}

}

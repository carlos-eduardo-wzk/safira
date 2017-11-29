package repository;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import filter.DeptoFilter;
import model.Depto;

@Stateless
public class Deptos implements Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "safiraPU")
	private EntityManager em;

	@SuppressWarnings("unchecked")
	public List<Depto> filtrados(DeptoFilter filtro) {
		Session session = em.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Depto.class);
		criteria.add(Restrictions.ilike("depto", filtro.getDepto(), MatchMode.ANYWHERE));
		return criteria.addOrder(Order.asc("depto")).list();
		
		

	}

	public Depto porId(Long id) {

		return em.find(Depto.class, id);
	}

	public Depto guardar(Depto depto) {
		try {
			em.merge(depto);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return depto;
	}

	public void remover(Depto deptoSelecionado) {

		Depto depto = null;
		depto = em.find(Depto.class, deptoSelecionado.getId());
		em.remove(depto);

	}

	public List<Depto> carregarListaDeptos() {
		Session session = em.unwrap(Session.class);
		return session.createQuery("from Depto").list();

	}

}

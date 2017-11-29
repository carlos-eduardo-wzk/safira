package repository;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import filter.FilialFilter;
import model.Filial;

@Stateless
public class Filiais implements Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "safiraPU")
	private EntityManager em;


	@SuppressWarnings("unchecked")
	public List<Filial> filtrados(FilialFilter filtro) {
		Session session = em.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Filial.class);
		criteria.add(Restrictions.ilike("filial", filtro.getFilial(),
				MatchMode.ANYWHERE));
		return criteria.addOrder(Order.asc("filial")).list();
	}

	public Filial porId(Long id) {
		return em.find(Filial.class, id);
	}

	public Filial guardar(Filial filial) {

		try {
			em.merge(filial);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return filial;
	}

	@Transactional
	public void remover(Filial filialSelecionado) {
		Filial filial = null;
		filial = em.find(Filial.class, filialSelecionado.getId());
		em.remove(filial);
	}


	public List<Filial> carregarListaFiliais() {
		Session session = em.unwrap(Session.class);
		return session.createQuery("from Filial").list();
	}		
	
}

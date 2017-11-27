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

import filter.CargoFilter;
import model.Cargo;

@Stateless
public class Cargos implements Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "safiraPU")

	private EntityManager em;

	@SuppressWarnings("unchecked")
	public List<Cargo> filtrados(CargoFilter filtro) {
		
		// Criteria criteria = session.createCriteria(Cargo.class);
		// criteria.add(Restrictions.ilike("cargo",
		// filtro.getCargo(),MatchMode.ANYWHERE));
		// return criteria.addOrder(Order.asc("cargo")).list();

		Session session = em.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Cargo.class);
		criteria.add(Restrictions.ilike("cargo", filtro.getCargo(), MatchMode.ANYWHERE));
		return criteria.addOrder(Order.asc("cargo")).list();

	}

	public Cargo porId(Long id) {
		

		// return (Cargo) session.get(Cargo.class , id);
		return em.find(Cargo.class, id);
	}

	public Cargo guardar(Cargo cargo) {
		try {
			em.merge(cargo);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return cargo;
	}

	public void remover(Cargo cargoSelecionado) {

		Cargo cargo = null;
		cargo = em.find(Cargo.class, cargoSelecionado.getId());
		em.remove(cargo);

	}

	public List<Cargo> carregarListaCargos() {
		Session session = em.unwrap(Session.class);
		return session.createQuery("from Cargo").list();

	}

}

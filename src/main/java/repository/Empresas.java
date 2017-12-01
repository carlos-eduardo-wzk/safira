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

import filter.EmpresaFilter;
import model.Empresa;

@Stateless
public class Empresas implements Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "safiraPU")
	private EntityManager em;

	@SuppressWarnings("unchecked")
	public List<Empresa> filtrados(EmpresaFilter filtro) {

		Session session = em.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Empresa.class);
		criteria.add(Restrictions.ilike("razaoSocial", filtro.getRazaoSocial(), MatchMode.ANYWHERE));
		return criteria.addOrder(Order.asc("razaoSocial")).list();

	}

	public Empresa porId(Long id) {
		Session session = em.unwrap(Session.class);
		return (Empresa) session.get(Empresa.class, id);
		// return em.find(Depto.class, id);
	}

	public Empresa guardar(Empresa empregador) {
		try {
			em.merge(empregador);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return empregador;

	}

	@Transactional
	public void remover(Empresa empregadorSelecionado) {

		Empresa emp = null;
		emp = em.find(Empresa.class, empregadorSelecionado.getId());
		em.remove(emp);

	}

	public List<Empresa> carregarListaColaboradores() {
		Session session = em.unwrap(Session.class);
		return session.createQuery("from Empresa").list();

	}

	public List<Empresa> carregarListaEmpresas() {
		Session session = em.unwrap(Session.class);
		return session.createQuery("from Empresa").list();

	}

	public Empresa porEmail(String email) {
		Session session = em.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Empresa.class);
		return (Empresa) criteria.add(Restrictions.eq("email", email)).uniqueResult();

	}

	public Empresa porPrimeiro() {
		Session session = em.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Empresa.class);
		return (Empresa) criteria.uniqueResult();

	}

}

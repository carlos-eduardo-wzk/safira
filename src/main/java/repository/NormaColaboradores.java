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
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import filter.NormaColaboradorFilter;
import model.NormaColaborador;
import model.NormaColaboradorPK;
import service.NegocioException;

@Stateless
public class NormaColaboradores implements Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "safiraPU")
	private EntityManager em;

	@SuppressWarnings("unchecked")
	public List<NormaColaborador> filtrados(NormaColaboradorFilter filtro) {
		Session session = em.unwrap(Session.class);
		Criteria criteria = session.createCriteria(NormaColaborador.class);
		criteria.add(Restrictions.eq("colaborador", filtro.getColaboradorId()));
		return criteria.addOrder(Order.asc("colaborador")).list();
	}

	public NormaColaborador porId(Long id) {
		Session session = em.unwrap(Session.class);
		return (NormaColaborador) session.get(NormaColaborador.class, id);
	}

	public NormaColaborador guardar(NormaColaborador normaColaborador) {

		NormaColaborador normac = new NormaColaborador();
		Session session = em.unwrap(Session.class);
		session.getTransaction().begin();
		normac = (NormaColaborador) session.merge(normaColaborador);
		session.getTransaction().commit();
		return normac;
	}

	@Transactional
	public void remover(NormaColaborador normaColaboradorSelecionado) {

		try {

			// crio pelo construtor a chave primaria
			NormaColaboradorPK hcpk = new NormaColaboradorPK(normaColaboradorSelecionado.getColaborador(),
					normaColaboradorSelecionado.getNorma(), normaColaboradorSelecionado.getDataInicio());
			Session session = em.unwrap(Session.class);
			// acho o registro
			NormaColaborador hc = (NormaColaborador) session.get(NormaColaborador.class, hcpk);

			session.getTransaction().begin();
			session.delete(hc);
			session.getTransaction().commit();
			session.flush();

		} catch (PersistenceException e) {
			throw new NegocioException("Norma Colaborador não pode ser excluido");
		}

	}

	public List<NormaColaborador> carregarListaNormaColaboradores(Long id) {
		Session session = em.unwrap(Session.class);
		return session.createQuery("from NormaColaborador where Colaborador_id = :idcola ").setParameter("idcola", id)
				.list();
	}

}

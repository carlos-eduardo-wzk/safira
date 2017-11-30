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

import filter.OcorrenciaFilter;
import model.Ocorrencia;
import service.NegocioException;

@Stateless
public class Ocorrencias implements Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "safiraPU")
	private EntityManager em;


	@SuppressWarnings("unchecked")
	public List<Ocorrencia> filtrados(OcorrenciaFilter filtro) {
		Session session = em.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Ocorrencia.class);
		criteria.add(Restrictions.ilike("ocorrencia", filtro.getOcorrencia(),
				MatchMode.ANYWHERE));
		return criteria.addOrder(Order.asc("ocorrencia")).list();
	}

	public Ocorrencia porId(int id) {
		Session session = em.unwrap(Session.class);
		return (Ocorrencia) session.get(Ocorrencia.class, id);
	}

	public Ocorrencia guardar(Ocorrencia ocorrencia) {
		Session session = em.unwrap(Session.class);
		Ocorrencia oc = new Ocorrencia();
		session.getTransaction().begin();
		oc = (Ocorrencia) session.merge(ocorrencia);
		session.getTransaction().commit();
		
		return oc;
	}

	@Transactional
	public void remover(Ocorrencia ocorrenciaSelecionado) {
		try {
			ocorrenciaSelecionado = porId(ocorrenciaSelecionado.getId());
			Session session = em.unwrap(Session.class);
			session.getTransaction().begin();
			session.delete(ocorrenciaSelecionado);
			session.getTransaction().commit();
			session.flush();
			
			
		} catch (PersistenceException e) {
			throw new NegocioException("Ocorrencia n�o pode ser excluido");
		}
	}

	public List<Ocorrencia> carregarListaOcorrencia() {
		Session session = em.unwrap(Session.class);
		return  (List<Ocorrencia>) session.createQuery("from Ocorrencia order by ocorrencia")
				.list();
	}

}

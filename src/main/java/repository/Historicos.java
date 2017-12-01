package repository;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.transaction.Transactional;

import model.Historico;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import service.NegocioException;
import filter.HistoricoFilter;

@Stateless
public class Historicos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "safiraPU")
	private EntityManager em;


	@SuppressWarnings("unchecked")
	public List<Historico> filtrados(HistoricoFilter filtro){
		    Session session = em.unwrap(Session.class);
			Criteria criteria = session.createCriteria(Historico.class);
			criteria.add(Restrictions.ilike("historico", filtro.getHistorico() ,MatchMode.ANYWHERE));
			return criteria.addOrder(Order.asc("historico")).list();
	}

	public Historico porId(Long id) {	
		Session session = em.unwrap(Session.class);
		return (Historico) session.get(Historico.class , id);
	}

	public Historico guardar(Historico historico) {	
		
		Historico his = new Historico();
		Session session = em.unwrap(Session.class);
		session.getTransaction().begin();
		his = (Historico) session.merge(historico);
		session.getTransaction().commit();
		
		return his;
	}


	@Transactional
	public void remover(Historico historicoSelecionado){
		try{					
		historicoSelecionado = porId(historicoSelecionado.getId());		
		Session session = em.unwrap(Session.class);
		session.getTransaction().begin();
		session.delete(historicoSelecionado);
		session.getTransaction().commit();
		session.flush();
		
		
		}
		catch (PersistenceException e) {
		   throw new NegocioException("Historico não pode ser excluido");	
		}
	}
	
	
	
	public List<Historico> carregarListaHitoricos() {
		Session session = em.unwrap(Session.class);
		return session.createQuery("from Historico")
				.list();
	}	
		
	
}

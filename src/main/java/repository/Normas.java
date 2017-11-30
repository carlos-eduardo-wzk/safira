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
import org.hibernate.exception.ConstraintViolationException;

import filter.NormaFilter;
import model.Norma;
import service.NegocioException;
import util.jsf.FacesUtil;

@Stateless
public class Normas implements Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "safiraPU")
	private EntityManager em;


	@SuppressWarnings("unchecked")
	public List<Norma> filtrados(NormaFilter filtro) {
		Session session = em.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Norma.class);
		criteria.add(Restrictions.ilike("norma", filtro.getNorma(),
				MatchMode.ANYWHERE));
		return criteria.addOrder(Order.asc("norma")).list();
	}

	public Norma porId(Long id) {
		Session session = em.unwrap(Session.class);
		  System.out.println(  (Norma) session.get(Norma.class, id));
		return (Norma) session.get(Norma.class, id);
		
	}

	
	@Transactional
	public Norma guardar(Norma norma) {	
		
		 System.out.println(norma);
		try {
			Session session = em.unwrap(Session.class);
			Norma norm = new Norma();
			session.getTransaction().begin();
			norm = (Norma) session.merge(norma);
			session.getTransaction().commit();
			
			System.out.println(norm);
			
			
			return norm;
		} catch (Exception e) {
			throw new RuntimeException("Erro salvando Norma", e);
		}
	}

	@Transactional
	public void remover(Norma normaSelecionado) throws  ConstraintViolationException {
		try {
			normaSelecionado = porId(normaSelecionado.getId());
			Session session = em.unwrap(Session.class);
			session.getTransaction().begin();
			session.delete(normaSelecionado);
			session.getTransaction().commit();
			session.flush();
		} catch (PersistenceException e) {
			throw new NegocioException("Norma não pode ser excluido");
		}catch (ConstraintViolationException ex1) {
			FacesUtil.addInfoMessage("Norma sendo usada por colaborador. Apague a norma associada ao colaborador para poder apagar norma");
			
		}
		
	}

	public List<Norma> carregarListaNormas() {
		Session session = em.unwrap(Session.class);
		return session.createQuery("from Norma").list();
	}

}

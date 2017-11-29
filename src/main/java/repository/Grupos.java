package repository;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.transaction.Transactional;

import org.hibernate.Session;

import model.Grupo;
import service.NegocioException;

@Stateless
public class Grupos implements Serializable{

	private static final long serialVersionUID = 1L;


	@PersistenceContext(unitName = "safiraPU")
	private EntityManager em;

	
	@Transactional
	public void remover(Grupo grupo){
		try{					
		grupo = porId(grupo.getId());
		Session session = em.unwrap(Session.class);
		session.getTransaction().begin();
		session.delete(grupo);
		session.getTransaction().commit();
		session.flush();
		
		}
		catch (PersistenceException e) {
		   throw new NegocioException("grupo não pode ser excluido");	
		}
	}

	public Grupo porId(Long id) {
		Session session = em.unwrap(Session.class);
		return (Grupo) session.get(Grupo.class, id);
	}

	
	public List<Grupo> carregaGrupos() {
		Session session = em.unwrap(Session.class);
		return session.createQuery("from Grupo ").list();
	}	
	
}

package repository;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;

import model.Grupo;

@Stateless
public class Grupos implements Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "safiraPU")
	private EntityManager em;

	public Grupos() {
		System.out.println("inicia grupos....");
	}

	public void remover(Grupo grupo) {

	}

	public Grupo porId(Long id) {
		System.out.println("por id " + id);
		return em.find(Grupo.class, id);

	}

	@SuppressWarnings("unchecked")
	public List<Grupo> carregaGrupos() {
		System.out.println(" carrega grupo");
		Session session = em.unwrap(Session.class);
		return session.createQuery("from Grupo ").list();

	}

}

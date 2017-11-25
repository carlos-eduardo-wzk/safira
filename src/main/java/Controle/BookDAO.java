package Controle;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Livro;


public class BookDAO {

	@PersistenceContext
	private EntityManager manager;

	public void save(Livro product) {

		
		manager.persist(product);
		manager.flush();
        
	}

}

package Controle;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import model.Livro;


public class BookDAO {

	@PersistenceContext
	private EntityManager manager;

	@Transactional
	public void save(Livro product) {

		
		manager.persist(product);
		manager.flush();
        
	}

}

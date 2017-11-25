package Controle;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import model.Livro;

@Stateful
public class BookDAO {

	@PersistenceContext(unitName = "safiraPU")
	private EntityManager manager;
	

	@Transactional
	public void salva(Livro livro) {

		manager.persist(livro);
		manager.flush();

	}

}

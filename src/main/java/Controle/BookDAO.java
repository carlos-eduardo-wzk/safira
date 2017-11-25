package Controle;

import javax.ejb.TransactionAttribute;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Livro;

public class BookDAO {

	@PersistenceContext(unitName = "safiraPU")
	private EntityManager manager;

	@TransactionAttribute
	public void salva(Livro livro) {

		manager.persist(livro);
		manager.flush();

	}

}

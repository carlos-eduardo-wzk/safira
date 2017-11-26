package controle;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Livro;

@Stateless
public class BookDAO {

	@PersistenceContext(unitName = "safiraPU")

	private EntityManager em;

	public void salva(Livro livro) {

		System.out.println("salva livro dentro com persist " + livro.getTitle());

		try {
			em.persist(livro);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

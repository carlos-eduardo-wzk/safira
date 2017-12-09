package repository;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import filter.RelogioFilter;
import model.Relogio;
import service.NegocioException;

@Stateless
public class Relogios implements Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "safiraPU")
	private Session session;

	@SuppressWarnings("unchecked")
	public List<Relogio> filtrados(RelogioFilter filtro) {
		Criteria criteria = session.createCriteria(Relogio.class);
		criteria.add(Restrictions.ilike("descricao", filtro.getDescricao(),
				MatchMode.ANYWHERE));
		return criteria.addOrder(Order.asc("descricao")).list();
	}

	public Relogio porId(Long id) {
		return (Relogio) session.get(Relogio.class, id);
	}

	public Relogio guardar(Relogio relogio) {

		Relogio rel = new Relogio();

		session.getTransaction().begin();
		rel = (Relogio) session.merge(relogio);
		session.getTransaction().commit();

		return (rel);
	}

	@Transactional
	public void remover(Relogio relogioSelecionado) {
		try {
			relogioSelecionado = porId(relogioSelecionado.getId());
			
			session.getTransaction().begin();
			session.merge(relogioSelecionado);
			session.getTransaction().commit();
			session.flush();
			
			
		} catch (PersistenceException e) {
			throw new NegocioException("Relogio não pode ser excluido");
		}
	}

	public List<Relogio> carregarListaRelogios() {
		return session.createQuery("from Relogio")
				.list();
	}

}

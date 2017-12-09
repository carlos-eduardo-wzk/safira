package repository;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;

import filter.FolgaFilter;
import model.Folga;
import service.NegocioException;

@Stateless
public class Folgas implements Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "safiraPU")

	private Session session;

	@SuppressWarnings("unchecked")
	public List<Folga> filtrados(FolgaFilter filtro) {

		Criteria criteria = session.createCriteria(Folga.class).createAlias("colaborador", "c",
				JoinType.LEFT_OUTER_JOIN);

		if (filtro.getDataini() != null) {
			criteria.add(Restrictions.ge("dataFolgaIni", filtro.getDataini()));
		}

		if (filtro.getDatafim() != null) {
			criteria.add(Restrictions.le("dataFolgaIni", filtro.getDatafim()));
		}

		if (filtro.getColaborador().isEmpty() == false) {
			criteria.add(Restrictions.ilike("c.nome", filtro.getColaborador(), MatchMode.ANYWHERE));
		}

		return criteria.list();
	}

	public Folga porId(Long id) {
		return (Folga) session.get(Folga.class, id);
	}

	public Folga guardar(Folga folga) {
		Folga fol = new Folga();
		System.out.println("Guardar folga " + folga);

		fol = (Folga) session.merge(folga);
		session.flush();

		return fol;

	}

	public void remover(Folga folgaSelecionado) {
		try {
			folgaSelecionado = porId(folgaSelecionado.getId());

			session.delete(folgaSelecionado);

			session.flush();
		} catch (PersistenceException e) {
			throw new NegocioException("Folga n�o pode ser excluido");
		}
	}

	public List<Folga> carregarListaAfastamentos() {
		return session.createQuery("from Folga").list();
	}

}

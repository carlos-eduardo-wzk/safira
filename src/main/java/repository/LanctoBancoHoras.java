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

import filter.LanctoBancoHoraFilter;
import model.LanctoBancoHora;
import service.NegocioException;

@Stateless
public class LanctoBancoHoras implements Serializable {
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "safiraPU")

	private Session session;

	@SuppressWarnings("unchecked")
	public List<LanctoBancoHora> filtrados(LanctoBancoHoraFilter filtro) {
		Criteria criteria = session.createCriteria(LanctoBancoHora.class).createAlias("colaborador", "c",
				JoinType.LEFT_OUTER_JOIN);

		// campos da classe e nao da tabela

		if (filtro.getDataini() != null) {
			criteria.add(Restrictions.ge("data", filtro.getDataini()));
		}

		if (filtro.getDataini() != null) {
			criteria.add(Restrictions.le("data", filtro.getDatafim()));
		}

		if (filtro.getColaborador().isEmpty() == false) {
			criteria.add(Restrictions.ilike("c.nome", filtro.getColaborador(), MatchMode.ANYWHERE));
		}

		return criteria.list();
	}

	public LanctoBancoHora porId(Long id) {
		return (LanctoBancoHora) session.get(LanctoBancoHora.class, id);
	}

	public LanctoBancoHora guardar(LanctoBancoHora lancto) {

		LanctoBancoHora lanctoret = new LanctoBancoHora();

		lanctoret = (LanctoBancoHora) session.merge(lancto);

		return lanctoret;
	}

	public void remover(LanctoBancoHora lanctoSelecionado) {
		try {
			lanctoSelecionado = porId(lanctoSelecionado.getId());

			session.delete(lanctoSelecionado);
			session.flush();

		} catch (PersistenceException e) {
			throw new NegocioException("Lancto Banco Horas não pode ser excluido");
		}

	}

}

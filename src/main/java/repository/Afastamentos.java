package repository;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;

import filter.AfastamentoFilter;
import model.Afastamento;
import service.NegocioException;
import util.jsf.FacesUtil;

@Stateless
public class Afastamentos implements Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "safiraPU")

	private Session session;

	@SuppressWarnings("unchecked")
	public List<Afastamento> filtrados(AfastamentoFilter filtro) {
		Criteria criteria = session.createCriteria(Afastamento.class)
				.createAlias("motivoAfastamento", "m", JoinType.LEFT_OUTER_JOIN)
				.createAlias("colaborador", "c", JoinType.LEFT_OUTER_JOIN);

		// campos da classe e nao da tabela

		if (filtro.getMotivoAfastamento().isEmpty() == false) {
			criteria.add(Restrictions.ilike("m.motivoAfastamento", filtro.getMotivoAfastamento(), MatchMode.ANYWHERE));
		}

		if (filtro.getDataini() != null) {
			criteria.add(Restrictions.ge("dataAfastamentoIni", filtro.getDataini()));
		}

		if (filtro.getDatafim() != null) {
			criteria.add(Restrictions.le("dataAfastamentoIni", filtro.getDatafim()));
		}

		if (filtro.getColaborador().isEmpty() == false) {
			criteria.add(Restrictions.ilike("c.nome", filtro.getColaborador(), MatchMode.ANYWHERE));
		}

		return criteria.list();
	}

	public Afastamento porId(Long id) {
		return (Afastamento) session.get(Afastamento.class, id);
	}

	@Transactional
	public Afastamento guardar(Afastamento afastamento) {
		FacesUtil.addInfoMessage("Cadastrado com sucesso");

		Afastamento afa = new Afastamento();

		session.getTransaction().begin();
		afa = (Afastamento) session.merge(afastamento);
		session.getTransaction().commit();
		session.flush();

		return afa;
	}

	@Transactional
	public void remover(Afastamento afastamentoSelecionado) {
		try {
			afastamentoSelecionado = porId(afastamentoSelecionado.getId());

			session.getTransaction().begin();
			session.delete(afastamentoSelecionado);
			session.getTransaction().commit();
			session.flush();

		} catch (PersistenceException e) {
			throw new NegocioException("Afastamento não pode ser excluido");
		}
	}

	public List<Afastamento> carregarListaAfastamentos() {
		return session.createQuery("from Afastamento").list();
	}

	public Boolean estaAfastadoPorMatriculaDia(String pis, Date dia) {

		try {
			String jpql = "select a from Afastamento a inner join fetch a.colaborador where  a.colaborador.pis = :colaborador_id  "
					+ "  and (a.dataAfastamentoIni <= :dia and a.dataAfastamentoFim >= :dia )  ";
			Afastamento resultado = (Afastamento) session.createQuery(jpql).setParameter("pis", pis)
					.setParameter("dia", dia).uniqueResult();
			return true;

		} catch (NoResultException nre) {
			return false;
		}

	}

}

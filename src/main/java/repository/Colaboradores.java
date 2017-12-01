package repository;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.transaction.Transactional;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;

import filter.ColaboradorFilter;
import model.Colaborador;
import service.NegocioException;

@Stateless
public class Colaboradores implements Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "safiraPU")
	private EntityManager em;

	private Criteria CriarCriteriaParaFiltro(ColaboradorFilter filtro) {
		Session session = em.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Colaborador.class)
				.createAlias("filial", "f", JoinType.LEFT_OUTER_JOIN)
				.createAlias("depto", "d", JoinType.LEFT_OUTER_JOIN)
				.createAlias("empresa", "e", JoinType.LEFT_OUTER_JOIN);

		if (StringUtils.isNotBlank(filtro.getNome())) {
			criteria.add(Restrictions.ilike("nome", filtro.getNome(),
					MatchMode.ANYWHERE));
		}

		if (StringUtils.isNotBlank(filtro.getEmpresa())) {
			System.out.println("filtro empresa " + filtro.getEmpresa());
			criteria.add(Restrictions.ilike("e.razaoSocial",
					filtro.getEmpresa(), MatchMode.ANYWHERE));
		}

		if (StringUtils.isNotBlank(filtro.getFlial())) {
			System.out.println("filtro filial " + filtro.getFlial());
			criteria.add(Restrictions.ilike("f.filial", filtro.getFlial(),
					MatchMode.ANYWHERE));
		}

		if (StringUtils.isNotBlank(filtro.getDepto())) {
			System.out.println("filtro depto " + filtro.getDepto());
			criteria.add(Restrictions.ilike("d.depto", filtro.getDepto(),
					MatchMode.ANYWHERE));
		}

		if (filtro.getDataAdm() != null) {
			criteria.add(Restrictions.eq("dataAdmissao", filtro.getDataAdm()));
		}

		if ( ( StringUtils.isNotBlank(filtro.getPis()  ) )) {
			criteria.add(Restrictions.eq("pis", filtro.getPis()));
		}

		
		return criteria;
	}

	@SuppressWarnings("unchecked")
	public List<Colaborador> filtrados(ColaboradorFilter filtro) {
		Criteria criteria = CriarCriteriaParaFiltro(filtro);

		criteria.setFirstResult(filtro.getPrimeiroRegistro());
		criteria.setMaxResults(filtro.getQuantidadeRegistros());

		if (filtro.isAscendente() && filtro.getPropriedadeOrdenacao() != null) {
			criteria.addOrder(Order.asc(filtro.getPropriedadeOrdenacao()));
		} else if (filtro.getPropriedadeOrdenacao() != null) {
			criteria.addOrder(Order.desc(filtro.getPropriedadeOrdenacao()));
		}

		return criteria.list();
	}

	public int quantidadesFiltrados(ColaboradorFilter filtro) {
		Criteria criteria = CriarCriteriaParaFiltro(filtro);
		criteria.setProjection(Projections.rowCount());

		return ((Number) criteria.uniqueResult()).intValue();
	}

	public Colaborador porId(Long id) {
		Session session = em.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Colaborador.class)
				.createAlias("filial", "f", JoinType.LEFT_OUTER_JOIN)
				.createAlias("depto", "d", JoinType.LEFT_OUTER_JOIN)
				.createAlias("empresa", "e", JoinType.LEFT_OUTER_JOIN)
				.createAlias("cargo", "c", JoinType.LEFT_OUTER_JOIN);
		criteria.add(Restrictions.eq("id", id));

		return (Colaborador) criteria.uniqueResult();

	}

	public Colaborador guardar(Colaborador colaborador) {

		Colaborador cola = new Colaborador();
		Session session = em.unwrap(Session.class);

		session.getTransaction().begin();
		cola = (Colaborador) session.merge(colaborador);
		session.getTransaction().commit();

		return cola;

	}

	@Transactional
	public void remover(Colaborador colaboradorSelecionado) {
		try {
			colaboradorSelecionado = porId(colaboradorSelecionado.getId());
			Session session = em.unwrap(Session.class);

			session.getTransaction().begin();
			session.delete(colaboradorSelecionado);
			session.getTransaction().commit();
			session.flush();

		} catch (PersistenceException e) {
			throw new NegocioException("Colaborador não pode ser excluido");
		}
	}

	public List<Colaborador> porNome(String nome) {
		Session session = em.unwrap(Session.class);
		return session
				.createQuery(
						"from Colaborador " + "where upper(nome) like :nome")
				.setParameter("nome", "%" + nome.toUpperCase() + "%").list();
	}

	public List<Colaborador> porMatricula(String mat) {
		Session session = em.unwrap(Session.class);
		return session
				.createQuery(
						"from Colaborador "
								+ "where upper(matricula) like :mat")
				.setParameter("mat", "%" + mat + "%").list();
	}

	public List<Colaborador> porPis2(String pis) {
		Session session = em.unwrap(Session.class);
		return session
				.createQuery("from Colaborador " + "where upper(pis) like :pis")
				.setParameter("pis", "%" + pis.toUpperCase() + "%").list();
	}

	public Colaborador porPIS(String pis) {
		Session session = em.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Colaborador.class)
				.createAlias("filial", "f", JoinType.LEFT_OUTER_JOIN)
				.createAlias("depto", "d", JoinType.LEFT_OUTER_JOIN)
				.createAlias("empresa", "e", JoinType.LEFT_OUTER_JOIN)
				.createAlias("cargo", "c", JoinType.LEFT_OUTER_JOIN);
		criteria.add(Restrictions.eq("pis", pis));
		return (Colaborador) criteria.uniqueResult();
	}

	public List<Colaborador> findAll() {
		Session session = em.unwrap(Session.class);
		return (List<Colaborador>) session.createQuery("from Colaborador")
				.list();

	}

}

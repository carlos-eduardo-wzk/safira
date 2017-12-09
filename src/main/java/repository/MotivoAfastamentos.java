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

import filter.MotivoAfastamentoFilter;
import model.MotivoAfastamento;
import service.NegocioException;

@Stateless
public class MotivoAfastamentos implements Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "safiraPU")

	private Session session;

	@SuppressWarnings("unchecked")
	public List<MotivoAfastamento> filtrados(MotivoAfastamentoFilter filtro) {
		Criteria criteria = session.createCriteria(MotivoAfastamento.class);
		criteria.add(Restrictions.ilike("motivoAfastamento", filtro.getMotivoAfastamento(), MatchMode.ANYWHERE));
		return criteria.addOrder(Order.asc("motivoAfastamento")).list();
	}

	public MotivoAfastamento porId(Long id) {
		return (MotivoAfastamento) session.get(MotivoAfastamento.class, id);
	}

	public MotivoAfastamento guardar(MotivoAfastamento motivoAfastamento) {

		MotivoAfastamento mota = new MotivoAfastamento();

		session.getTransaction().begin();
		mota = (MotivoAfastamento) session.merge(motivoAfastamento);
		session.getTransaction().commit();

		return mota;
	}

	@Transactional
	public void remover(MotivoAfastamento motivoAfatamentoSelecionado) {
		try {
			motivoAfatamentoSelecionado = porId(motivoAfatamentoSelecionado.getId());

			session.getTransaction().begin();
			session.delete(motivoAfatamentoSelecionado);
			session.getTransaction().commit();
			session.flush();

		} catch (PersistenceException e) {
			throw new NegocioException("Afastamento n�o pode ser excluido");
		}
	}

	public List<MotivoAfastamento> carregarListaMotivoAfastamento() {
		return session.createQuery("from MotivoAfastamento").list();

	}

}

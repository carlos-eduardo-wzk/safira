package repository;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import filter.FeriadoFilter;
import model.Log;

@Stateless
public class Logs implements Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "safiraPU")
	private Session session;

	@SuppressWarnings("unchecked")
	public List<Log> filtrados(FeriadoFilter filtro) {
		Criteria criteria = session.createCriteria(Log.class);

		return criteria.addOrder(Order.asc("acao")).list();
	}

	public Log porId(Long id) {
		return (Log) session.get(Log.class, id);
	}

	public Log porData(Date d) {

		Log fer = (Log) session.createQuery("from Log where dataLog = :data ").setParameter("data", d).uniqueResult();
		return fer;

	}

	public Log guardar(Log log) {

		try {
			
			log = (Log) session.merge(log);
			return log;
		} catch (Exception e) {
			throw new RuntimeException("Erro salvando Log", e);
		}
	}

	@Transactional
	public void remover(Log logSelecionado) {
		try {
			// acho o registro
			Log log = (Log) session.get(Log.class, logSelecionado.getDataLog());

			session.delete(log);
			session.flush();

		} catch (PersistenceException e) {

		}

	}

}

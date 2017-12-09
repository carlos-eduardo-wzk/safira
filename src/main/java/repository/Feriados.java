package repository;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import filter.FeriadoFilter;
import model.Feriado;
import model.Log;

@Stateless
public class Feriados implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "safiraPU")
	private Session session;

	@Inject
	private Logs logs;

	@SuppressWarnings("unchecked")
	public List<Feriado> filtrados(FeriadoFilter filtro) {
		Criteria criteria = session.createCriteria(Feriado.class);

		return criteria.addOrder(Order.asc("feriado")).list();
	}

	public Feriado porId(Long id) {
		return (Feriado) session.get(Feriado.class, id);
	}

	public Feriado porData(Date d) {
		Feriado fer = (Feriado) session
				.createQuery("from Feriado where dataFeriado = :data ")
				.setParameter("data", d).uniqueResult();
		return fer;

	}

	public Feriado guardar(Feriado feriado) {
		Feriado fer = new Feriado();

		try {
			
			fer = (Feriado) session.merge(feriado);
			

			String username;
			username = (String) FacesContext.getCurrentInstance()
					.getExternalContext().getSessionMap().get("username");

			Log log = new Log();
			log.setDataLog(new Date());
			log.setAcao("salvar feriado");
			log.setUsuario(username);

			if (feriado.getEmpresa() == null) {
				log.setDetalhe("Inserido : Data " + feriado.getDataFeriado()
						+ " - " + "Feriado :" + feriado.getFeriado());

			} else {
				log.setDetalhe("Alterado : Data " + feriado.getDataFeriado()
						+ " - " + "Feriado :" + feriado.getFeriado());

			}

			logs.guardar(log);

			return fer;
		} catch (Exception e) {
			throw new RuntimeException("Erro salvando Feriado", e);
		}
	}

	public Feriado porDataEmpresa(Date d, Long e) {
		Feriado fer = (Feriado)
				 session.createQuery("from Feriado where dataFeriado = :data and empresa_id=:emp")
				.setParameter("data", d).setParameter("emp", e).uniqueResult();
		return fer;

	}	
	
	
	public void remover(Feriado feriadoSelecionado) {

		try {

			//feriadoSelecionado = porId(feriadoSelecionado.getId());
			feriadoSelecionado = porDataEmpresa(feriadoSelecionado.getDataFeriado(),feriadoSelecionado.getEmpresa().getId());

			
			session.delete(feriadoSelecionado);
			session.flush();

			String username;
			username = (String) FacesContext.getCurrentInstance()
					.getExternalContext().getSessionMap().get("username");

			Log log = new Log();
			log.setDataLog(new Date());
			log.setAcao("Deleta feriado");
			log.setUsuario(username);

			log.setDetalhe("Deleta : Data "
					+ feriadoSelecionado.getDataFeriado() + " - " + "Feriado :"
					+ feriadoSelecionado.getFeriado());

			logs.guardar(log);

		} catch (PersistenceException e) {

		}

	}



}

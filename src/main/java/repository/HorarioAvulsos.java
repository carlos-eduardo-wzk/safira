package repository;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.transaction.Transactional;

import model.Colaborador;
import model.Feriado;
import model.HorarioAvulso;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;

import service.NegocioException;
import util.jsf.FacesUtil;
import filter.HorarioAvulsoFilter;

@Stateless
public class HorarioAvulsos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "safiraPU")

	private Session session;	

	@SuppressWarnings("unchecked")
	public List<HorarioAvulso> filtrados(HorarioAvulsoFilter filtro){			
			Criteria criteria = session.createCriteria(HorarioAvulso.class)
					.createAlias("horario", "h", JoinType.LEFT_OUTER_JOIN)
 			        .createAlias("colaborador", "c", JoinType.LEFT_OUTER_JOIN);

			// campos da classe e nao da tabela			
			if (filtro.getHorario().isEmpty()==false){
			   criteria.add(Restrictions.ilike("h.horario", filtro.getHorario(),MatchMode.ANYWHERE));
			}

						
			if (filtro.getDataini() != null) {
				criteria.add(Restrictions.ge("dataAfastamentoIni",
						filtro.getDataini()));
			}
			
			if (filtro.getDatafim() != null) {
				criteria.add(Restrictions.le("dataAfastamentoIni",
						filtro.getDatafim()));
			}

			
			if (filtro.getColaborador().isEmpty()==false){
				   criteria.add(Restrictions.ilike("c.nome", filtro.getColaborador(),MatchMode.ANYWHERE));
				}
						
			return criteria.list();
	}

	public HorarioAvulso porId(Long id) {		
		return (HorarioAvulso) session.get(HorarioAvulso.class , id);
	}
  

	public HorarioAvulso guardar(HorarioAvulso horarioAvulso) {
		FacesUtil.addInfoMessage("Cadastrado com sucesso");
		
		HorarioAvulso horaa = new HorarioAvulso();
		
	
		horaa = (HorarioAvulso) session.merge(horarioAvulso);
		
			
		return horaa;
	}



	public void remover(HorarioAvulso horarioAvulsoSelecionado){
		try{					
		horarioAvulsoSelecionado = porId(horarioAvulsoSelecionado.getId());		
		
		
		session.delete(horarioAvulsoSelecionado);
		session.flush();
		
		
		}
		catch (PersistenceException e) {
		   throw new NegocioException("Hoarrio avulso n�o pode ser excluido");	
		}
	}
	
	public List<HorarioAvulso> carregarListaHorarioAvulsos() {
		return session.createQuery("from HorarioAvulso")
				.list();
	}	
	
	public HorarioAvulso porDataCola( java.util.Date date, Colaborador cola) {
		HorarioAvulso hav = (HorarioAvulso)
				 session.createQuery("from HorarioAvulso where data_horario_inicial = :data and colaborador_id=:cola")
				.setParameter("data", date).setParameter("cola", cola).uniqueResult();
		return hav;
		
	}
	
}

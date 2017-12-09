package repository;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.transaction.Transactional;

import model.MotivoAbono;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import service.NegocioException;
import filter.MotivoAbonoFilter;

@Stateless
public class MotivoAbonos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "safiraPU")
	

	private Session session;	

	@SuppressWarnings("unchecked")
	public List<MotivoAbono> filtrados(MotivoAbonoFilter filtro){
			Criteria criteria = session.createCriteria(MotivoAbono.class);
			criteria.add(Restrictions.ilike("motivoAbono", filtro.getMotivoAbono(),MatchMode.ANYWHERE));
			return criteria.addOrder(Order.asc("motivoAbono")).list();
	}

	public MotivoAbono porId(Long id) {		
		return (MotivoAbono) session.get(MotivoAbono.class , id);
	}

	public MotivoAbono guardar(MotivoAbono motivoAbono) {	
		
		MotivoAbono mota = new MotivoAbono();
		
		session.getTransaction().begin();
		mota = (MotivoAbono) session.merge(motivoAbono);
		session.getTransaction().commit();
		session.flush();
		
		return mota;
	}


	@Transactional
	public void remover(MotivoAbono motivoAbonoSelecionado){
		try{					
		motivoAbonoSelecionado = porId(motivoAbonoSelecionado.getId());		

		session.getTransaction().begin();
		session.delete(motivoAbonoSelecionado);
		session.getTransaction().commit();
		session.flush();
		
		}
		catch (PersistenceException e) {
		   throw new NegocioException("Cargo n�o pode ser excluido");	
		}
	}
	

  
	
}

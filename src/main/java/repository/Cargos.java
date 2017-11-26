package repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import filter.CargoFilter;
import model.Cargo;
import service.NegocioException;

public class Cargos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "safiraPU")

	private EntityManager em;
	
	
	@SuppressWarnings("unchecked")
	public List<Cargo> filtrados(CargoFilter filtro){
		 System.out.println("filtrados cargos");
			//Criteria criteria = session.createCriteria(Cargo.class);
			//criteria.add(Restrictions.ilike("cargo", filtro.getCargo(),MatchMode.ANYWHERE));
			//return criteria.addOrder(Order.asc("cargo")).list();
		 return null;
	}

	public Cargo porId(Long id) {		
		
		//return (Cargo) session.get(Cargo.class , id);
		return em.find(Cargo.class, id) ;
	}

	public Cargo guardar(Cargo cargo) {		
		try {
			em.persist(cargo);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return cargo;
	}



	public void remover(Cargo cargoSelecionado){
		try{					
			em.remove(cargoSelecionado);

		}
		catch (PersistenceException e) {
		   throw new NegocioException("Cargo não pode ser excluido");	
		}
	}
	
	public List<Cargo> carregarListaCargos() {
		//return session.createQuery("from Cargo")
		//		.list();
		return null ;
		
	}	
	
	
}

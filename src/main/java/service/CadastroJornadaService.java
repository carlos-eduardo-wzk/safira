package service;

import java.io.Serializable;

import javax.inject.Inject;
import javax.transaction.Transactional;

import model.Jornada;
import repository.Jornadas;

public class CadastroJornadaService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private Jornadas jornadas;
	
	@Transactional
	public Jornada salvar(Jornada jornada){
		
		if (jornada.getTole1ant()==null){
			jornada.setTole1ant(0);
		}
		if (jornada.getTols1ant()==null){
			jornada.setTols1ant(0);
		}
		
		if (jornada.getTole2ant()==null){
			jornada.setTole2ant(0);
		}
		if (jornada.getTols2ant()==null){
			jornada.setTols2ant(0);
		}

		if (jornada.getTole3ant()==null){
			jornada.setTole3ant(0);
		}
		if (jornada.getTols3ant()==null){
			jornada.setTols3ant(0);
		}

		if (jornada.getTole4ant()==null){
			jornada.setTole4ant(0);
		}
		if (jornada.getTols4ant()==null){
			jornada.setTols4ant(0);
		}
		
		if (jornada.getTole5ant()==null){
			jornada.setTole5ant(0);
		}
		if (jornada.getTols5ant()==null){
			jornada.setTols5ant(0);
		}
		
		if (jornada.getTole6ant()==null){
			jornada.setTole6ant(0);
		}
		if (jornada.getTols6ant()==null){
			jornada.setTols6ant(0);
		}
		
		if (jornada.getTole7ant()==null){
			jornada.setTole7ant(0);
		}
		if (jornada.getTols7ant()==null){
			jornada.setTols7ant(0);
		}
		
		if (jornada.getTole8ant()==null){
			jornada.setTole8ant(0);
		}
		if (jornada.getTols8ant()==null){
			jornada.setTols8ant(0);
		}
		
		if (jornada.getTole1dep()==null){
			jornada.setTole1dep(0);
		}
		if (jornada.getTols1dep()==null){
			jornada.setTols1dep(0);
		}		
		
		if (jornada.getTole2dep()==null){
			jornada.setTole2dep(0);
		}
		if (jornada.getTols2dep()==null){
			jornada.setTols2dep(0);
		}		
		
		if (jornada.getTole3dep()==null){
			jornada.setTole3dep(0);
		}
		if (jornada.getTols3dep()==null){
			jornada.setTols3dep(0);
		}		
		
		if (jornada.getTole4dep()==null){
			jornada.setTole4dep(0);
		}
		if (jornada.getTols4dep()==null){
			jornada.setTols4dep(0);
		}		
		
		if (jornada.getTole5dep()==null){
			jornada.setTole5dep(0);
		}
		if (jornada.getTols6dep()==null){
			jornada.setTols6dep(0);
		}		
		
		if (jornada.getTole7dep()==null){
			jornada.setTole7dep(0);
		}
		if (jornada.getTols7dep()==null){
			jornada.setTols7dep(0);
		}		
		
		if (jornada.getTole8dep()==null){
			jornada.setTole8dep(0);
		}
		if (jornada.getTols8dep()==null){
			jornada.setTols8dep(0);
		}		
		return jornadas.guardar(jornada);
	}

	public void excluir(Jornada jornadaSelecionado) {
		jornadas.remover(jornadaSelecionado);
		
	}


}	
	
	
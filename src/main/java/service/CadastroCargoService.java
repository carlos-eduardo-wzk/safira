package service;

import java.io.Serializable;

import javax.inject.Inject;
import javax.transaction.Transactional;

import model.Cargo;
import repository.Cargos;

public class CadastroCargoService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private Cargos cargos;
	
	@Transactional
	public Cargo salvar(Cargo cargo){
		return cargos.guardar(cargo);
	}

	public void excluir(Cargo cargoSelecionado) {
		cargos.remover(cargoSelecionado);
		
	}


}	
	
	
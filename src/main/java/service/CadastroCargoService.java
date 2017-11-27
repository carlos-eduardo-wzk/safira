package service;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import model.Cargo;
import repository.Cargos;

@ManagedBean
@ViewScoped
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

	public Cargo achaCargo(Cargo cargo) {
		return cargos.porId(cargo.getId());
	}

	
	
}	
	
	
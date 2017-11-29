package service;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import model.Depto;
import repository.Deptos;

@ManagedBean
@ViewScoped
public class CadastroDeptoService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private Deptos deptos;
	
	@Transactional
	public Depto salvar(Depto depto){
		return deptos.guardar(depto);
	}

	public void excluir(Depto deptoSelecionado) {
		deptos.remover(deptoSelecionado);
		
	}

	public Depto achaDeptoo(Depto depto) {
		return deptos.porId(depto.getId());
	}

	
}	
	
	
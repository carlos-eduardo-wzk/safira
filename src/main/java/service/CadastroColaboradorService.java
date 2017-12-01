package service;

import java.io.Serializable;

import javax.inject.Inject;
import javax.transaction.Transactional;

import model.Colaborador;
import repository.Colaboradores;

public class CadastroColaboradorService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private Colaboradores colaboradores;
	
	@Transactional
	public Colaborador salvar(Colaborador colaborador){
		return colaboradores.guardar(colaborador);
	}

	public void excluir(Colaborador colaboradorSelecionado) {
		colaboradores.remover(colaboradorSelecionado);
		
	}


}	
	
	
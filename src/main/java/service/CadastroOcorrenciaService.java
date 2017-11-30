package service;

import java.io.Serializable;

import javax.inject.Inject;
import javax.transaction.Transactional;

import model.Ocorrencia;
import repository.Ocorrencias;

public class CadastroOcorrenciaService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private Ocorrencias ocorrencias;
	
	@Transactional
	public Ocorrencia salvar(Ocorrencia ocorrencia){
		return ocorrencias.guardar(ocorrencia);
	}

	public void excluir(Ocorrencia ocorrenciaSelecionado) {
		ocorrencias.remover(ocorrenciaSelecionado);
		
	}


}	
	
	
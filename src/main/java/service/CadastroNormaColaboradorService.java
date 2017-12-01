package service;

import java.io.Serializable;

import javax.inject.Inject;
import javax.transaction.Transactional;

import model.NormaColaborador;
import repository.NormaColaboradores;
import util.jsf.FacesUtil;

public class CadastroNormaColaboradorService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private NormaColaboradores normaColaboradores;
	
	@Transactional
	public NormaColaborador salvar(NormaColaborador normaColaborador){
		return normaColaboradores.guardar(normaColaborador);
	}

	public void excluir(NormaColaborador normaColaborador) {
		normaColaboradores.remover(normaColaborador);		
		FacesUtil.addInfoMessage("norma colaborador excluido.");		
								
	}

}

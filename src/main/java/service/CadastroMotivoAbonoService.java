package service;

import java.io.Serializable;

import javax.inject.Inject;
import javax.transaction.Transactional;

import model.MotivoAbono;
import repository.MotivoAbonos;

public class CadastroMotivoAbonoService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private MotivoAbonos motivoAbonos;
	
	@Transactional
	public MotivoAbono salvar(MotivoAbono motivoAbono){
		return motivoAbonos.guardar(motivoAbono);
	}

	public void excluir(MotivoAbono motivoAbonoSelecionado) {
		motivoAbonos.remover(motivoAbonoSelecionado);
		
	}


}	
	
	
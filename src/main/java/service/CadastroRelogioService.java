package service;

import java.io.Serializable;

import javax.inject.Inject;
import javax.transaction.Transactional;

import model.Relogio;
import repository.Relogios;

public class CadastroRelogioService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Relogios relogios;

	
	public Relogio salvar(Relogio relogio) {
		return relogios.guardar(relogio);
	}

	public void excluir(Relogio relogioSelecionado) {
		relogios.remover(relogioSelecionado);

	}

}

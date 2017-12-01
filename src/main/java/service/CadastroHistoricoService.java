package service;

import java.io.Serializable;

import javax.inject.Inject;
import javax.transaction.Transactional;

import model.Historico;
import repository.Historicos;

public class CadastroHistoricoService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Historicos historicos;

	@Transactional
	public Historico salvar(Historico historico) {
		System.out.println("salvar service");
		return historicos.guardar(historico);
	}

	public void excluir(Historico historicoSelecionado) {
		historicos.remover(historicoSelecionado);

	}

}

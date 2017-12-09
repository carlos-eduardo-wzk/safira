package service;

import java.io.Serializable;

import javax.inject.Inject;
import javax.transaction.Transactional;

import model.Feriado;
import repository.Feriados;

public class CadastroFeriadoService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Feriados feriados;

	@Transactional
	public Feriado salvar(Feriado feriado) {
		return feriados.guardar(feriado);
	}

	public void excluir(Feriado feriadoSelecionado) {
		feriados.remover(feriadoSelecionado);

	}

}

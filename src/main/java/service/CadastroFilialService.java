package service;

import java.io.Serializable;

import javax.inject.Inject;
import javax.transaction.Transactional;

import model.Filial;
import repository.Filiais;

public class CadastroFilialService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Filiais filiais;

	@Transactional
	public Filial salvar(Filial filial) {
		return filiais.guardar(filial);
	}

	public void excluir(Filial filialSelecionado) {
		filiais.remover(filialSelecionado);

	}

}

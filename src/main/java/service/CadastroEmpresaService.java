package service;

import java.io.Serializable;

import javax.inject.Inject;
import javax.transaction.Transactional;

import model.Empresa;
import repository.Empresas;

public class CadastroEmpresaService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Empresas empresas;

	@Transactional
	public Empresa salvar(Empresa empresa) {
		return empresas.guardar(empresa);
	}

	public void excluir(Empresa empresaSelecionado) {
		empresas.remover(empresaSelecionado);

	}

}

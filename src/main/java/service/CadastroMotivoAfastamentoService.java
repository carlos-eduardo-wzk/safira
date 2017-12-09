package service;

import java.io.Serializable;

import javax.inject.Inject;
import javax.transaction.Transactional;

import model.MotivoAfastamento;
import repository.MotivoAfastamentos;

public class CadastroMotivoAfastamentoService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private MotivoAfastamentos motivoAfastamentos;

	@Transactional
	public MotivoAfastamento salvar(MotivoAfastamento motivoAfastamento) {
		return motivoAfastamentos.guardar(motivoAfastamento);
	}

	public void excluir(MotivoAfastamento motivoAfastamentoSelecionado) {
		motivoAfastamentos.remover(motivoAfastamentoSelecionado);

	}

}

package service;

import java.io.Serializable;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.hibernate.exception.ConstraintViolationException;

import model.Norma;
import repository.Normas;

public class CadastroNormaService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private Normas normas;
	
	
	public Norma salvar(Norma norma) {
		return normas.guardar(norma);
	}

	public void excluir(Norma normaSelecionado) {
		normas.remover(normaSelecionado);
		
	}


}	
	
	
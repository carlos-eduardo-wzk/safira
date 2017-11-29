package service;

import java.io.Serializable;

import javax.inject.Inject;
import javax.transaction.Transactional;

import model.Usuario;
import repository.Usuarios;

public class CadastroUsuarioService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Usuarios usuarios;

	@Transactional
	public Usuario salvar(Usuario usuario) {
		return usuarios.guardar(usuario);
	}

}

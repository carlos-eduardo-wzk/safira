package controle;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Usuario;
import repository.Usuarios;
import util.jsf.FacesUtil;
import filter.UsuarioFilter;



@Named
@ViewScoped
public class PesquisaUsuarioBean implements Serializable{

	
	private static final long serialVersionUID = 1L;

	
	@Inject
	private Usuarios usuarios;	
	
	private UsuarioFilter filtro;
	private List<Usuario> usuarioFiltrados;	
	private Usuario usuarioSelecionado;
	
	
	public PesquisaUsuarioBean() {
		filtro = new UsuarioFilter();
	}

	public UsuarioFilter getFiltro() {
		return filtro;
	}

	public void pesquisar() {
		System.out.println("pesquisar" + filtro.getNome() );
		usuarioFiltrados = usuarios.filtrados(filtro);
	}
				
	
	public void setFiltro(UsuarioFilter filtro) {
		this.filtro = filtro;
	}


	public void setUsuarioFiltrados(List<Usuario> usuarioFiltrados) {
		this.usuarioFiltrados = usuarioFiltrados;
	}

	public Usuarios getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario getUsuarioSelecionado() {
		return usuarioSelecionado;
	}

	public void setUsuarioSelecionado(Usuario usuarioSelecionado) {
		this.usuarioSelecionado = usuarioSelecionado;
	}

	public List<Usuario> getUsuarioFiltrados() {
		return usuarioFiltrados;
	}

	public void excluir() {
		usuarios.remover(usuarioSelecionado);
		usuarioFiltrados.remove(usuarioSelecionado);
		
		FacesUtil.addInfoMessage("Usuario " + usuarioSelecionado.getNome() 
				+ " excluído com sucesso.");
	}
  
}

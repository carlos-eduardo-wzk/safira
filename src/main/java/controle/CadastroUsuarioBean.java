package controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import model.Grupo;
import model.Usuario;
import repository.Grupos;
import service.CadastroUsuarioService;
import util.jsf.FacesUtil;


@ManagedBean
@ViewScoped
public class CadastroUsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private Usuario usuario;
	private Grupo grupo;
	private List<Grupo> lstGrupos = new ArrayList<>();
	private Grupo grupoSelecionado;
	

	
	@Inject
	private CadastroUsuarioService cadastroUsuarioService;
	
	@Inject
	private Grupos repGrupos;
	
	

			
	public CadastroUsuarioBean() {
		limpar();		
	}
	
	public void inicializar() {						
	if (FacesUtil.isNotPostback()) {
		lstGrupos = repGrupos.carregaGrupos();
		}
	}
		
	private void limpar() {
		usuario = new Usuario();
	}
	
	public boolean isEditando() {
		return this.usuario.getId() != null;
	}
	
		
	public void salvar() {
		this.usuario =  cadastroUsuarioService.salvar(this.usuario);
		limpar();		
		FacesUtil.addInfoMessage("Usuario salvo com sucesso!");
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public CadastroUsuarioService getCadastroUsuarioService() {
		return cadastroUsuarioService;
	}

	public void setCadastroUsuarioService(
			CadastroUsuarioService cadastroUsuarioService) {
		this.cadastroUsuarioService = cadastroUsuarioService;
	}


	public List<Grupo> getLstGrupos() {
		return lstGrupos;
	}

	public void setLstGrupos(List<Grupo> lstGrupos) {
		this.lstGrupos = lstGrupos;
	}

	public Grupos getRepGrupos() {
		return repGrupos;
	}

	public void setRepGrupos(Grupos repGrupos) {
		this.repGrupos = repGrupos;
	}

	public void adicionaGrupo(){
		 System.out.println("adiciona grupo");
		 usuario.getGrupos().add(grupoSelecionado);
	}

	public void excluiGrupo(){
		 usuario.getGrupos().remove(grupoSelecionado);
	}
				
	public Grupo getGrupoSelecionado() {
		return grupoSelecionado;
	}

	public void setGrupoSelecionado(Grupo grupoSelecionado) {
		this.grupoSelecionado = grupoSelecionado;
	}
	
	
}
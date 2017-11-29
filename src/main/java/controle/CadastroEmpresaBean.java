package controle;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Empresa;
import model.UnidadeFederacao;
import service.CadastroEmpresaService;
import util.jsf.FacesUtil;

@Named
@ViewScoped
public class CadastroEmpresaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private CadastroEmpresaService cadastroServiceEmpresa;;
	private Empresa empresa;
	
	
	public CadastroEmpresaBean() {
		empresa = new Empresa();
	}


	public void salvar() {
		cadastroServiceEmpresa.salvar(empresa);
		FacesUtil.addInfoMessage("Cadastrado com sucesso");
	}

	public boolean isEditando() {
		return this.empresa.getId() != null;

	}
	
	
	public UnidadeFederacao[] getUf() {
		return UnidadeFederacao.values();
	}


	public CadastroEmpresaService getCadastroServiceEmpresa() {
		return cadastroServiceEmpresa;
	}


	public void setCadastroServiceEmpresa(
			CadastroEmpresaService cadastroServiceEmpresa) {
		this.cadastroServiceEmpresa = cadastroServiceEmpresa;
	}


	public Empresa getEmpresa() {
		return empresa;
	}


	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}


	
}

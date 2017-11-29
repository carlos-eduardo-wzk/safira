package controle;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Depto;
import model.UnidadeFederacao;
import service.CadastroDeptoService;
import util.jsf.FacesUtil;

@Named
@ViewScoped
public class CadastroDeptoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private CadastroDeptoService cadastroServiceDepto;;
	private Depto depto;
	
	
	public CadastroDeptoBean() {
		depto = new Depto();
	}

	public Depto getDepto() {
		return depto;
	}

	public void setDepto(Depto depto) {
		this.depto = depto;
	}

	public void salvar() {
		cadastroServiceDepto.salvar(depto);
		FacesUtil.addInfoMessage("Cadastrado com sucesso");
	}

	public boolean isEditando() {
		return this.depto.getId() != null;

	}
	
	
	public UnidadeFederacao[] getUf() {
		return UnidadeFederacao.values();
	}


	
}

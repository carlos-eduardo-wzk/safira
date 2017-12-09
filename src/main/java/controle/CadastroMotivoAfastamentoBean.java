package controle;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.MotivoAfastamento;
import service.CadastroMotivoAfastamentoService;
import util.jsf.FacesUtil;

@Named
@ViewScoped
public class CadastroMotivoAfastamentoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private CadastroMotivoAfastamentoService cadastroServiceMotivoAfastamentoService;
	
	private MotivoAfastamento motivoAfastamento;

	public CadastroMotivoAfastamentoBean() {
		motivoAfastamento = new MotivoAfastamento();
	}

	public MotivoAfastamento getMotivoAfastamento() {
		return motivoAfastamento;
	}

	public void setMotivoAfastamento(MotivoAfastamento motivoAfastamento) {
		this.motivoAfastamento = motivoAfastamento;
	}

	public void salvar() {
		cadastroServiceMotivoAfastamentoService.salvar(motivoAfastamento);		
		FacesUtil.addInfoMessage("Cadastrado com sucesso");
	}

	public boolean isEditando() {
		return this.motivoAfastamento.getId() != null;

	}

	
	
}

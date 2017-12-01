package controle;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Historico;
import service.CadastroHistoricoService;
import util.jsf.FacesUtil;

@Named
@ViewScoped
public class CadastroHistoricoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private CadastroHistoricoService cadastroServiceHistorico;;
	private Historico historico;

	public CadastroHistoricoBean() {
		historico = new Historico();
	}

	public Historico getHistorico() {
		return historico;
	}

	public void setHistorico(Historico historico) {
		this.historico = historico;
	}

	public void salvar() {
		System.out.println("salvar historio ");
		cadastroServiceHistorico.salvar(historico);
		FacesUtil.addInfoMessage("Cadastrado com sucesso");
	}

	public boolean isEditando() {
		return this.historico.getId() != null;

	}

}

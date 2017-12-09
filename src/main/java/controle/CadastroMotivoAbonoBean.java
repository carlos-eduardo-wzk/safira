package controle;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.MotivoAbono;
import service.CadastroMotivoAbonoService;
import util.jsf.FacesUtil;

@Named
@ViewScoped
public class CadastroMotivoAbonoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private CadastroMotivoAbonoService cadastroServiceMotivoAbono;;
	private MotivoAbono motivoAbono;

	public CadastroMotivoAbonoBean() {
		motivoAbono = new MotivoAbono();
	}

	public MotivoAbono getMotivoAbono() {
		return motivoAbono;
	}

	public void setMotivoAbono(MotivoAbono motivoAbono) {
		this.motivoAbono = motivoAbono;
	}

	public void salvar() {
		
		cadastroServiceMotivoAbono.salvar(motivoAbono);
		FacesUtil.addInfoMessage("Cadastrado com sucesso");
	}

	public boolean isEditando() {
		return this.motivoAbono.getId() != null;

	}

}

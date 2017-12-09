package controle;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Colaborador;
import model.LanctoBancoHora;

import org.primefaces.event.SelectEvent;

import repository.LanctoBancoHoras;
import util.Rotinas;
import util.jsf.FacesUtil;

@Named
@ViewScoped
public class CadastroLanctoBancoHoraBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private LanctoBancoHora lanctoBancoHora;
	private String horBanco;

	@Inject
	private LanctoBancoHoras lanctoBancoHoras;

	public CadastroLanctoBancoHoraBean() {
		lanctoBancoHora = new LanctoBancoHora();
	}

	public void colaboradorSelecionado(SelectEvent event) {
		Colaborador colaborador = (Colaborador) event.getObject();
		lanctoBancoHora.setColaborador(colaborador);
	}

	public void salvar() {
		lanctoBancoHoras.guardar(lanctoBancoHora);
		FacesUtil.addInfoMessage("Cadastrado com sucesso");
	}

	public boolean isEditando() {
		System.out.println(" is editando");
		return this.lanctoBancoHora.getId() != null;
	}

	public LanctoBancoHora getLanctoBancoHora() {
		return lanctoBancoHora;
	}

	public void setLanctoBancoHora(LanctoBancoHora lanctoBancoHora) {
		System.out.println("attri " + lanctoBancoHora);
		this.lanctoBancoHora = lanctoBancoHora;
	}

	public LanctoBancoHoras getLanctoBancoHoras() {
		return lanctoBancoHoras;
	}

	public void setLanctoBancoHoras(LanctoBancoHoras lanctoBancoHoras) {
		this.lanctoBancoHoras = lanctoBancoHoras;
	}

	public String getHorBanco() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (lanctoBancoHora.getHoras() != null) {
			h = rt.InteitoToHora(lanctoBancoHora.getHoras());
		}
		return h;

	}

	public void setHorBanco(String horBanco) {
		Rotinas rt = new Rotinas();
		lanctoBancoHora.setHoras(rt.Hora2int(horBanco));
		this.horBanco = horBanco;
	}

}

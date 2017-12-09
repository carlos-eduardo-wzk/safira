package controle;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.LanctoBancoHora;
import repository.LanctoBancoHoras;
import util.jsf.FacesUtil;
import filter.LanctoBancoHoraFilter;

@Named
@ViewScoped
public class PesquisaLanctoBancoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private LanctoBancoHoras lanctoBancoHoras;

	private LanctoBancoHoraFilter filtro;
	private List<LanctoBancoHora> lanctoBancoHoraFiltrados;
	private LanctoBancoHora lanctoBancoHoraSelecionado;

	public PesquisaLanctoBancoBean() {
		filtro = new LanctoBancoHoraFilter();
	};

	public LanctoBancoHoras getLanctoBancoHoras() {
		return lanctoBancoHoras;
	}

	public void setLanctoBancoHoras(LanctoBancoHoras lanctoBancoHoras) {
		this.lanctoBancoHoras = lanctoBancoHoras;
	}

	public LanctoBancoHoraFilter getFiltro() {
		return filtro;
	}

	public void setFiltro(LanctoBancoHoraFilter filtro) {
		this.filtro = filtro;
	}

	public List<LanctoBancoHora> getLanctoBancoHoraFiltrados() {
		return lanctoBancoHoraFiltrados;
	}

	public void setLanctoBancoHoraFiltrados(
			List<LanctoBancoHora> lanctoBancoHoraFiltrados) {
		this.lanctoBancoHoraFiltrados = lanctoBancoHoraFiltrados;
	}

	public LanctoBancoHora getLanctoBancoHoraSelecionado() {
		return lanctoBancoHoraSelecionado;
	}

	public void setLanctoBancoHoraSelecionado(
			LanctoBancoHora lanctoBancoHoraSelecionado) {
		this.lanctoBancoHoraSelecionado = lanctoBancoHoraSelecionado;
	}

	public void pesquisar() {
		lanctoBancoHoraFiltrados = lanctoBancoHoras.filtrados(filtro);

	}

	public void excluir() {
		lanctoBancoHoras.remover(lanctoBancoHoraSelecionado);
		lanctoBancoHoraFiltrados.remove(lanctoBancoHoraSelecionado);
		FacesUtil.addInfoMessage("Lancto Banco de horas, Colaborador : "
				+ lanctoBancoHoraSelecionado.getColaborador().getNome() + " Data :" + lanctoBancoHoraSelecionado.getData().toString().substring(0, 10) + " excluido.");

	}

}

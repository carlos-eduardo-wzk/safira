package controle;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Feriado;
import repository.Feriados;
import util.jsf.FacesUtil;
import filter.FeriadoFilter;

@Named
@ViewScoped
public class PesquisaFeriadoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Feriados feriados;

	private FeriadoFilter filtro;
	private List<Feriado> feriadoFiltrados;
	private Feriado feriadoSelecionado;

	public PesquisaFeriadoBean() {
		filtro = new FeriadoFilter();
	};

	public void pesquisar() {
		System.out.println("pesquisar feriado ");
		feriadoFiltrados = feriados.filtrados(filtro);

	}

	public void excluir() {
		feriados.remover(feriadoSelecionado);
		feriadoFiltrados.remove(feriadoSelecionado);
		FacesUtil.addInfoMessage("Feriado " + feriadoSelecionado.getFeriado()
				+ "excluido.");

	}

	public Feriados getFeriados() {
		return feriados;
	}

	public FeriadoFilter getFiltro() {
		return filtro;
	}

	public void setFiltro(FeriadoFilter filtro) {
		this.filtro = filtro;
	}

	public List<Feriado> getFeriadoFiltrados() {
		return feriadoFiltrados;
	}

	public void setFeriadoFiltrados(List<Feriado> feriadoFiltrados) {
		this.feriadoFiltrados = feriadoFiltrados;
	}

	public Feriado getFeriadoSelecionado() {
		return feriadoSelecionado;
	}

	public void setFeriadoSelecionado(Feriado feriadoSelecionado) {
		this.feriadoSelecionado = feriadoSelecionado;
	}

	public void setFeriados(Feriados feriados) {
		this.feriados = feriados;
	}

}

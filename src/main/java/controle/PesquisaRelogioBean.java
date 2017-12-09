package controle;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Relogio;
import repository.Relogios;
import util.jsf.FacesUtil;
import filter.RelogioFilter;

@Named
@ViewScoped
public class PesquisaRelogioBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Relogios relogios;

	private RelogioFilter filtro;
	private List<Relogio> relogioFiltrados;
	private Relogio relogioSelecionado;

	public PesquisaRelogioBean() {
		filtro = new RelogioFilter();
	};

	public void pesquisar() {
		relogioFiltrados = relogios.filtrados(filtro);

	}

	public void excluir() {
		relogios.remover(relogioSelecionado);
		relogioFiltrados.remove(relogioSelecionado);
		FacesUtil.addInfoMessage("Relogio " + relogioSelecionado.getDescricao()
				+ "excluido.");

	}

	public Relogios getRelogios() {
		return relogios;
	}

	public void setRelogios(Relogios relogios) {
		this.relogios = relogios;
	}

	public RelogioFilter getFiltro() {
		return filtro;
	}

	public void setFiltro(RelogioFilter filtro) {
		this.filtro = filtro;
	}

	public List<Relogio> getRelogioFiltrados() {
		return relogioFiltrados;
	}

	public void setRelogioFiltrados(List<Relogio> relogioFiltrados) {
		this.relogioFiltrados = relogioFiltrados;
	}

	public Relogio getRelogioSelecionado() {
		return relogioSelecionado;
	}

	public void setRelogioSelecionado(Relogio relogioSelecionado) {
		this.relogioSelecionado = relogioSelecionado;
	}

}

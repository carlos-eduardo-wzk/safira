package controle;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import filter.DeptoFilter;
import model.Depto;
import repository.Deptos;
import util.jsf.FacesUtil;

@Named
@ViewScoped
public class PesquisaDeptoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Deptos Deptos;

	private DeptoFilter filtro;
	private List<Depto> DeptoFiltrados;
	private Depto DeptoSelecionado;

	public PesquisaDeptoBean() {
		filtro = new DeptoFilter();
	};

	public void pesquisar() {
		DeptoFiltrados = Deptos.filtrados(filtro);

	}

	public void excluir() {
		Deptos.remover(DeptoSelecionado);
		DeptoFiltrados.remove(DeptoSelecionado);
		FacesUtil.addInfoMessage("Depto " + DeptoSelecionado.getDepto()
				+ "excluido.");

	}

	public Deptos getDeptos() {
		return Deptos;
	}

	public void setDeptos(Deptos Deptos) {
		this.Deptos = Deptos;
	}

	public DeptoFilter getFiltro() {
		return filtro;
	}

	public void setFiltro(DeptoFilter filtro) {
		this.filtro = filtro;
	}

	public List<Depto> getDeptoFiltrados() {
		return DeptoFiltrados;
	}

	public void setDeptoFiltrados(List<Depto> DeptoFiltrados) {
		this.DeptoFiltrados = DeptoFiltrados;
	}

	public Depto getDeptoSelecionado() {
		return DeptoSelecionado;
	}

	public void setDeptoSelecionado(Depto DeptoSelecionado) {
		this.DeptoSelecionado = DeptoSelecionado;
	}

}

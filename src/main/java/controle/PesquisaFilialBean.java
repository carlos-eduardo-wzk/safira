package controle;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Filial;
import repository.Filiais;
import util.jsf.FacesUtil;
import filter.FilialFilter;

@Named
@ViewScoped
public class PesquisaFilialBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Filiais filiais;

	private FilialFilter filtro;
	private List<Filial> FilialFiltrados;
	private Filial FilialSelecionado;

	public PesquisaFilialBean() {
		filtro = new FilialFilter();
	};

	public void pesquisar() {
		FilialFiltrados = filiais.filtrados(filtro);

	}

	public void excluir() {
		filiais.remover(FilialSelecionado);
		FilialFiltrados.remove(FilialSelecionado);
		FacesUtil.addInfoMessage("Filial " + FilialSelecionado.getFilial()
				+ " excluido.");

	}

	public FilialFilter getFiltro() {
		return filtro;
	}

	public void setFiltro(FilialFilter filtro) {
		this.filtro = filtro;
	}

	public List<Filial> getFilialFiltrados() {
		return FilialFiltrados;
	}

	public void setFiltroFiltrados(List<Filial> FilialFiltrados) {
		this.FilialFiltrados = FilialFiltrados;
	}

	public Filial getFilialSelecionado() {
		return FilialSelecionado;
	}

	public void setFilialSelecionado(Filial filialSelecionado) {
		this.FilialSelecionado = filialSelecionado;
	}

}

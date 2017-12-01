package controle;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import filter.ColaboradorFilter;
import model.Colaborador;
import repository.Colaboradores;
import util.jsf.FacesUtil;

@Named
@ViewScoped
public class PesquisaColaboradorBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Colaboradores colaboradores;

	private ColaboradorFilter filtro;

	 private List<Colaborador> colaboradoFiltrados;

	private LazyDataModel<Colaborador> model;

	private Colaborador colaboradorSelecionado;

	public PesquisaColaboradorBean() {
		filtro = new ColaboradorFilter();

		model = new LazyDataModel<Colaborador>() {
			private static final long serialVersionUID = 1L;

			@Override
			public List<Colaborador> load(int first, int pageSize,
					String sortField, SortOrder sortOrder,
					Map<String, Object> filters) {

				filtro.setPrimeiroRegistro(first);
				filtro.setQuantidadeRegistros(pageSize);
				filtro.setPropriedadeOrdenacao(sortField);
				filtro.setAscendente(SortOrder.ASCENDING.equals(sortOrder));

				setRowCount(colaboradores.quantidadesFiltrados(filtro));

				return colaboradores.filtrados(filtro);

			}

		};
	};

	public void excluir() {
		colaboradores.remover(colaboradorSelecionado);
		// colaboradoFiltrados.remove(colaboradorSelecionado);
		FacesUtil.addInfoMessage("Colabolador "
				+ colaboradorSelecionado.getNome() + "excluido.");

	}

	public Colaboradores getColaboradores() {
		return colaboradores;
	}

	public void setColaboradores(Colaboradores colaboradores) {
		this.colaboradores = colaboradores;
	}

	public ColaboradorFilter getFiltro() {
		return filtro;
	}

	public void setFiltro(ColaboradorFilter filtro) {
		this.filtro = filtro;
	}

	public Colaborador getColaboradorSelecionado() {
		return colaboradorSelecionado;
	}

	public void setColaboradorSelecionado(Colaborador colaboradorSelecionado) {
		this.colaboradorSelecionado = colaboradorSelecionado;
	}

	public LazyDataModel<Colaborador> getModel() {
		return model;
	}

}

package controle;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Afastamento;
import repository.Afastamentos;
import util.jsf.FacesUtil;
import filter.AfastamentoFilter;

@Named
@ViewScoped
public class PesquisaAfastamentoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Afastamentos afastamentos;

	private AfastamentoFilter filtro;
	private List<Afastamento> afastamentoFiltrados;
	private Afastamento afastamentoSelecionado;

	public PesquisaAfastamentoBean() {
		filtro = new AfastamentoFilter();
	};

	public void pesquisar() {
		System.out.println("pesquisar afastamento ");
		afastamentoFiltrados = afastamentos.filtrados(filtro);

	}

	public void excluir() {
		afastamentos.remover(afastamentoSelecionado);
		afastamentoFiltrados.remove(afastamentoSelecionado);
		FacesUtil.addInfoMessage("Feriado "
				+ afastamentoSelecionado.getMotivoAfastamento()
						.getMotivoAfastamento() + "excluido.");

	}

	public Afastamentos getAfastamentos() {
		return afastamentos;
	}

	public void setAfastamentos(Afastamentos afastamentos) {
		this.afastamentos = afastamentos;
	}

	public AfastamentoFilter getFiltro() {
		return filtro;
	}

	public void setFiltro(AfastamentoFilter filtro) {
		this.filtro = filtro;
	}

	public List<Afastamento> getAfastamentoFiltrados() {
		return afastamentoFiltrados;
	}

	public void setAfastamentoFiltrados(List<Afastamento> afastamentoFiltrados) {
		this.afastamentoFiltrados = afastamentoFiltrados;
	}

	public Afastamento getAfastamentoSelecionado() {
		return afastamentoSelecionado;
	}

	public void setAfastamentoSelecionado(Afastamento afastamentoSelecionado) {
		this.afastamentoSelecionado = afastamentoSelecionado;
	}

}

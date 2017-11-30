package controle;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Ocorrencia;
import repository.Ocorrencias;
import util.jsf.FacesUtil;
import filter.OcorrenciaFilter;

@Named
@ViewScoped
public class PesquisaOcorrenciaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Ocorrencias ocorrencias;

	private OcorrenciaFilter filtro;
	private List<Ocorrencia> ocorrenciaFiltrados;
	private Ocorrencia ocorrenciaSelecionado;

	public PesquisaOcorrenciaBean() {
		filtro = new OcorrenciaFilter();
	};

	public void pesquisar() {
		ocorrenciaFiltrados = ocorrencias.filtrados(filtro);

	}

	public void excluir() {
		ocorrencias.remover(ocorrenciaSelecionado);
		ocorrenciaFiltrados.remove(ocorrenciaSelecionado);
		FacesUtil.addInfoMessage("Filial "
				+ ocorrenciaSelecionado.getOcorrencia() + "excluido.");

	}

	public Ocorrencias getOcorrencias() {
		return ocorrencias;
	}

	public void setOcorrencias(Ocorrencias ocorrencias) {
		this.ocorrencias = ocorrencias;
	}

	public OcorrenciaFilter getFiltro() {
		return filtro;
	}

	public void setFiltro(OcorrenciaFilter filtro) {
		this.filtro = filtro;
	}

	public List<Ocorrencia> getOcorrenciaFiltrados() {
		return ocorrenciaFiltrados;
	}

	public void setOcorrenciaFiltrados(List<Ocorrencia> ocorrenciaFiltrados) {
		this.ocorrenciaFiltrados = ocorrenciaFiltrados;
	}

	public Ocorrencia getOcorrenciaSelecionado() {
		return ocorrenciaSelecionado;
	}

	public void setOcorrenciaSelecionado(Ocorrencia ocorrenciaSelecionado) {
		this.ocorrenciaSelecionado = ocorrenciaSelecionado;
	}

}

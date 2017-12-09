package controle;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.MotivoAfastamento;
import repository.MotivoAfastamentos;
import util.jsf.FacesUtil;
import filter.MotivoAfastamentoFilter;

@Named
@ViewScoped
public class PesquisaMotivoAfastamentoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private MotivoAfastamentos motivoAfastamentos;

	private MotivoAfastamentoFilter filtro;
	private List<MotivoAfastamento> motivoAfastamentoFiltrados;
	private MotivoAfastamento motivoAfastamentoSelecionado;

	public PesquisaMotivoAfastamentoBean() {
		filtro = new MotivoAfastamentoFilter();
	};

	public void pesquisar() {
		motivoAfastamentoFiltrados = motivoAfastamentos.filtrados(filtro);

	}

	public void excluir() {
		motivoAfastamentos.remover(motivoAfastamentoSelecionado);
		motivoAfastamentoFiltrados.remove(motivoAfastamentoSelecionado);
		FacesUtil.addInfoMessage("Motivo Abono "
				+ motivoAfastamentoSelecionado.getMotivoAfastamento()
				+ "excluido.");

	}

	public MotivoAfastamentos getMotivoAfastamentos() {
		return motivoAfastamentos;
	}

	public void setMotivoAfastamentos(MotivoAfastamentos motivoAfastamentos) {
		this.motivoAfastamentos = motivoAfastamentos;
	}

	public MotivoAfastamentoFilter getFiltro() {
		return filtro;
	}

	public void setFiltro(MotivoAfastamentoFilter filtro) {
		this.filtro = filtro;
	}

	public List<MotivoAfastamento> getMotivoAfastamentoFiltrados() {
		return motivoAfastamentoFiltrados;
	}

	public void setMotivoAfastamentoFiltrados(
			List<MotivoAfastamento> motivoAfastamentoFiltrados) {
		this.motivoAfastamentoFiltrados = motivoAfastamentoFiltrados;
	}

	public MotivoAfastamento getMotivoAfastamentoSelecionado() {
		return motivoAfastamentoSelecionado;
	}

	public void setMotivoAfastamentoSelecionado(
			MotivoAfastamento motivoAfastamentoSelecionado) {
		this.motivoAfastamentoSelecionado = motivoAfastamentoSelecionado;
	}

}

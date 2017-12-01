package controle;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Historico;
import repository.Historicos;
import util.jsf.FacesUtil;
import filter.HistoricoFilter;


@Named
@ViewScoped
public class PesquisaHistoricoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Historicos historicos;
		
	private HistoricoFilter filtro;
	private List<Historico> historicoFiltrados;
	private Historico  historicoSelecionado;
	
	public PesquisaHistoricoBean() {
		 filtro = new HistoricoFilter();
	};

	public void pesquisar(){
     	historicoFiltrados = historicos.filtrados(filtro);
				
	}
	
	public void excluir(){
		historicos.remover(historicoSelecionado);
		historicoFiltrados.remove(historicoSelecionado);
		FacesUtil.addInfoMessage("Historico " + historicoSelecionado.getHistorico() + "excluido.");		
				
	}

	public Historicos getHistoricos() {
		return historicos;
	}

	public void setHistoricos(Historicos historicos) {
		this.historicos = historicos;
	}

	public HistoricoFilter getFiltro() {
		return filtro;
	}

	public void setFiltro(HistoricoFilter filtro) {
		this.filtro = filtro;
	}

	public List<Historico> getHistoricoFiltrados() {
		return historicoFiltrados;
	}

	public void setHistoricoFiltrados(List<Historico> historicoFiltrados) {
		this.historicoFiltrados = historicoFiltrados;
	}

	public Historico getHistoricoSelecionado() {
		return historicoSelecionado;
	}

	public void setHistoricoSelecionado(Historico historicoSelecionado) {
		this.historicoSelecionado = historicoSelecionado;
	}
	
		
	
	
}

package controle;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import model.Folga;
import repository.Folgas;
import util.jsf.FacesUtil;
import filter.FolgaFilter;


@Named
@ViewScoped
public class PesquisaFolgaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Folgas folgas;
		
	private FolgaFilter filtro;
	private List<Folga> folgaFiltrados;
	private Folga  folgaSelecionado;
	
	public PesquisaFolgaBean() {
		 filtro = new FolgaFilter();
	};

	public void pesquisar(){
		System.out.println("pesquisar folga ");
		folgaFiltrados = folgas.filtrados(filtro);
				
	}
	
	@Transactional
	public void excluir(){
		folgas.remover(folgaSelecionado);
		folgaFiltrados.remove(folgaSelecionado);
		FacesUtil.addInfoMessage("Folga " + folgaSelecionado.getColaborador().getNome() + " excluido.");		
				
	}

	public Folgas getFolgas() {
		return folgas;
	}

	public void setFolgas(Folgas folgas) {
		this.folgas = folgas;
	}

	public FolgaFilter getFiltro() {
		return filtro;
	}

	public void setFiltro(FolgaFilter filtro) {
		this.filtro = filtro;
	}

	public List<Folga> getFolgaFiltrados() {
		return folgaFiltrados;
	}

	public void setFolgaFiltrados(List<Folga> folgaFiltrados) {
		this.folgaFiltrados = folgaFiltrados;
	}

	public Folga getFolgaSelecionado() {
		return folgaSelecionado;
	}

	public void setFolgaSelecionado(Folga folgaSelecionado) {
		this.folgaSelecionado = folgaSelecionado;
	}


	
	
	
	}

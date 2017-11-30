package controle;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Norma;
import repository.Normas;
import util.jsf.FacesUtil;
import filter.NormaFilter;


@Named
@ViewScoped
public class PesquisaNormaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Normas normas;
		
	private NormaFilter filtro;
	private List<Norma> normaFiltrados;
	private Norma  normaSelecionado;
	
	public PesquisaNormaBean() {
		 filtro = new NormaFilter();
	};

	public void pesquisar(){
		normaFiltrados = normas.filtrados(filtro);
				
	}
	
	public void excluir(){
		normas.remover(normaSelecionado);
		try {
			normaFiltrados.remove(normaSelecionado);
			FacesUtil.addInfoMessage("Norma " + normaSelecionado.getNorma() +  " excluido.");
		} catch (Exception e) {			
			e.printStackTrace();
		}		
				
	}
	
	public Normas getNormas() {
		return normas;
	}

	public void setNormas(Normas normas) {
		this.normas = normas;
	}

	public NormaFilter getFiltro() {
		return filtro;
	}

	public void setFiltro(NormaFilter filtro) {
		this.filtro = filtro;
	}

	public List<Norma> getNormaFiltrados() {
		return normaFiltrados;
	}

	public void setNormaFiltrados(List<Norma> normaFiltrados) {
		this.normaFiltrados = normaFiltrados;
	}

	public Norma getNormaSelecionado() {
		return normaSelecionado;
	}

	public void setNormaSelecionado(Norma normaSelecionado) {
		this. normaSelecionado = normaSelecionado;
	}	
	
	
	
}

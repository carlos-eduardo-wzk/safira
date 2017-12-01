package controle;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Jornada;
import repository.Jornadas;
import util.jsf.FacesUtil;
import filter.JornadaFilter;

@Named
@ViewScoped
public class PesquisaJornadaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Jornadas jornadas;

	private JornadaFilter filtro;
	private List<Jornada> jornadaFiltrados;
	private Jornada jornadaSelecionado;

	public PesquisaJornadaBean() {
		filtro = new JornadaFilter();
	};

	public void pesquisar() {
		jornadaFiltrados = jornadas.filtrados(filtro);

	}

	public void excluir() {
		jornadas.remover(jornadaSelecionado);
		jornadaFiltrados.remove(jornadaSelecionado);
		FacesUtil.addInfoMessage("Jornada " + jornadaSelecionado.getJornada()
				+ "excluido.");

	}

	public Jornadas getJornadas() {
		return jornadas;
	}

	public void setJornadas(Jornadas jornadas) {
		this.jornadas = jornadas;
	}

	public JornadaFilter getFiltro() {
		return filtro;
	}

	public void setFiltro(JornadaFilter filtro) {
		this.filtro = filtro;
	}

	public List<Jornada> getJornadaFiltrados() {
		return jornadaFiltrados;
	}

	public void setJornadaFiltrados(List<Jornada> jornadaFiltrados) {
		this.jornadaFiltrados = jornadaFiltrados;
	}

	public Jornada getJornadaSelecionado() {
		return jornadaSelecionado;
	}

	public void setJornadaSelecionado(Jornada jornadaSelecionado) {
		this.jornadaSelecionado = jornadaSelecionado;
	}

}

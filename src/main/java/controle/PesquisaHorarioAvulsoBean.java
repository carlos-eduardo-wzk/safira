package controle;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.HorarioAvulso;
import repository.HorarioAvulsos;
import util.jsf.FacesUtil;
import filter.HorarioAvulsoFilter;

@Named
@ViewScoped
public class PesquisaHorarioAvulsoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private HorarioAvulsos horarioAvulsos;

	private HorarioAvulsoFilter filtro;
	private List<HorarioAvulso> horarioAvulsoFiltrados;
	private HorarioAvulso horarioAvulsoSelecionado;

	public PesquisaHorarioAvulsoBean() {
		filtro = new HorarioAvulsoFilter();
	};

	public void pesquisar() {
		// System.out.println("pesquisar afastamento ");
		horarioAvulsoFiltrados = horarioAvulsos.filtrados(filtro);

	}

	public void excluir() {
		horarioAvulsos.remover(horarioAvulsoSelecionado);
		// horarioAvulsos.remove(horarioAvulsoSelecionado);
		FacesUtil.addInfoMessage("HorarioAvulso "
				+ horarioAvulsoSelecionado.getHorario().getHorario()
				+ "excluido.");

	}

	public HorarioAvulsos getHorarioAvulsos() {
		return horarioAvulsos;
	}

	public void setHorarioAvulsos(HorarioAvulsos horarioAvulsos) {
		this.horarioAvulsos = horarioAvulsos;
	}

	public List<HorarioAvulso> getHorarioAvulsoFiltrados() {
		return horarioAvulsoFiltrados;
	}

	public void setHorarioAvulsoFiltrados(
			List<HorarioAvulso> horarioAvulsoFiltrados) {
		this.horarioAvulsoFiltrados = horarioAvulsoFiltrados;
	}

	public HorarioAvulso getHorarioAvulsoSelecionado() {
		return horarioAvulsoSelecionado;
	}

	public void setHorarioAvulsoSelecionado(
			HorarioAvulso horarioAvulsoSelecionado) {
		this.horarioAvulsoSelecionado = horarioAvulsoSelecionado;
	}

	public HorarioAvulsoFilter getFiltro() {
		return filtro;
	}

	public void setFiltro(HorarioAvulsoFilter filtro) {
		this.filtro = filtro;
	}

}

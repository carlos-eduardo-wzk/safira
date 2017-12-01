package controle;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import model.Horario;
import repository.Horarios;
import service.CadastroHorarioService;
import util.jsf.FacesUtil;
import filter.HorarioFilter;

@Named
@ViewScoped
public class PesquisaHorarioBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Horarios horarios;

	@Inject
	private CadastroHorarioService cadastroServiceHorario;;

	private HorarioFilter filtro;
	private List<Horario> horarioFiltrados;
	private Horario horarioSelecionado;

	public PesquisaHorarioBean() {
		filtro = new HorarioFilter();
	};

	public void pesquisar() {
		horarioFiltrados = horarios.filtrados(filtro);

	}

	@Transactional
	public void excluir() {
		horarios.remover(horarioSelecionado);
		horarioFiltrados.remove(horarioSelecionado);
		cadastroServiceHorario.apagaJornadasHorario(horarioSelecionado.getId());

		FacesUtil.addInfoMessage("Horario " + horarioSelecionado.getHorario()
				+ "excluido.");

	}

	public Horarios getHorarios() {
		return horarios;
	}

	public void setHorarios(Horarios horarios) {
		this.horarios = horarios;
	}

	public HorarioFilter getFiltro() {
		return filtro;
	}

	public void setFiltro(HorarioFilter filtro) {
		this.filtro = filtro;
	}

	public List<Horario> gethorarioFiltrados() {
		return horarioFiltrados;
	}

	public void setHorarioFiltrados(List<Horario> horarioFiltrados) {
		this.horarioFiltrados = horarioFiltrados;
	}

	public Horario getHorarioSelecionado() {
		return horarioSelecionado;
	}

	public void setHorarioSelecionado(Horario horarioSelecionado) {
		this.horarioSelecionado = horarioSelecionado;
	}
}

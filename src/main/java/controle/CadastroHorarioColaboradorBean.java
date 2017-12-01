package controle;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Colaborador;
import model.Horario;
import model.HorarioColaborador;
import repository.HorarioColaboradores;
import repository.Horarios;
import service.CadastroHorarioColaboradorService;
import util.jsf.FacesUtil;

@Named
@ViewScoped
public class CadastroHorarioColaboradorBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Horarios horarios;

	@Inject
	private HorarioColaboradores horarioColaboradores;

	private HorarioColaborador horarioColaborador;
	private HorarioColaborador hc;

	private List<Horario> listaHorario;
	private List<HorarioColaborador> listaHorarioColaborador;

	private Colaborador colaborador;

	private HorarioColaborador horarioColaboradorSelecionado;

	@Inject
	private CadastroHorarioColaboradorService cadastroHorarioColaboradorService;

	public void inicializar() {
		if (FacesUtil.isNotPostback()) {
			listaHorario = carregarHorario();
			horarioColaborador.setColaborador(this.colaborador);
			System.out.println("inicializar CadastroHorarioColaboradorBean " + this.colaborador
					.getId());
			listaHorarioColaborador = carregarHorarioColaborador(this.colaborador
					.getId());
		}
	}

	public List<HorarioColaborador> carregarHorarioColaborador(Long id) {
         System.out.println("aaaaaaaaaaaaaa");
		return horarioColaboradores.carregarListaHorarioColaboradores(id);
	}

	public List<Horario> carregarHorario() {
		return horarios.carregarListaHorarios();
	}

	public CadastroHorarioColaboradorBean() {
		horarioColaborador = new HorarioColaborador();
	}

	public HorarioColaborador getHorarioColaborador() {
		return horarioColaborador;
	}

	public void setHorarioColaborador(HorarioColaborador horarioColaborador) {
		this.horarioColaborador = horarioColaborador;
	}

	public HorarioColaborador getHc() {
		return hc;
	}

	public void setHc(HorarioColaborador hc) {
		this.hc = hc;
	}

	public List<Horario> getListaHorario() {
		return listaHorario;
	}

	public void setListaHorario(List<Horario> listaHorario) {
		this.listaHorario = listaHorario;
	}

	public void salvar() {
		// salva o horario para o relacionamento
		// horarioColaborador.setHorario(horario);
		cadastroHorarioColaboradorService.salvar(horarioColaborador);
		FacesUtil.addInfoMessage("Horario colaborador cadastrado com sucesso");
		// recarrega o datatable
		listaHorarioColaborador = carregarHorarioColaborador(this.colaborador.getId());
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public List<HorarioColaborador> getListaHorarioColaborador() {
		return listaHorarioColaborador;
	}

	public void setListaHorarioColaborador(
			List<HorarioColaborador> listaHorarioColaborador) {
		this.listaHorarioColaborador = listaHorarioColaborador;
	}

	public HorarioColaborador getHorarioColaboradorSelecionado() {
		return horarioColaboradorSelecionado;
	}

	public void setHorarioColaboradorSelecionado(
			HorarioColaborador horarioColaboradorSelecionado) {
		this.horarioColaboradorSelecionado = horarioColaboradorSelecionado;
	}

	public void excluir() {
	 cadastroHorarioColaboradorService.excluir(horarioColaboradorSelecionado);
	listaHorarioColaborador = carregarHorarioColaborador(this.colaborador.getId());
	 
	}

	public void novo() {
       this.horarioColaborador = new   HorarioColaborador();      
		listaHorario = carregarHorario();
		horarioColaborador.setColaborador(this.colaborador);
		listaHorarioColaborador = carregarHorarioColaborador(this.colaborador.getId());

	}

}

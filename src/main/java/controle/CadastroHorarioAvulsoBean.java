package controle;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Colaborador;
import model.Horario;
import model.HorarioAvulso;

import org.primefaces.event.SelectEvent;

import repository.HorarioAvulsos;
import repository.Horarios;

@Named
@ViewScoped
public class CadastroHorarioAvulsoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private HorarioAvulso horarioAvulso;

	@Inject
	private HorarioAvulsos horarioAvulsos;

	@Inject
	private Horarios horarios;

	private List<Horario> lstHorario;

	public CadastroHorarioAvulsoBean() {
		horarioAvulso = new HorarioAvulso();
	}
	
	@PostConstruct
	public void inicializar() {
		lstHorario = carregarHorarios() ;		
	}

	public void colaboradorSelecionado(SelectEvent event) {
		Colaborador colaborador = (Colaborador) event.getObject();
		horarioAvulso.setColaborador(colaborador);
	}

	public List<Horario> carregarHorarios() {		
		return horarios.carregarListaHorarios();
	}
	
	
	public void salvar() {
		horarioAvulsos.guardar(horarioAvulso);		
		//FacesUtil.addInfoMessage("Cadastrado com sucesso");
	}
	

	public boolean isEditando() {
		return this.horarioAvulso.getId() != null;
	}

	public HorarioAvulso getHorarioAvulso() {
		return horarioAvulso;
	}

	public void setHorarioAvulso(HorarioAvulso horarioAvulso) {
		this.horarioAvulso = horarioAvulso;
	}

	public Horarios getHorarios() {
		return horarios;
	}

	public void setHorarios(Horarios horarios) {
		this.horarios = horarios;
	}

	public List<Horario> getLstHorario() {
		return lstHorario;
	}

	public void setLstHorario(List<Horario> lstHorario) {
		this.lstHorario = lstHorario;
	}


	
	
}

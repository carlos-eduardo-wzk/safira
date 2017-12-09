package controle;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Afastamento;
import model.Colaborador;
import model.MotivoAfastamento;

import org.primefaces.event.SelectEvent;

import repository.Afastamentos;
import repository.MotivoAfastamentos;

@Named
@ViewScoped
public class CadastroAfastamentoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Afastamento afastamento;

	@Inject
	private Afastamentos afastamentos;

	@Inject
	private MotivoAfastamentos motivosAfastamentos;

	private List<MotivoAfastamento> lstMotivo;

	public CadastroAfastamentoBean() {
		afastamento = new Afastamento();

	}

	@PostConstruct
	public void inicializar() {
		lstMotivo = carregarMotivoAfastamento();
		
	}

	public void colaboradorSelecionado(SelectEvent event) {
		// System.out.println(" ---- " + (Colaborador)event.getObject());
		// afastamento.setColaborador( (Colaborador)event.getObject() );
		Colaborador colaborador = (Colaborador) event.getObject();
		afastamento.setColaborador(colaborador);
	}

	public Afastamento getAfastamento() {
		return afastamento;
	}

	public void setAfastamento(Afastamento afastamento) {
		this.afastamento = afastamento;
	}

	public void salvar() {
		afastamentos.guardar(afastamento);
		
		//FacesUtil.addInfoMessage("Cadastrado com sucesso");
	}
	

	public boolean isEditando() {
		return this.afastamento.getId() != null;
	}

	public List<MotivoAfastamento> carregarMotivoAfastamento() {
		
		return this.motivosAfastamentos.carregarListaMotivoAfastamento();
	}

	public List<MotivoAfastamento> getLstMotivo() {
		return lstMotivo;
	}

	public void setLstMotivo(List<MotivoAfastamento> lstMotivo) {
		this.lstMotivo = lstMotivo;
	}

	
	
}

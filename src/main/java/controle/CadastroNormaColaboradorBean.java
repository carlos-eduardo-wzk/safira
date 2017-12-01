package controle;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Colaborador;
import model.Norma;
import model.NormaColaborador;
import repository.NormaColaboradores;
import repository.Normas;
import service.CadastroNormaColaboradorService;
import util.jsf.FacesUtil;

@Named
@ViewScoped
public class CadastroNormaColaboradorBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Normas normas;

	@Inject
	private NormaColaboradores normaColaboradores;

	private NormaColaborador normaColaborador;
	private NormaColaborador nc;

	private List<Norma> listaNorma;
	private List<NormaColaborador> listaNormaColaborador;

	private Colaborador colaborador;

	private NormaColaborador normaColaboradorSelecionado;

	@Inject
	private CadastroNormaColaboradorService cadastroNormaColaboradorService;

	public void inicializar() {
		if (FacesUtil.isNotPostback()) {
			listaNorma = carregarNorma();
			normaColaborador.setColaborador(this.colaborador);
			listaNormaColaborador = carregarNormaColaborador(this.colaborador
					.getId());
		}
	}

	public List<NormaColaborador> carregarNormaColaborador(Long id) {

		return normaColaboradores.carregarListaNormaColaboradores(id);
	}

	public List<Norma> carregarNorma() {
		return normas.carregarListaNormas();
	}

	public CadastroNormaColaboradorBean() {
		normaColaborador = new NormaColaborador();
	}

	public NormaColaborador getNormaColaborador() {
		return normaColaborador;
	}

	public void setNormaColaborador(NormaColaborador normaColaborador) {
		this.normaColaborador = normaColaborador;
	}

	public NormaColaborador getNc() {
		return nc;
	}

	public void setNc(NormaColaborador nc) {
		this.nc = nc;
	}

	public List<Norma> getListaNorma() {
		return listaNorma;
	}

	public void setListaNorma(List<Norma> listaNorma) {
		this.listaNorma = listaNorma;
	}

	public void salvar() {
		// salva o horario para o relacionamento
		// horarioColaborador.setHorario(horario);
		cadastroNormaColaboradorService.salvar(normaColaborador);
		FacesUtil.addInfoMessage("Norma colaborador cadastrado com sucesso");
		// recarrega o datatable
		listaNormaColaborador = carregarNormaColaborador(this.colaborador
				.getId());
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public List<NormaColaborador> getListaNormaColaborador() {
		return listaNormaColaborador;
	}

	public void setListaNormaColaborador(
			List<NormaColaborador> listaNormaColaborador) {
		this.listaNormaColaborador = listaNormaColaborador;
	}

	public NormaColaborador getNormaColaboradorSelecionado() {
		return normaColaboradorSelecionado;
	}

	public void setNormaColaboradorSelecionado(
			NormaColaborador normaColaboradorSelecionado) {
		this.normaColaboradorSelecionado = normaColaboradorSelecionado;
	}

	public void excluir() {
		cadastroNormaColaboradorService.excluir(normaColaboradorSelecionado);
		listaNormaColaborador = carregarNormaColaborador(this.colaborador
				.getId());

	}

	public void novo() {
		this.normaColaborador = new NormaColaborador();
		listaNorma = carregarNorma();
		normaColaborador.setColaborador(this.colaborador);
		listaNormaColaborador = carregarNormaColaborador(this.colaborador
				.getId());

	}

}

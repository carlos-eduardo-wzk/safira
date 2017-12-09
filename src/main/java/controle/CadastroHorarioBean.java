package controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import model.Horario;
import model.HorarioJornada;
import model.Jornada;
import repository.Horarios;
import repository.Jornadas;
import service.CadastroHorarioService;
import util.jsf.FacesUtil;

@Named
@ViewScoped
public class CadastroHorarioBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private CadastroHorarioService cadastroServiceHorario;;
	private Horario horario;
	private Jornada jornadaLinhaEditavel;
	private Jornada jornadaSelecionada;
	private int linhaAtual;

	@Inject
	private Jornadas jornadas;

	@Inject
	private Horarios horarios;

	private List<Jornada> lstJornada = new ArrayList<>();

	public List<Jornada> completarJornada(String nome) {
		return this.jornadas.porNome(nome);
	}

	public void carregarJornadaLinhaEditavel() {

		// Jornada jornada = this.horario.getJornadas().get(0);
		Jornada jornada = lstJornada.get(0);

		if (this.jornadaLinhaEditavel != null) {

			// ** horario.getJornadas().add(this.jornadaLinhaEditavel);
			lstJornada.add(this.jornadaLinhaEditavel);

			jornadaLinhaEditavel = null;
		}
	}

	public void inicializar() {
		if (FacesUtil.isNotPostback()) {
			// horario.adicionarJornadaVazia();
			if (horario.getId() != null) {
				adicionarJornadaVazia();
				carregaJornada(horario.getId());
			} else {
				adicionarJornadaVazia();
			}

		}
		System.out.println("incializar");
		System.out.println(horario.getId());
	}

	public CadastroHorarioBean() {
		if (FacesUtil.isNotPostback()) {
			horario = new Horario();
		}

	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	@Transactional
	public void salvar() {

		if (lstJornada.size() > 0) {
			removerJornadaVazia();
		}

		horario = cadastroServiceHorario.salvar(horario);
		System.out.println("Horario" + this.getHorario().getId());

		int i = 1;
		System.out.println("Jornadas cadastradasa");
		for (Jornada j : lstJornada) {
			System.out.println("Horario " + this.getHorario().getHorario()
					+ " Jornada " + j.getJornada() + " sequencia " + i);
			i++;
		}

		System.out.println("inicio apagar jornada ");
		// apagar horario horarioJornada para inserir novalista
		
		cadastroServiceHorario.apagaJornadasHorario(this.getHorario().getId());

		// incluir Horario_jornada
	 cadastroServiceHorario.insereJornadasHorario(this.getHorario().getId(),
	 		lstJornada);

		// this.horario.adicionarJornadaVazia();
		FacesUtil.addInfoMessage("Cadastrado com sucesso");
	}

	public void carregaJornada(Long id) {
		System.out.println("carregaJornada horario" + id);

		List<HorarioJornada> hj = horarios.carregarHorarioJornada(id);
		for (HorarioJornada lista : hj) {
			lstJornada.add(jornadas.porId(lista.getJornadaId()));
			System.out.println(lista.getHorarioId() + " "
					+ lista.getJornadaId());
		}

	}

	public void adicionarJornadaVazia() {
		Jornada j = new Jornada();
		lstJornada.add(0, j);
	}

	public void removerJornadaVazia() {
		Jornada primeiraJornada = lstJornada.get(0);
		if (primeiraJornada != null) {
			lstJornada.remove(0);
		}

	}

	public void excluirJornada() {

		if ((linhaAtual < 0 || linhaAtual >= lstJornada.size())
				|| (linhaAtual == 0)) {
			FacesUtil.addInfoMessage("N�o pode apagar a linha de inser��o");

		} else {
			lstJornada.remove(linhaAtual);
		}

	}

	public boolean isEditando() {
		return this.horario.getId() != null;

	}

	public CadastroHorarioService getCadastroServiceHorario() {
		return cadastroServiceHorario;
	}

	public void setCadastroServiceHorario(
			CadastroHorarioService cadastroServiceHorario) {
		this.cadastroServiceHorario = cadastroServiceHorario;
	}

	public Jornada getJornadaLinhaEditavel() {
		return jornadaLinhaEditavel;
	}

	public void setJornadaLinhaEditavel(Jornada jornadaLinhaEditavel) {
		this.jornadaLinhaEditavel = jornadaLinhaEditavel;
	}

	public Jornada getJornadaSelecionada() {
		return jornadaSelecionada;
	}

	public void setJornadaSelecionada(Jornada jornadaSelecionada) {
		this.jornadaSelecionada = jornadaSelecionada;
	}

	public Jornadas getJornadas() {
		return jornadas;
	}

	public void setJornadas(Jornadas jornadas) {
		this.jornadas = jornadas;
	}

	public int getLinhaAtual() {
		return linhaAtual;
	}

	public void setLinhaAtual(int linhaAtual) {
		this.linhaAtual = linhaAtual;
	}

	public List<Jornada> getLstJornada() {
		return lstJornada;
	}

	public void setLstJornada(List<Jornada> lstJornada) {
		this.lstJornada = lstJornada;
	}

}

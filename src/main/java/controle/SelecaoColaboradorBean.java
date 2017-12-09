package controle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Colaborador;

import org.primefaces.context.RequestContext;

import repository.Colaboradores;

@Named
@ViewScoped
public class SelecaoColaboradorBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Colaboradores colaboradores;

	private String nome;
	private String matricula;
	private String pis;

	private List<Colaborador> colaboradoresFiltrados;

	public void selecionar(Colaborador colaborador) {
		RequestContext.getCurrentInstance().closeDialog(colaborador);
	}

	public void pesquisar() {
		if (nome.isEmpty() == false) {
			colaboradoresFiltrados = colaboradores.porNome(nome);
		}
		if (pis.isEmpty() == false) {
			colaboradoresFiltrados = colaboradores.porPis2(pis);
		}

		if (matricula.isEmpty() == false) {
			colaboradoresFiltrados = colaboradores.porMatricula(matricula);
		}

	}

	public void abrirDialogo() {
		Map<String, Object> opcoes = new HashMap<>();
		opcoes.put("modal", true);
		opcoes.put("resizable", false);
		opcoes.put("contentHeight", 585);

		RequestContext.getCurrentInstance().openDialog(
				"/admin/dialogos/SelecaoColaborador", opcoes, null);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Colaborador> getClientesFiltrados() {
		return colaboradoresFiltrados;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getPis() {
		return pis;
	}

	public void setPis(String pis) {
		this.pis = pis;
	}

}

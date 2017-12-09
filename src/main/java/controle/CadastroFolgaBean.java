package controle;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.event.SelectEvent;

import model.Colaborador;
import model.Folga;
import repository.Folgas;
import util.jsf.FacesUtil;

@Named
@ViewScoped
public class CadastroFolgaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Folga folga;

	@Inject
	private Folgas folgas;

	public CadastroFolgaBean() {
		folga = new Folga();

	}

	public void colaboradorSelecionado(SelectEvent event) {
		System.out.println("selecionado");
		Colaborador colaborador = (Colaborador) event.getObject();
		folga.setColaborador(colaborador);
	}

	public void salvar() {
		if (folga.getColaborador() == null) {
			FacesUtil.addInfoMessage("Escolha um colaborador");
			return;
		}

		System.out.println(" folga " + folga.getColaborador());
		System.out.println(" folga " + folga);

		folgas.guardar(folga);
		FacesUtil.addInfoMessage("Cadastrado com sucesso");
	}

	public boolean isEditando() {
		return this.folga.getId() != null;
	}

	public Folga getFolga() {
		return folga;
	}

	public void setFolga(Folga folga) {
		this.folga = folga;
	}

}

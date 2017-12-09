package controle;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import model.Empresa;
import model.Relogio;
import repository.Empresas;
import service.CadastroRelogioService;
import util.jsf.FacesUtil;

@Named
@ViewScoped
public class CadastroRelogioBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private CadastroRelogioService cadastroRelogioServices;

	@Inject
	private Empresas empresas;

	private Relogio relogio;
	private List<Empresa> listaEmpresa;

	public CadastroRelogioBean() {
		relogio = new Relogio();
	}

	public List<Empresa> carregarEmpresa() {

		return empresas.carregarListaEmpresas();
	}

	@PostConstruct
	public void inicializar() {
		listaEmpresa = carregaEmpresa();

	}

	public Relogio getRelogio() {
		return relogio;
	}

	@Transactional
	public void salvar() {
		cadastroRelogioServices.salvar(relogio);
		FacesUtil.addInfoMessage("Cadastrado com sucesso");
	}

	public void setRelogio(Relogio relogio) {
		this.relogio = relogio;
	}

	public boolean isEditando() {
		return this.relogio.getId() != null;

	}

	public List<Empresa> carregaEmpresa() {
		return this.empresas.carregarListaEmpresas();
	}

	public List<Empresa> getListaEmpresa() {
		return listaEmpresa;
	}

	public void setListaEmpresa(List<Empresa> listaEmpresa) {
		this.listaEmpresa = listaEmpresa;
	}

}

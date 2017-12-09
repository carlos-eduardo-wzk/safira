package controle;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Empresa;
import model.Feriado;
import repository.Empresas;
import service.CadastroFeriadoService;
import util.Rotinas;
import util.jsf.FacesUtil;

@Named
@ViewScoped
public class CadastroFeriadoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Empresas empresas;

	@Inject
	private CadastroFeriadoService cadastroServiceFeriado;;
	private Feriado feriado;
	private String horFeriado;

	private List<Empresa> listaEmpresa;

	public CadastroFeriadoBean() {
		feriado = new Feriado();
	}

	@PostConstruct
	public void inicializar() {
		listaEmpresa = carregaEmpresa();

	}

	public Feriado getFeriado() {
		return feriado;
	}

	public void setFeriado(Feriado feriado) {
		this.feriado = feriado;
	}

	public void salvar() {
		cadastroServiceFeriado.salvar(feriado);
		FacesUtil.addInfoMessage("Cadastrado com sucesso");
	}

	public boolean isEditando() {
		return this.feriado.getDataFeriado() != null;

	}

	public String getHorFeriado() {
		String h = "";
		Rotinas rt = new Rotinas();

		if (feriado.getDuracao() != null) {
			h = rt.InteitoToHora(feriado.getDuracao());
		}
		return h;
	}

	public void setHorFeriado(String horFeriado) {
		Rotinas rt = new Rotinas();
		feriado.setDuracao(rt.Hora2int(horFeriado));
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

	public void carregaParaEdicao() {
		System.out.println(feriado.getDataFeriado());
	}


			
	
}

package controle;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Empresa;
import repository.Empresas;
import util.jsf.FacesUtil;
import filter.EmpresaFilter;

@Named
@ViewScoped
public class PesquisaEmpresaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Empresas empresas;

	private EmpresaFilter filtro;
	private List<Empresa> EmpresaFiltrados;
	private Empresa empresaSelecionado;

	public PesquisaEmpresaBean() {
		filtro = new EmpresaFilter();
	};

	public void pesquisar() {
		EmpresaFiltrados = empresas.filtrados(filtro);

	}

	public void excluir() {
		empresas.remover(empresaSelecionado);

		EmpresaFiltrados.remove(empresaSelecionado);
		FacesUtil.addInfoMessage("Empresa "
				+ empresaSelecionado.getRazaoSocial() + "excluido.");

	}

	public Empresas getEmpresas() {
		return empresas;
	}

	public void setEmpresas(Empresas empresas) {
		this.empresas = empresas;
	}

	public EmpresaFilter getFiltro() {
		return filtro;
	}

	public void setFiltro(EmpresaFilter filtro) {
		this.filtro = filtro;
	}

	public List<Empresa> getEmpresaFiltrados() {
		return EmpresaFiltrados;
	}

	public void setEmpresaFiltrados(List<Empresa> empresaFiltrados) {
		EmpresaFiltrados = empresaFiltrados;
	}

	public Empresa getEmpresaSelecionado() {
		return empresaSelecionado;
	}

	public void setEmpresaSelecionado(Empresa empresaSelecionado) {
		this.empresaSelecionado = empresaSelecionado;
	}

}

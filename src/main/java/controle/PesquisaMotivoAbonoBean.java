package controle;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.MotivoAbono;
import repository.MotivoAbonos;
import util.jsf.FacesUtil;
import filter.MotivoAbonoFilter;


@Named
@ViewScoped
public class PesquisaMotivoAbonoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private MotivoAbonos motivoAbonos;
		
	private MotivoAbonoFilter filtro;
	private List<MotivoAbono> motivoAbonoFiltrados;
	private MotivoAbono  motivoAbonoSelecionado;
	
	public PesquisaMotivoAbonoBean() {
		 filtro = new MotivoAbonoFilter();
	};

	public void pesquisar(){
		motivoAbonoFiltrados = motivoAbonos.filtrados(filtro);
				
	}
	
	public void excluir(){
		motivoAbonos.remover(motivoAbonoSelecionado);
		motivoAbonoFiltrados.remove(motivoAbonoSelecionado);
		FacesUtil.addInfoMessage("Motivo Abono " + motivoAbonoSelecionado.getMotivoAbono() + "excluido.");		
				
	}
	

	public MotivoAbonos getMotivoAbonos() {
		return motivoAbonos;
	}

	public void setMotivoAbonos(MotivoAbonos motivoAbonos) {
		this.motivoAbonos = motivoAbonos;
	}

	public List<MotivoAbono> getMotivoAbonoFiltrados() {
		return motivoAbonoFiltrados;
	}

	public void setMotivoAbonoFiltrados(List<MotivoAbono> motivoAbonoFiltrados) {
		this.motivoAbonoFiltrados = motivoAbonoFiltrados;
	}

	public MotivoAbono getMotivoAbonoSelecionado() {
		return motivoAbonoSelecionado;
	}

	public void setMotivoAbonoSelecionado(MotivoAbono motivoAbonoSelecionado) {
		this.motivoAbonoSelecionado = motivoAbonoSelecionado;
	}

	public void setFiltro(MotivoAbonoFilter filtro) {
		this.filtro = filtro;
	}

	public MotivoAbonoFilter getFiltro() {
		return filtro;
	}

	
	
	
}

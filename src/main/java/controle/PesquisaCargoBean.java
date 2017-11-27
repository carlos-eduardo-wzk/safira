package controle;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Cargo;
import repository.Cargos;
import util.jsf.FacesUtil;
import filter.CargoFilter;


@Named
@ViewScoped
public class PesquisaCargoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Cargos cargos;
		
	private CargoFilter filtro;
	private List<Cargo> cargoFiltrados;
	private Cargo  cargoSelecionado;
	
	public PesquisaCargoBean() {
		 filtro = new CargoFilter();
	};

	public void pesquisar(){
		cargoFiltrados = cargos.filtrados(filtro);
		System.out.println(" deposi de filtradas");
				
	}
	
	public void excluir(){
		cargos.remover(cargoSelecionado);
		cargoFiltrados.remove(cargoSelecionado);
		FacesUtil.addInfoMessage("Cargo " + cargoSelecionado.getCargo() + "excluido.");		
				
	}
	
	public Cargos getCargos() {
		return cargos;
	}

	public void setCargos(Cargos cargos) {
		this.cargos = cargos;
	}

	public CargoFilter getFiltro() {
		return filtro;
	}

	public void setFiltro(CargoFilter filtro) {
		this.filtro = filtro;
	}

	public List<Cargo> getCargoFiltrados() {
		return cargoFiltrados;
	}

	public void setCargoFiltrados(List<Cargo> cargoFiltrados) {
		this.cargoFiltrados = cargoFiltrados;
	}

	public Cargo getCargoSelecionado() {
		return cargoSelecionado;
	}

	public void setCargoSelecionado(Cargo cargoSelecionado) {
		this.cargoSelecionado = cargoSelecionado;
	}	
	
	
	
}

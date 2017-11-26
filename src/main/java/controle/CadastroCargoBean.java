package controle;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Cargo;
import service.CadastroCargoService;
import util.jsf.FacesUtil;

@Named
@ViewScoped
public class CadastroCargoBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private CadastroCargoService cadastroServiceCargo;;	
	private Cargo cargo;

	
	public CadastroCargoBean() {
		cargo = new Cargo();
	}
	
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	
   public void salvar(){	  
	   cadastroServiceCargo.salvar(cargo);
	   FacesUtil.addInfoMessage("Cadastrado com sucesso");
   }
	
   public boolean isEditando(){	   
	   return this.cargo.getId() != null;
	   
   }
	

}

package controle;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import model.Cargo;
import service.CadastroCargoService;
import util.jsf.FacesUtil;

@ManagedBean
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
	   if (cargo.getId() == null) {
	   }
	   else {
		   cadastroServiceCargo.achaCargo(cargo);
	   }
	   
	   cadastroServiceCargo.salvar(cargo);
	   FacesUtil.addInfoMessage("Cadastrado com sucesso");
   }
	
   public boolean isEditando(){	   
	   return this.cargo.getId() != null;
	   
   }
	

}

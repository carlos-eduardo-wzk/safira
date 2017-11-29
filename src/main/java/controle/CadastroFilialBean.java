package controle;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Filial;
import service.CadastroFilialService;
import util.jsf.FacesUtil;

@Named
@ViewScoped
public class CadastroFilialBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private CadastroFilialService cadastroServiceFilial;;	
	private Filial filial;

	
	public CadastroFilialBean() {
		filial = new Filial();
	}
	
	public Filial getFilial() {
		return filial;
	}
	public void setFilial(Filial filial) {
		this.filial = filial;
	}

	
   public void salvar(){	  
	   cadastroServiceFilial.salvar(filial);
	   FacesUtil.addInfoMessage("Cadastrado com sucesso");
   }
	
   public boolean isEditando(){	   
	   return this.filial.getId() != null;
	   
   }
   
	

}

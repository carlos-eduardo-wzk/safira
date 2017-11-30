package controle;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Ocorrencia;
import service.CadastroOcorrenciaService;
import util.jsf.FacesUtil;

@Named
@ViewScoped
public class CadastroOcorrenciaBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private CadastroOcorrenciaService cadastroServiceOcorrencia;	
	
	private Ocorrencia ocorrencia;

	
	public CadastroOcorrenciaBean() {
		ocorrencia = new Ocorrencia();
	}
	
	public Ocorrencia getCargo() {
		return ocorrencia;
	}
	public void setOcorrencia(Ocorrencia ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	
   public void salvar(){	  
	   cadastroServiceOcorrencia.salvar(ocorrencia);	   	 
	   FacesUtil.addInfoMessage("Cadastrado com sucesso");
   }
	
   public boolean isEditando(){	   
	   return this.ocorrencia.getId() != null;
	   
   }

public Ocorrencia getOcorrencia() {
	return ocorrencia;
}
	

}

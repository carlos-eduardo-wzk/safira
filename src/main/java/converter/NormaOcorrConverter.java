package converter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import model.Ocorrencia;
import repository.Ocorrencias;

@ManagedBean
@ViewScoped
@FacesConverter("converter.NormaOcorrConverter")
public class NormaOcorrConverter implements Converter {
	
	@Inject
	private Ocorrencias ocorrencias;
	
	

	public NormaOcorrConverter() {
		
	}

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		Ocorrencia retorno = null;
		  if (value != null) {
			  int id = new Integer(value);			  			  
			retorno = ocorrencias.porId(id);
		  }
		return retorno;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		if (value != null){
			Ocorrencia ocorrencia = (Ocorrencia) value;
			return ocorrencia.getId().toString(); 					
		}
		return "";
	}	
}

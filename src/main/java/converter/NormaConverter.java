package converter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import model.Norma;
import repository.Normas;

@ManagedBean
@ViewScoped
@FacesConverter("converter.NormaConverter")
public class NormaConverter implements Converter {

	
	@Inject
	private Normas normas;
	
	public NormaConverter() {
      
	}
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		  Norma retorno = null;
		  if (value != null) {
			  Long id = new Long(value);
			  retorno = normas.porId(id); 
		  }
		return retorno;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		if (value != null){
			Norma norma = (Norma) value;
			return norma.getId() == null ? null : norma.getId().toString();
		}
		return "";
	}

}

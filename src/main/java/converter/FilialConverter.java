package converter;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;

import model.Filial;
import repository.Filiais;

@ManagedBean
@ViewScoped
public class FilialConverter implements Converter {

	
	@Inject
	private Filiais filiais;
	
	public FilialConverter() {
       
	}
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		  Filial retorno = null;
		  if (value != null) {
			  Long id = new Long(value);
			  retorno = filiais.porId(id); 
		  }
		return retorno;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		if (value != null){
			Filial filial = (Filial) value;
			return filial.getId() == null ? null : filial.getId().toString();
		}
		return "";
	}

}

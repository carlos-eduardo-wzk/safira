package converter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;

import model.Colaborador;
import repository.Colaboradores;

//@FacesConverter(forClass=Colaborador.class)
@ManagedBean
@ViewScoped
public class ColaboradorConverter implements Converter {

	
	@Inject
	private Colaboradores colaboradores;
	
	public ColaboradorConverter() {
		
	}
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		  Colaborador retorno = null;
		  if (value != null) {
			  Long id = new Long(value);
			  retorno = colaboradores.porId(id); 
		  }
		return retorno;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		if (value != null){
			Colaborador colaborador = (Colaborador) value;
			return colaborador.getId() == null ? null : colaborador.getId().toString();
		}
		return "";
	}

}

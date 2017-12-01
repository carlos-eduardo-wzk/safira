package converter;

import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;
import javax.inject.Named;

import model.Horario;
import repository.Horarios;

//@FacesConverter(forClass=Horario.class)
@Named
@ViewScoped
public class HorarioConverter implements Converter {

	
	@Inject
	private Horarios horarios;
	
	public HorarioConverter() {
      
	}
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		  Horario retorno = null;
		  if (value != null) {
			  Long id = new Long(value);
			  retorno = horarios.porId(id); 
		  }
		return retorno;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		if (value != null){
			Horario horario = (Horario) value;
			return horario.getId() == null ? null : horario.getId().toString();
		}
		return "";
	}

}



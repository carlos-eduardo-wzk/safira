package converter;

import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;
import javax.inject.Named;

import model.Relogio;
import repository.Relogios;

//@FacesConverter(forClass=Relogio.class)
@Named
@ViewScoped
public class RelogioConverter implements Converter {

	
	@Inject
	private Relogios relogios;
	
	public RelogioConverter() {
      // relogios = CDIServiceLocator.getBean(Relogios.class);
	}
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		Relogio retorno = null;
		  if (value != null) {
			  Long id = new Long(value);
			  retorno = relogios.porId(id); 
		  }
		return retorno;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		if (value != null){
			Relogio relogio = (Relogio) value;
			return relogio.getId() == null ? null : relogio.getId().toString();
		}
		return "";
	}

}

package converter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;

import model.Historico;
import repository.Historicos;

//@FacesConverter(forClass=Historico.class)
@ManagedBean
@ViewScoped
public class HistoricoConverter implements Converter {

	
	@Inject
	private Historicos historicos;
	
	public HistoricoConverter() {
		
	}
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		  Historico retorno = null;
		  if (value != null) {
			  Long id = new Long(value);
			  retorno = historicos.porId(id); 
		  }
		return retorno;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		if (value != null){
			Historico historico = (Historico) value;
			return historico.getId() == null ? null : historico.getId().toString();
		}
		return "";
	}

}

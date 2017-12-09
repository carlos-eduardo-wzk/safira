package converter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;

import model.Afastamento;
import repository.Afastamentos;

//@FacesConverter(forClass=Afastamento.class)
@ManagedBean
@ViewScoped
public class AfastamentoConverter implements Converter {

	
	@Inject
	private Afastamentos afastamentos;
	
	public AfastamentoConverter() {
		//afastamentos = CDIServiceLocator.getBean(Afastamentos.class);
	}
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		  Afastamento retorno = null;
		  if (value != null) {
			  Long id = new Long(value);
			  retorno = afastamentos.porId(id); 
		  }
		return retorno;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		if (value != null){
			Afastamento afastamento = (Afastamento) value;
			return afastamento.getId() == null ? null : afastamento.getId().toString();
		}
		return "";
	}

}

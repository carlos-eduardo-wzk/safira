package converter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;

import model.Jornada;
import repository.Jornadas;

//@FacesConverter(forClass=Jornada.class)
@ManagedBean
@ViewScoped
public class JornadaConverter implements Converter {

	@Inject
	private Jornadas jornadas;

	public JornadaConverter() {
		// jornadas = CDIServiceLocator.getBean(Jornadas.class);
	}

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		Jornada retorno = null;
		if (value != null) {
			Long id = new Long(value);
			retorno = jornadas.porId(id);
		}
		return retorno;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		if (value != null) {
			Jornada jornada = (Jornada) value;
			return jornada.getId() == null ? null : jornada.getId().toString();
		}
		return "";
	}

}

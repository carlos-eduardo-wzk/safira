package converter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;

import model.Folga;
import repository.Folgas;

//@FacesConverter(forClass=Folga.class)
@ManagedBean
@ViewScoped
public class FolgaConverter implements Converter {

	@Inject
	private Folgas folgas;

	public FolgaConverter() {
		// folgas = CDIServiceLocator.getBean(Folgas.class);
	}

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		Folga retorno = null;
		if (value != null) {
			Long id = new Long(value);
			retorno = folgas.porId(id);
		}
		return retorno;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		if (value != null) {
			Folga folga = (Folga) value;
			return folga.getId() == null ? null : folga.getId().toString();
		}
		return "";
	}

}

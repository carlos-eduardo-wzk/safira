package converter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;

import model.Depto;
import repository.Deptos;

@ManagedBean
@ViewScoped
public class DeptoConverter implements Converter {

	@Inject
	private Deptos deptos;

	public DeptoConverter() {

	}

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		Depto retorno = null;
		if (value != null) {
			Long id = new Long(value);
			retorno = deptos.porId(id);

		}
		return retorno;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		if (value != null) {
			Depto depto = (Depto) value;
			return depto.getId() == null ? null : depto.getId().toString();
		}
		return "";
	}

}

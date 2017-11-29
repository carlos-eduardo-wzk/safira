package converter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;

import model.Empresa;
import repository.Empresas;


@ManagedBean
@ViewScoped
public class EmpresaConverter implements Converter {

    @Inject
	private Empresas empresas;

	public EmpresaConverter() {

	}

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		Empresa retorno = null;
		if (value != null) {
			Long id = new Long(value);
			retorno = empresas.porId(id);
		}
		return retorno;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		if (value != null) {
			Empresa empresa = (Empresa) value;
			return empresa.getId() == null ? null : empresa.getId().toString();
		}
		return "";
	}

}

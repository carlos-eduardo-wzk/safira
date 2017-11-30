package converter;

import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;
import javax.inject.Named;

import model.Grupo;
import repository.Grupos;


@Named
@ViewScoped
public class GrupoConverter implements Converter {

	@Inject
	private Grupos grupos;
	
	public GrupoConverter() {

	}

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		System.out.println("aaa" + value);
		Grupo retorno = null;
		if (value != null) {
			Long id = new Long(value);
			System.out.println("aaaaa " + id);

			retorno = grupos.porId(id);
		}
		return retorno;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		System.out.println("bbb" + value);
		if (value != null) {
			Grupo grupo = (Grupo) value;
			return grupo.getId() == null ? null : grupo.getId().toString();
		}
		return "";
	}

}

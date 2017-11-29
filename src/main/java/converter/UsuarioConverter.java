package converter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;

import model.Usuario;
import repository.Usuarios;

@ManagedBean
@ViewScoped
public class UsuarioConverter implements Converter {

	@Inject
	private Usuarios usuarios;

	public UsuarioConverter() {

	}

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		Usuario retorno = null;
		if (value != null) {
			Long id = new Long(value);
			retorno = usuarios.porId(id);
		}
		return retorno;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		if (value != null) {
			Usuario usuario = (Usuario) value;
			return usuario.getId() == null ? null : usuario.getId().toString();
		}
		return "";
	}

}

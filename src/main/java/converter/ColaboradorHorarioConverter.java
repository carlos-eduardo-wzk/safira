package converter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;

import model.Horario;
import repository.Horarios;

//@FacesConverter("converter.ColaboradorHorarioConverter")
@ManagedBean
@ViewScoped
public class ColaboradorHorarioConverter implements Converter {

	@Inject
	private Horarios horarios;

	public ColaboradorHorarioConverter() {
		// horarios = CDIServiceLocator.getBean(Horarios.class);
	}

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		System.out.println(" object");
		Horario retorno = null;
		if (value != null) {
			System.out.println(" object 2");
			Long id = new Long(value);
			System.out.println(" object 3");
			retorno = horarios.porId(id);
			System.out.println(" object 4");
		}
		return retorno;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		if (value != null) {
			Horario horario = (Horario) value;
			return horario.getId().toString();
		}
		return "";
	}
}

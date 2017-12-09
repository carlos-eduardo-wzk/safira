package converter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;

import model.LanctoBancoHora;
import repository.LanctoBancoHoras;

//@FacesConverter(forClass=LanctoBancoHora.class)]
@ManagedBean
@ViewScoped
public class LanctoBancoHoraConverter implements Converter {

	@Inject
	private LanctoBancoHoras lanctoBancoHoras;

	public LanctoBancoHoraConverter() {
		// lanctoBancoHoras = CDIServiceLocator.getBean(LanctoBancoHoras.class);
	}

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		LanctoBancoHora retorno = null;
		if (value != null) {
			Long id = new Long(value);
			retorno = lanctoBancoHoras.porId(id);
		}
		return retorno;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		if (value != null) {
			LanctoBancoHora lanc = (LanctoBancoHora) value;
			return lanc.getId() == null ? null : lanc.getId().toString();
		}
		return "";
	}

}

package converter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;

import model.MotivoAbono;
import repository.MotivoAbonos;

//@FacesConverter(forClass=MotivoAbono.class)
@ManagedBean
@ViewScoped
public class MotivoAbonoConverter implements Converter {

	@Inject
	private MotivoAbonos motivoAbonos;

	public MotivoAbonoConverter() {
		// s motivoAbonos = CDIServiceLocator.getBean(MotivoAbonos.class);
	}

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		MotivoAbono retorno = null;
		if (value != null) {
			Long id = new Long(value);
			retorno = motivoAbonos.porId(id);
		}
		return retorno;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		if (value != null) {
			MotivoAbono motivoAbono = (MotivoAbono) value;
			return motivoAbono.getId() == null ? null : motivoAbono.getId().toString();
		}
		return "";
	}

}

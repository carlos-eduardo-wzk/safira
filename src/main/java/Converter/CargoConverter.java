package Converter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;

import model.Cargo;
import repository.Cargos;

//@FacesConverter(value="cargoConverter",forClass = Cargo.class)
@ManagedBean
@ViewScoped
public class CargoConverter implements Converter {

	@Inject
	private Cargos cargos;

	public CargoConverter() {

	
	}

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		Cargo retorno = null;
		if (value != null) {
			Long id = new Long(value);
			retorno = cargos.porId(id);

		}
		return retorno;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		if (value != null) {
			Cargo cargo = (Cargo) value;
			return cargo.getId() == null ? null : cargo.getId().toString();
		}
		return "";
	}

}

package converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("converter.Horas")
public class HorasConverter implements Converter {

	// @Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		// String Horas = "";
		// String min = "";

		String auxhoras = "";
		String auxmin = "";

		// pegar min e horas

		if (value.startsWith("0")) {
			auxhoras = value.substring(1, 2);
		} else {
			auxhoras = value.substring(0, 2);
		}

		if (value.substring(3, 4).equals("0")) {
			auxmin = value.substring(4, 5);
		} else {
			auxmin = value.substring(3, 5);
		}

		if ((value == "") || (value == null)) {
			HorasHHmm horasHHmm = new HorasHHmm("0000");
			return horasHHmm;
		}

		if ((Integer.parseInt(auxhoras) > 0) || (Integer.parseInt(auxmin) > 0)) {
		} else {
			HorasHHmm horasHHmm = new HorasHHmm("0000");
			return horasHHmm;
		}

		if (value.substring(3, 4).equals("0")) {
			auxmin = '0' + auxmin;
		}

		if (value.startsWith("0")) {
			auxhoras = '0' + auxhoras;
		}

		HorasHHmm horasHHmm = new HorasHHmm(auxhoras + ":" + auxmin);
		return horasHHmm;

	}

	// @Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {

		String Horas = "";
		String min = "";

		// String auxmin = "";
		// String auxhora = "";

		boolean negativo = false;

		if ((value == "") || (value == null)) {
			return "";
		}

		if (Integer.parseInt(value.toString()) == 0) {
			return "";
		}
		
		
		if (Integer.parseInt(value.toString()) < 0) {
			value = (Integer) value * -1;
			negativo = true;
		}

		
		
		// retita a virada do dia
		if (Integer.parseInt(value.toString()) > 1440) {
			value = (Integer) value - 1440;
		}

		if (Integer.parseInt(value.toString()) > 0) {
			Horas = String.valueOf(Integer.parseInt(value.toString()) / 60);
			min = String.valueOf(Integer.parseInt(value.toString()) % 60);
		} else {
//			Horas = String
//					.valueOf((Integer.parseInt(value.toString()) ) / 60);
//			min = String.valueOf((Integer.parseInt(value.toString()) ) % 60);
			// return "";
		}

		if (Integer.parseInt(value.toString()) % 60 < 10) {
			min = '0' + min;
		}

		if ((Integer.parseInt(value.toString()) / 60) < 10) {
			Horas = '0' + Horas;
		}

		if (negativo == true) {
			return "-"+Horas + ":" + min;
		} else {
			return Horas + ":" + min;
		}

	}
}

package converter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;

import repository.HorarioColaboradores;


@ManagedBean
@ViewScoped
public class HorarioColaboradorConverter implements Converter {

	@Inject
	private HorarioColaboradores horacolas;

	public HorarioColaboradorConverter() {
		// feriados = CDIServiceLocator.getBean(Feriados.class);
	}

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		HorarioColaboradores retorno = null;
		if (value != null) {
			

			String chave1 = (String) arg1.getAttributes().get("chave1"); // data
			String chave3 = (String) arg1.getAttributes().get("chave3"); // cod empresa

			System.out.println("converter hora cola" + chave1 + "--" + chave3);

			if (value != null) {
				Long id = new Long(chave3);
				// retorno = horacolas.po ;
			}

		}
		return retorno;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		 System.out.println("converter feriado string " + value);
		 System.out.println("arqg 1" + arg1);

		// if (value != null) {
		// Feriado feriado = (Feriado) value;
		// // return feriado.getId() == null ? null : feriado.getId().toString();
		// return "";
		// }
		return "";
	}

}

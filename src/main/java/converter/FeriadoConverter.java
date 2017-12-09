package converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;

import model.Feriado;
import repository.Feriados;

//@FacesConverter(forClass = Feriado.class
@ManagedBean
@ViewScoped
public class FeriadoConverter implements Converter {

	@Inject
	private Feriados feriados;

	public FeriadoConverter() {
		// feriados = CDIServiceLocator.getBean(Feriados.class);
	}

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		Feriado retorno = null;
		if (value != null) {

			String chave1 = (String) arg1.getAttributes().get("chave1"); // data
			String chave3 = (String) arg1.getAttributes().get("chave3"); // cod empresa

			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			Date data = null;
			
			System.out.println("converter feriado  " + value);

			try {
				// pega parte da data
				data = formatter.parse(chave1.substring(0, 10));
			} catch (ParseException e) {
				e.printStackTrace();
			}

			if (value != null) {
				Long id = new Long(chave3);
				retorno = feriados.porDataEmpresa(data, id);
			}

		}
		return retorno;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		//System.out.println("converter feriado string" + value);
		//System.out.println("arqg 1" + arg1);
		
//		if (value != null) {
//			Feriado feriado = (Feriado) value;
//			// return feriado.getId() == null ? null : feriado.getId().toString();
//			return "";
//		}
		return "";
	}

}

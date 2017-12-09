package converter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;

import model.HorarioAvulso;
import repository.HorarioAvulsos;

//@FacesConverter(forClass=HorarioAvulso.class)
@ManagedBean
@ViewScoped
public class HorarioAvulsoConverter implements Converter {

	
	@Inject
	private HorarioAvulsos horarioAvulsos;
	
	public HorarioAvulsoConverter() {
		//horarioAvulsos = CDIServiceLocator.getBean(HorarioAvulsos.class);
	}
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		System.out.println("horario avulso converter ojject " + value );
		HorarioAvulso retorno = null;
		  if (value != null) {
			  Long id = new Long(value);
			  retorno = horarioAvulsos.porId(id); 
		  }
		return retorno;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		System.out.println("horario avulso converter Strinf " + value );
		if (value != null){
			HorarioAvulso horarioAvulso = (HorarioAvulso) value;
			return horarioAvulso.getId() == null ? null : horarioAvulso.getId().toString();
		}
		return "";
	}

}

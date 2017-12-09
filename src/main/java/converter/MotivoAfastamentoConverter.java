package converter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;

import model.MotivoAfastamento;
import repository.MotivoAfastamentos;

//@FacesConverter(forClass=MotivoAfastamento.class)
@ManagedBean
@ViewScoped
public class MotivoAfastamentoConverter implements Converter {

   @Inject
	private MotivoAfastamentos motivoAfastamentos;

	public MotivoAfastamentoConverter() {
		// motivoAfastamentos = CDIServiceLocator.getBean(MotivoAfastamentos.class);
	}

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		System.out.println(" aaa " + value);
		MotivoAfastamento retorno = null;
		if (value != null) {
			Long id = new Long(value);
			retorno = motivoAfastamentos.porId(id);
		}
		return retorno;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		if (value != null) {
			MotivoAfastamento motivoAfastamento = (MotivoAfastamento) value;
			return motivoAfastamento.getId() == null ? null : motivoAfastamento.getId().toString();
		}
		return "";
	}

}

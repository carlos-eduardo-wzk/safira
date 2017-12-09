package filter;

import java.io.Serializable;
import java.util.Date;


public class FeriadoFilter implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String feriado;
	private Date datafer;
	private String empresa;
	
	public String getFeriado() {
		return feriado;
	}
	public void setFeriado(String feriado) {
		this.feriado = feriado;
	}
	public Date getDatafer() {
		return datafer;
	}
	public void setDatafer(Date datafer) {
		this.datafer = datafer;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	
}

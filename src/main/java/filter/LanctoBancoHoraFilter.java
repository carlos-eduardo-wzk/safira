package filter;

import java.io.Serializable;
import java.util.Date;

public class LanctoBancoHoraFilter implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Date dataini;
	private Date datafim;	
	private String colaborador;
	
	public String getColaborador() {
		return colaborador;
	}
	public void setColaborador(String colaborador) {
		this.colaborador = colaborador;
	}
	public Date getDataini() {
		return dataini;
	}
	public void setDataini(Date dataini) {
		this.dataini = dataini;
	}
	public Date getDatafim() {
		return datafim;
	}
	public void setDatafim(Date datafim) {
		this.datafim = datafim;
	}	
	
	
	
}

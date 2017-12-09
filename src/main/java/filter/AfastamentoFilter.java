package filter;

import java.io.Serializable;
import java.util.Date;


public class AfastamentoFilter implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String afastamento;
	private Date dataini;
	private Date datafim;	
	private String motivoAfastamento;
	private String colaborador;
	

	public String getAfastamento() {
		return afastamento;
	}

	public void setAfastamento(String afastamento) {
		this.afastamento = afastamento;
	}

	public Date getDataini() {
		return dataini;
	}

	public void setDataini(Date dataini) {
		this.dataini = dataini;
	}

	public String getMotivoAfastamento() {
		return motivoAfastamento;
	}

	public void setMotivoAfastamento(String motivoAfastamento) {
		this.motivoAfastamento = motivoAfastamento;
	}

	public String getColaborador() {
		return colaborador;
	}

	public void setColaborador(String colaborador) {
		this.colaborador = colaborador;
	}

	public Date getDatafim() {
		return datafim;
	}

	public void setDatafim(Date datafim) {
		this.datafim = datafim;
	}

	
	

	
}

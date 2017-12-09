package filter;

import java.io.Serializable;
import java.util.Date;


public class HorarioAvulsoFilter implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String horarioAvulso;
	private Date dataini;
	private Date datafim;	
	private String horario;
	private String colaborador;
	
	public String getHorarioAvulso() {
		return horarioAvulso;
	}
	public void setHorarioAvulso(String horarioAvulso) {
		this.horarioAvulso = horarioAvulso;
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
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getColaborador() {
		return colaborador;
	}
	public void setColaborador(String colaborador) {
		this.colaborador = colaborador;
	}
	

	
}

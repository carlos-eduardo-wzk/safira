package filter;

import java.io.Serializable;


public class HorarioColaboradorFilter implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long colaboradorId ;
	private Long horarioId ;
	public Long getColaboradorId() {
		return colaboradorId;
	}
	public void setColaboradorId(Long colaboradorId) {
		this.colaboradorId = colaboradorId;
	}
	public Long getHorarioId() {
		return horarioId;
	}
	public void setHorarioId(Long horarioId) {
		this.horarioId = horarioId;
	}
	
	
}

package filter;

import java.io.Serializable;

public class NormaColaboradorFilter implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long colaboradorId ;
	private Long NormaId ;
	
	
	public Long getColaboradorId() {
		return colaboradorId;
	}
	public void setColaboradorId(Long colaboradorId) {
		this.colaboradorId = colaboradorId;
	}
	public Long getNormaId() {
		return NormaId;
	}
	public void setNormaId(Long normaId) {
		NormaId = normaId;
	}
	
	
	

}

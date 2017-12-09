package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class FeriadoPK implements Serializable {

	private static final long serialVersionUID = 1L;
	

	@Column(name="data_feriado")
	private Date dataFeriado;
		
	@ManyToOne
	@JoinColumn(name = "empresa_id", nullable = true)
	private Empresa empresa;

	public FeriadoPK() {
	
	}
	
	
	
	
	public FeriadoPK(Date dataFeriado, Empresa empresa) {
		super();
		this.dataFeriado = dataFeriado;
		this.empresa = empresa;
	}




	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}


	public Date getDataFeriado() {
		return dataFeriado;
	}


	public void setDataFeriado(Date dataFeriado) {
		this.dataFeriado = dataFeriado;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dataFeriado == null) ? 0 : dataFeriado.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FeriadoPK other = (FeriadoPK) obj;
		if (dataFeriado == null) {
			if (other.dataFeriado != null)
				return false;
		} else if (!dataFeriado.equals(other.dataFeriado))
			return false;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		return true;
	}
	
	
	
	
	

}

package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ocorrencia implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer Id;
	@Column(length=80)
	private String ocorrencia;
	private String agrupamento;
	
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getOcorrencia() {
		return ocorrencia;
	}
	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia.toUpperCase();
	}
	
	
	
	public String getAgrupamento() {
		return agrupamento;
	}
	public void setAgrupamento(String agrupamento) {
		this.agrupamento = agrupamento;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
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
		Ocorrencia other = (Ocorrencia) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Ocorrencia [Id=" + Id + ", ocorrencia=" + ocorrencia
				+ ", agrupamento=" + agrupamento + "]";
	}
	
	

}

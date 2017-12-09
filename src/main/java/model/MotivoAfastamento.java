package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MotivoAfastamento implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long Id;
	@Column(nullable = false, length = 200)
	private String motivoAfastamento;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getMotivoAfastamento() {
		return motivoAfastamento;
	}
	public void setMotivoAfastamento(String motivoAfastamento) {
		this.motivoAfastamento = motivoAfastamento.toUpperCase();
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime
				* result
				+ ((motivoAfastamento == null) ? 0 : motivoAfastamento
						.hashCode());
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
		MotivoAfastamento other = (MotivoAfastamento) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (motivoAfastamento == null) {
			if (other.motivoAfastamento != null)
				return false;
		} else if (!motivoAfastamento.equals(other.motivoAfastamento))
			return false;
		return true;
	}


	
	
}

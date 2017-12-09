package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MotivoAbono implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long Id;
	@Column(nullable=false,  length=200)
	private String motivoAbono;
		
		public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getMotivoAbono() {
		return motivoAbono;
	}

	public void setMotivoAbono(String motivoAbono) {
		this.motivoAbono = motivoAbono.toUpperCase();
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
		MotivoAbono other = (MotivoAbono) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}

	
	
	}

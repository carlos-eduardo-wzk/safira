package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Filial implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long Id;
	@NotBlank
	@Column(length = 100)
	private String filial;
	@Column(length = 14)
	private String cnpj;
	@Column(length = 10)
	private String sigla;	
	@Column(name = "impressao_espelho")
	private boolean impressaoEspelho;

	
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getFilial() {
		return filial;
	}

	public void setFilial(String filial) {
		this.filial = filial.toUpperCase();
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public boolean isImpressaoEspelho() {
		return impressaoEspelho;
	}

	public void setImpressaoEspelho(boolean impressaoEspelho) {
		this.impressaoEspelho = impressaoEspelho;
	}

		
	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla.toUpperCase();
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
		Filial other = (Filial) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Filial [Id=" + Id + ", filial=" + filial + ", cnpj=" + cnpj
				+ ", impressaoEspelho=" + impressaoEspelho + "]";
	}


	

}

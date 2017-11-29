package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Depto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long Id;
	@Column(nullable = false, length = 80)
	private String depto;

	@Column(length = 10)
	private String sigla;

	@Column(name = "empressao_espelho")
	private boolean ImpressaoEspelho;
	@Column(length = 100)
	private String endereco;
	@Column(length = 25)
	private String bairro;
	@Column(length = 25)
	private String cidade;
	@Enumerated(EnumType.STRING)
	@Column(nullable = false, length = 2)
	private UnidadeFederacao uf;
	@Column(length = 9)
	private String cep;
	private String email;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getDepto() {
		return depto;
	}
	public void setDepto(String depto) {
		this.depto = depto;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public boolean isImpressaoEspelho() {
		return ImpressaoEspelho;
	}
	public void setImpressaoEspelho(boolean impressaoEspelho) {
		ImpressaoEspelho = impressaoEspelho;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public UnidadeFederacao getUf() {
		return uf;
	}
	public void setUf(UnidadeFederacao uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
		Depto other = (Depto) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Depto [Id=" + Id + ", depto=" + depto + ", sigla=" + sigla + ", ImpressaoEspelho=" + ImpressaoEspelho
				+ ", endereco=" + endereco + ", bairro=" + bairro + ", cidade=" + cidade + ", uf=" + uf + ", cep=" + cep
				+ ", email=" + email + "]";
	}
	
	
	
	

}

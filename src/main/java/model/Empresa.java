package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Empresa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long Id;

	@Column(name = "razao_social", length = 100)
	private String razaoSocial;
	@Column(length = 40)
	private String fantasia;
	@Column(length = 14)
	private String cnpj;
	private String cei;
	@Column(length = 20)
	private String cnai;
	@Column(length = 100)
	private String atividade;

	@Column(length = 100)
	private String endereco;
	@Column(length = 25)
	private String bairro;
	@Column(length = 25)
	private String cidade;
	@Enumerated(EnumType.STRING)
	@Column(nullable = true, length = 20)
	private UnidadeFederacao uf;
	@Column(length = 9)
	private String cep;
	@Column(length = 200)
	private String email;

	

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial.toUpperCase();
	}

	public String getFantasia() {
		return fantasia;
	}

	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCei() {
		return cei;
	}

	public void setCei(String cei) {
		this.cei = cei;
	}

	public String getCnai() {
		return cnai;
	}

	public void setCnai(String cnai) {
		this.cnai = cnai;
	}

	public String getAtividade() {
		return atividade;
	}

	public void setAtividade(String atividade) {
		this.atividade = atividade;
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
		Empresa other = (Empresa) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Empresa [Id=" + Id + ", razaoSocial=" + razaoSocial + ", fantasia=" + fantasia + ", cnpj=" + cnpj
				+ ", cei=" + cei + ", cnai=" + cnai + ", atividade=" + atividade + ", endereco=" + endereco
				+ ", bairro=" + bairro + ", cidade=" + cidade + ", uf=" + uf + ", cep=" + cep + ", email=" + email
				+ "]";
	}

	
}

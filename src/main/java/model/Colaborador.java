package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Colaborador implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long Id;
	@Column(length=80)
	private String nome;
	@Column(length=12)
	private String pis;
	@Column(name="data_nasc")
	private Date dataNasc;
	@Column(name="data_admissao")
	private Date dataAdmissao;
	@Column(name="data_demissao")
	private Date dataDemissao;	
	@Column(name="data_criacao")
	private Date dataCriacao;
	@Column(length=14)
	private String cpf;
	@Column(length=18)
	private String matricula;
	@Column(length=18)
	private String cartao;
	@Column(length=18)
	private String codigoFolha;
	@Column(length=20)
	private String rg;
	@Column(length=20)
	private String ctps;
	@Column(length=20)
	private String ctpsSerie;	
	@Column(length=200)
	private String email;	
	@Column(length=10)
	private String senha;
	
	@Column(name="usa_banco")
	private Boolean usaBanco ;
	
	private String horista ;
	
	@Column(length = 100)
	private String endereco;
	@Column(length = 25)
	private String bairro;
	@Column(length = 25)
	private String cidade;
	@Enumerated(EnumType.STRING)
	@Column(nullable = true, length = 2)
	private UnidadeFederacao uf;
	@Column(length = 9)
	private String cep;
	
	@Column(length = 50)
	private String telefone;
	@Column(length = 50)
	private String celular;
	
	@Column(name="foto_caminho")
	private String fotoCaminho;
	
				
	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		
       
       if (dataCriacao == null){
    	   dataCriacao = new Date(System.currentTimeMillis());
       }
								
		this.dataCriacao = dataCriacao;
	}
	
	@ManyToOne (fetch=FetchType.LAZY)
	@JoinColumn(name = "empresa_id", nullable = true)
	private Empresa empresa;

	@ManyToOne (fetch=FetchType.LAZY)
	@JoinColumn(name = "filial_id", nullable = true)
	private Filial filial;
	
	@ManyToOne (fetch=FetchType.LAZY)
	@JoinColumn(name = "depto_id", nullable = true)
	private Depto depto;
	
	@ManyToOne (fetch=FetchType.EAGER)
	@JoinColumn(name = "cargo_id", nullable = true)
	private Cargo cargo;
	
	
	@OneToMany(mappedBy="colaborador")
	private List<HorarioColaborador> lstHorarioColaborador;
	
			
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}

	public String getPis() {
		return pis;
	}

	public void setPis(String pis) {
		this.pis = pis;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Date getDataDemissao() {
		return dataDemissao;
	}

	public void setDataDemissao(Date dataDemissao) {
		this.dataDemissao = dataDemissao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCartao() {
		return cartao;
	}

	public void setCartao(String cartao) {
		this.cartao = cartao;
	}

	public String getCodigoFolha() {
		return codigoFolha;
	}

	public void setCodigoFolha(String codigoFolha) {
		this.codigoFolha = codigoFolha;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCtps() {
		return ctps;
	}

	public void setCtps(String ctps) {
		this.ctps = ctps;
	}

	public String getCtpsSerie() {
		return ctpsSerie;
	}

	public void setCtpsSerie(String ctpsSerie) {
		this.ctpsSerie = ctpsSerie;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Filial getFilial() {
		return filial;
	}

	public void setFilial(Filial filial) {
		this.filial = filial;
	}

	public Depto getDepto() {
		return depto;
	}

	public void setDepto(Depto depto) {
		this.depto = depto;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

		
	public Boolean getUsaBanco() {
		return usaBanco;
	}

	public void setUsaBanco(Boolean usaBanco) {
		this.usaBanco = usaBanco;
	}

	public String getHorista() {
		return horista;
	}

	public void setHorista(String horista) {
		this.horista = horista;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco.toUpperCase();
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro.toUpperCase();
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade.toUpperCase();
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getFotoCaminho() {
		return fotoCaminho;
	}

	public void setFotoCaminho(String fotoCaminho) {
		this.fotoCaminho = fotoCaminho;
	}

	
	
	
		
	public List<HorarioColaborador> getLstHorarioColaborador() {
		return lstHorarioColaborador;
	}

	public void setLstHorarioColaborador(
			List<HorarioColaborador> lstHorarioColaborador) {
		this.lstHorarioColaborador = lstHorarioColaborador;
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
		Colaborador other = (Colaborador) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Colaborador [Id=" + Id + ", nome=" + nome + ", pis=" + pis
				+ "]";
	}


	

}


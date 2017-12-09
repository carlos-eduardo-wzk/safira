package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Acerto implements Serializable {

	private static final long serialVersionUID = 1L;

	public Acerto() {
	}

	public Acerto(Long id, Date data, Date dataAbono, Integer horas,
			Integer horasAbonadas, String motivoAbono, Long colaborador_id,
			Integer h1, Integer h2, Integer h3, Integer h4, Integer h5,
			Integer h6, Integer h7, Integer h8, String nome,
			Integer ocorrencia_id, String ocorrencia, Integer empresa_id,
			Integer filial_id, Integer depto_id, String matricula, String pis) {
		super();
		Id = id;
		this.data = data;
		DataAbono = dataAbono;
		this.horas = horas;
		this.horasAbonadas = horasAbonadas;
		this.motivoAbono = motivoAbono;
		this.colaborador_id = colaborador_id;
		this.h1 = h1;
		this.h2 = h2;
		this.h3 = h3;
		this.h4 = h4;
		this.h5 = h5;
		this.h6 = h6;
		this.h7 = h7;
		this.h8 = h8;
		this.nome = nome;
		this.ocorrencia_id = ocorrencia_id;
		this.ocorrencia = ocorrencia;
		this.empresa_id = empresa_id;
		this.filial_id = filial_id;
		this.depto_id = depto_id;
		this.matricula = matricula;
		this.pis = pis;
	}

	@Id
	@GeneratedValue
	private Long Id;
	private Date data;
	private Date DataAbono;
	private Integer horas;
	private Integer horasAbonadas;
	private String motivoAbono;
	private Long colaborador_id;
	private Integer h1;
	private Integer h2;
	private Integer h3;
	private Integer h4;
	private Integer h5;
	private Integer h6;
	private Integer h7;
	private Integer h8;
	private String nome;
	private Integer ocorrencia_id;
	private String ocorrencia;
	private Integer empresa_id;
	private Integer filial_id;
	private Integer depto_id;
	private String matricula;
	private String pis;

	@Transient
	private String agrupamento;

	
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getDataAbono() {
		return DataAbono;
	}

	public void setDataAbono(Date dataAbono) {
		DataAbono = dataAbono;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Integer getHorasAbonadas() {
		return horasAbonadas;
	}

	public void setHorasAbonadas(Integer horasAbonadas) {
		this.horasAbonadas = horasAbonadas;
	}

	public String getMotivoAbono() {
		return motivoAbono;
	}

	public void setMotivoAbono(String motivoAbono) {
		this.motivoAbono = motivoAbono;
	}

	public Long getColaborador_id() {
		return colaborador_id;
	}

	public void setColaborador_id(Long colaborador_id) {
		this.colaborador_id = colaborador_id;
	}

	public Integer getH1() {
		return h1;
	}

	public void setH1(Integer h1) {
		this.h1 = h1;
	}

	public Integer getH2() {
		return h2;
	}

	public void setH2(Integer h2) {
		this.h2 = h2;
	}

	public Integer getH3() {
		return h3;
	}

	public void setH3(Integer h3) {
		this.h3 = h3;
	}

	public Integer getH4() {
		return h4;
	}

	public void setH4(Integer h4) {
		this.h4 = h4;
	}

	public Integer getH5() {
		return h5;
	}

	public void setH5(Integer h5) {
		this.h5 = h5;
	}

	public Integer getH6() {
		return h6;
	}

	public void setH6(Integer h6) {
		this.h6 = h6;
	}

	public Integer getH7() {
		return h7;
	}

	public void setH7(Integer h7) {
		this.h7 = h7;
	}

	public Integer getH8() {
		return h8;
	}

	public void setH8(Integer h8) {
		this.h8 = h8;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	public Integer getOcorrencia_id() {
		return ocorrencia_id;
	}

	public void setOcorrencia_id(Integer ocorrencia_id) {
		this.ocorrencia_id = ocorrencia_id;
	}

	public Integer getEmpresa_id() {
		return empresa_id;
	}

	public void setEmpresa_id(Integer empresa_id) {
		this.empresa_id = empresa_id;
	}

	public Integer getFilial_id() {
		return filial_id;
	}

	public void setFilial_id(Integer filial_id) {
		this.filial_id = filial_id;
	}

	public Integer getDepto_id() {
		return depto_id;
	}

	public void setDepto_id(Integer depto_id) {
		this.depto_id = depto_id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getPis() {
		return pis;
	}

	public void setPis(String pis) {
		this.pis = pis;
	}

	@Override
	public String toString() {
		return "Acerto [Id=" + Id + ", data=" + data + ", DataAbono="
				+ DataAbono + ", horas=" + horas + ", horasAbonadas="
				+ horasAbonadas + ", motivoAbono=" + motivoAbono
				+ ", colaborador_id=" + colaborador_id + ", h1=" + h1 + ", h2="
				+ h2 + ", h3=" + h3 + ", h4=" + h4 + ", h5=" + h5 + ", h6="
				+ h6 + ", h7=" + h7 + ", h8=" + h8 + ", nome=" + nome
				+ ", ocorrencia_id=" + ocorrencia_id + ", ocorrencia="
				+ ocorrencia + ", empresa_id=" + empresa_id + ", filial_id="
				+ filial_id + ", depto_id=" + depto_id + ", matricula="
				+ matricula + ", pis=" + pis + "]";
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
		Acerto other = (Acerto) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}

	
}

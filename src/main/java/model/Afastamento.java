package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "afastamento", indexes = { @Index(name="i_afastamento",unique = true, columnList = "colaborador_id,data_afastamento_inicial,data_afastamento_final") })
public class Afastamento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long Id;
	
	@Column(name="data_afastamento_inicial")
	private Date dataAfastamentoIni;

	@Column(name="data_afastamento_final")
	private Date dataAfastamentoFim;

	@ManyToOne
	@JoinColumn(name = "colaborador_id", nullable = true)
	private Colaborador colaborador;
	
	@ManyToOne
	@JoinColumn(name = "motivoAfastamento_id", nullable = true)
	private MotivoAfastamento motivoAfastamento;
	
	private String CID;

	public Afastamento() {
	}
	
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Date getDataAfastamentoIni() {
		return dataAfastamentoIni;
	}

	public void setDataAfastamentoIni(Date dataAfastamentoIni) {
		this.dataAfastamentoIni = dataAfastamentoIni;
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public MotivoAfastamento getMotivoAfastamento() {
		return motivoAfastamento;
	}

	public void setMotivoAfastamento(MotivoAfastamento motivoAfastamento) {
		this.motivoAfastamento = motivoAfastamento;
	}

	public String getCID() {
		return CID;
	}

	public void setCID(String cID) {
		CID = cID;
	}


	public Date getDataAfastamentoFim() {
		return dataAfastamentoFim;
	}


	public void setDataAfastamentoFim(Date dataAfastamentoFim) {
		this.dataAfastamentoFim = dataAfastamentoFim;
	}


	
	
	@Override
	public String toString() {
		return "Afastamento [Id=" + Id + ", dataAfastamentoIni="
				+ dataAfastamentoIni + ", dataAfastamentoFim="
				+ dataAfastamentoFim + ", colaborador=" + colaborador
				+ ", motivoAfastamento=" + motivoAfastamento + ", CID=" + CID
				+ "]";
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
		Afastamento other = (Afastamento) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}


	
	
	
	

}

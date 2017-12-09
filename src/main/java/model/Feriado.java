package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(FeriadoPK.class)
public class Feriado implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "data_feriado")
	private Date dataFeriado;

	@Id
	@ManyToOne
	@JoinColumn(name = "empresa_id", nullable = true)
	private Empresa empresa;

	@Column(nullable = false, length = 150)
	private String feriado;
	private Integer duracao;
	private boolean nacional;

	public String getFeriado() {
		return feriado;
	}

	public void setFeriado(String feriado) {
		this.feriado = feriado.toUpperCase();
	}

	public Date getDataFeriado() {
		return dataFeriado;
	}

	public void setDataFeriado(Date dataFeriado) {
		this.dataFeriado = dataFeriado;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	public boolean isNacional() {
		return nacional;
	}

	public void setNacional(boolean nacional) {
		this.nacional = nacional;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dataFeriado == null) ? 0 : dataFeriado.hashCode());
		result = prime * result + ((duracao == null) ? 0 : duracao.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result + ((feriado == null) ? 0 : feriado.hashCode());
		result = prime * result + (nacional ? 1231 : 1237);
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
		Feriado other = (Feriado) obj;
		if (dataFeriado == null) {
			if (other.dataFeriado != null)
				return false;
		} else if (!dataFeriado.equals(other.dataFeriado))
			return false;
		if (duracao == null) {
			if (other.duracao != null)
				return false;
		} else if (!duracao.equals(other.duracao))
			return false;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		if (feriado == null) {
			if (other.feriado != null)
				return false;
		} else if (!feriado.equals(other.feriado))
			return false;
		if (nacional != other.nacional)
			return false;
		return true;
	}

}

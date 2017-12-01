package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="horario_colaborador")
@IdClass(HorarioColaboradorPK.class)
public class HorarioColaborador implements Serializable {

	private static final long serialVersionUID = 1L;

	
	@Id
	@ManyToOne
	@JoinColumn(name = "horario_id", nullable = false)
	private Horario horario;
	
	
	@Id
	@ManyToOne
	@JoinColumn(name = "colaborador_id", nullable = false)
	private Colaborador colaborador;

	
	@Id
	@Column(name="data_inicio")
	private Date dataInicio;	
	
	
	private String motivo;
		
	

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}


	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((colaborador == null) ? 0 : colaborador.hashCode());
		result = prime * result + ((horario == null) ? 0 : horario.hashCode());
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
		HorarioColaborador other = (HorarioColaborador) obj;
		if (colaborador == null) {
			if (other.colaborador != null)
				return false;
		} else if (!colaborador.equals(other.colaborador))
			return false;
		if (horario == null) {
			if (other.horario != null)
				return false;
		} else if (!horario.equals(other.horario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HorarioColaborador [horario=" + horario + ", colaborador="
				+ colaborador + ", dataInicio=" + dataInicio + ", motivo="
				+ motivo + "]";
	}



	
	
	

}

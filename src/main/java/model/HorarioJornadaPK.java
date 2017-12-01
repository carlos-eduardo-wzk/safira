package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class HorarioJornadaPK implements Serializable {
		
	private static final long serialVersionUID = 1L;

	@Column(name="horario_id")
	private Long horarioId;
	
	@Column(name="Jornada_id")
	private Long JornadaId;
	
	
	
	public HorarioJornadaPK() {
	}

	public HorarioJornadaPK(Long horarioId, Long jornadaId, int seq) {
		this.horarioId = horarioId;
		JornadaId = jornadaId;
		this.seq = seq;
	}

	private int seq;

	public Long getHorarioId() {
		return horarioId;
	}

	public void setHorarioId(Long horarioId) {
		this.horarioId = horarioId;
	}

	public Long getJornadaId() {
		return JornadaId;
	}

	public void setJornadaId(Long jornadaId) {
		JornadaId = jornadaId;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((JornadaId == null) ? 0 : JornadaId.hashCode());
		result = prime * result
				+ ((horarioId == null) ? 0 : horarioId.hashCode());
		result = prime * result + seq;
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
		HorarioJornadaPK other = (HorarioJornadaPK) obj;
		if (JornadaId == null) {
			if (other.JornadaId != null)
				return false;
		} else if (!JornadaId.equals(other.JornadaId))
			return false;
		if (horarioId == null) {
			if (other.horarioId != null)
				return false;
		} else if (!horarioId.equals(other.horarioId))
			return false;
		if (seq != other.seq)
			return false;
		return true;
	}	

	
	
}

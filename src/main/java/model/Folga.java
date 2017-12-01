package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Folga implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long Id;
	
	@Column(name="data_afastamento_inicial")
	private Date dataFolgaIni;

	@Column(name="data_afastamento_final")
	private Date dataFolgaFim;

	//@ManyToOne
	//@JoinColumn(name = "colaborador_id", nullable = true)
	//private Colaborador colaborador;
	
	private String obs;

	
	
	
	public Date getDataFolgaIni() {
		return dataFolgaIni;
	}

	public void setDataFolgaIni(Date dataFolgaIni) {
		this.dataFolgaIni = dataFolgaIni;
	}

	public Date getDataFolgaFim() {
		return dataFolgaFim;
	}

	public void setDataFolgaFim(Date dataFolgaFim) {
		this.dataFolgaFim = dataFolgaFim;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}


//	public Colaborador getColaborador() {
//		return colaborador;
//	}
//
//	public void setColaborador(Colaborador colaborador) {
//		this.colaborador = colaborador;
//	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
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
		Folga other = (Folga) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Folga [Id=" + Id + ", dataFolgaIni=" + dataFolgaIni + ", dataFolgaFim=" + dataFolgaFim + ", obs=" + obs
				+ "]";
	}



			
	
}

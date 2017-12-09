package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="lanctoBancoHora")
public class LanctoBancoHora implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id	
	@GeneratedValue
	private Long Id;
	private Date data;
	
	@ManyToOne 
	@JoinColumn(name = "colaborador_id", nullable = true)
	private Colaborador colaborador;
		
	
	private Integer horas;
	
	@Enumerated(EnumType.STRING)	
	private TipoLacto tipo_lancto = TipoLacto.DEBITO  ;
	
	@Enumerated(EnumType.STRING)	
	private TipoAjusteBanco tipo_ajuste_banco = TipoAjusteBanco.SALDOINICIAL ;

	
	
	
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

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public TipoLacto getTipo_lancto() {
		return tipo_lancto;
	}

	public void setTipo_lancto(TipoLacto tipo_lancto) {
		this.tipo_lancto = tipo_lancto;
	}

	public TipoAjusteBanco getTipo_ajuste_banco() {
		return tipo_ajuste_banco;
	}

	public void setTipo_ajuste_banco(TipoAjusteBanco tipo_ajuste_banco) {
		this.tipo_ajuste_banco = tipo_ajuste_banco;
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
		LanctoBancoHora other = (LanctoBancoHora) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LanctoBancoHoras [Id=" + Id + ", data=" + data
				+ ", colaborador=" + colaborador + ", horas=" + horas
				+ ", tipo_lancto=" + tipo_lancto + ", tipo_ajuste_banco="
				+ tipo_ajuste_banco + "]";
	}
	
	
	
	
}

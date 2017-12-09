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
@Table(name = "horario_Avulso", indexes = { @Index(name="i_horario_avulso",unique = true, columnList = "colaborador_id,data_horario_inicial,data_horario_final") })
public class HorarioAvulso implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long Id;
	
	@Column(name="data_horario_inicial")
	private Date dataHorarioIni;

	@Column(name="data_horario_final")
	private Date dataHorarioFim;

	@ManyToOne
	@JoinColumn(name = "colaborador_id", nullable = true)
	private Colaborador colaborador;
	
	@ManyToOne
	@JoinColumn(name = "horario_id", nullable = true)
	private Horario horario;
	
	private String obs;

	public HorarioAvulso() {
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Date getDataHorarioIni() {
		return dataHorarioIni;
	}

	public void setDataHorarioIni(Date dataHorarioIni) {
		this.dataHorarioIni = dataHorarioIni;
	}

	public Date getDataHorarioFim() {
		return dataHorarioFim;
	}

	public void setDataHorarioFim(Date dataHorarioFim) {
		this.dataHorarioFim = dataHorarioFim;
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}
	
}

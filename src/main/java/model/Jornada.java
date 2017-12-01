package model;

import java.beans.Transient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Jornada implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "jornada_id")
	private Long Id;
	@Column(nullable = false, length = 150)
	private String jornada;

	private Integer e1;
	private Integer s1;
	private Integer e2;
	private Integer s2;
	private Integer e3;
	private Integer s3;
	private Integer e4;
	private Integer s4;
	private Integer tole1ant = 0;
	private Integer tole1dep = 0;
	private Integer tols1ant = 0;
	private Integer tols1dep = 0;
	private Integer tole2ant;
	private Integer tole2dep;
	private Integer tols2ant;
	private Integer tols2dep;
	private Integer tole3ant;
	private Integer tole3dep;
	private Integer tols3ant;
	private Integer tols3dep;
	private Integer tole4ant;
	private Integer tole4dep;
	private Integer tols4ant;
	private Integer tols4dep;
	private Integer tole5ant;
	private Integer tole5dep;
	private Integer tols5ant;
	private Integer tols5dep;
	private Integer tole6ant;
	private Integer tole6dep;
	private Integer tols6ant;
	private Integer tols6dep;
	private Integer tole7ant;
	private Integer tole7dep;
	private Integer tols7ant;
	private Integer tols7dep;
	private Integer tole8ant;
	private Integer tole8dep;
	private Integer tols8ant;
	private Integer tols8dep;

	private Integer preassinalados1;
	private Integer preassinaladoe2;

	@Column(name = "desc_inter_duas_marcacoes")
	private Integer descIntervaloDuasMarcacoes;

	private Integer flexRefeicaoAntes;
	private Integer flexRefeicaoDepois;

	@Enumerated(EnumType.STRING)
	private TipoRegime tipoRegime = TipoRegime.FIXO;

	private Integer fechamento;
	private Integer DSR;

	
	// @ManyToOne
	// @JoinColumn(name="horario_id")
	
	@ManyToMany(targetEntity=Horario.class)
	@JoinTable(name = "horario_jornada", joinColumns = @JoinColumn(name = "jornada_id"), inverseJoinColumns = @JoinColumn(name = "horario_id"))
	private List<Horario> horarios = new ArrayList<>();


	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getJornada() {
		return jornada;
	}

	public void setJornada(String jornada) {
		this.jornada = jornada.toUpperCase();
	}

	public Integer getE1() {
		return e1;
	}

	public void setE1(Integer e1) {
		this.e1 = e1;
	}

	public Integer getS1() {
		return s1;
	}

	public void setS1(Integer s1) {
		this.s1 = s1;
	}

	public Integer getE2() {
		return e2;
	}

	public void setE2(Integer e2) {
		this.e2 = e2;
	}

	public Integer getS2() {
		return s2;
	}

	public void setS2(Integer s2) {
		this.s2 = s2;
	}

	public Integer getE3() {
		return e3;
	}

	public void setE3(Integer e3) {
		this.e3 = e3;
	}

	public Integer getS3() {
		return s3;
	}

	public void setS3(Integer s3) {
		this.s3 = s3;
	}

	public Integer getE4() {
		return e4;
	}

	public void setE4(Integer e4) {
		this.e4 = e4;
	}

	public Integer getTole1ant() {
		return tole1ant;
	}

	public void setTole1ant(Integer tole1ant) {
		this.tole1ant = tole1ant;
	}

	public Integer getTole1dep() {
		return tole1dep;
	}

	public void setTole1dep(Integer tole1dep) {
		this.tole1dep = tole1dep;
	}

	public Integer getTols1ant() {
		return tols1ant;
	}

	public void setTols1ant(Integer tols1ant) {
		this.tols1ant = tols1ant;
	}

	public Integer getTols1dep() {
		return tols1dep;
	}

	public void setTols1dep(Integer tols1dep) {
		this.tols1dep = tols1dep;
	}

	public Integer getTole2ant() {
		return tole2ant;
	}

	public void setTole2ant(Integer tole2ant) {
		this.tole2ant = tole2ant;
	}

	public Integer getTole2dep() {
		return tole2dep;
	}

	public void setTole2dep(Integer tole2dep) {
		this.tole2dep = tole2dep;
	}

	public Integer getTols2ant() {
		return tols2ant;
	}

	public void setTols2ant(Integer tols2ant) {
		this.tols2ant = tols2ant;
	}

	public Integer getTols2dep() {
		return tols2dep;
	}

	public void setTols2dep(Integer tols2dep) {
		this.tols2dep = tols2dep;
	}

	public Integer getTole3ant() {
		return tole3ant;
	}

	public void setTole3ant(Integer tole3ant) {
		this.tole3ant = tole3ant;
	}

	public Integer getTole3dep() {
		return tole3dep;
	}

	public void setTole3dep(Integer tole3dep) {
		this.tole3dep = tole3dep;
	}

	public Integer getTols3ant() {
		return tols3ant;
	}

	public void setTols3ant(Integer tols3ant) {
		this.tols3ant = tols3ant;
	}

	public Integer getTols3dep() {
		return tols3dep;
	}

	public void setTols3dep(Integer tols3dep) {
		this.tols3dep = tols3dep;
	}

	public Integer getTole4ant() {
		return tole4ant;
	}

	public void setTole4ant(Integer tole4ant) {
		this.tole4ant = tole4ant;
	}

	public Integer getTole4dep() {
		return tole4dep;
	}

	public void setTole4dep(Integer tole4dep) {
		this.tole4dep = tole4dep;
	}

	public Integer getTols4ant() {
		return tols4ant;
	}

	public void setTols4ant(Integer tols4ant) {
		this.tols4ant = tols4ant;
	}

	public Integer getTols4dep() {
		return tols4dep;
	}

	public void setTols4dep(Integer tols4dep) {
		this.tols4dep = tols4dep;
	}

	public Integer getTole5ant() {
		return tole5ant;
	}

	public void setTole5ant(Integer tole5ant) {
		this.tole5ant = tole5ant;
	}

	public Integer getTole5dep() {
		return tole5dep;
	}

	public void setTole5dep(Integer tole5dep) {
		this.tole5dep = tole5dep;
	}

	public Integer getTols5ant() {
		return tols5ant;
	}

	public void setTols5ant(Integer tols5ant) {
		this.tols5ant = tols5ant;
	}

	public Integer getTols5dep() {
		return tols5dep;
	}

	public void setTols5dep(Integer tols5dep) {
		this.tols5dep = tols5dep;
	}

	public Integer getTole6ant() {
		return tole6ant;
	}

	public void setTole6ant(Integer tole6ant) {
		this.tole6ant = tole6ant;
	}

	public Integer getTole6dep() {
		return tole6dep;
	}

	public void setTole6dep(Integer tole6dep) {
		this.tole6dep = tole6dep;
	}

	public Integer getTols6ant() {
		return tols6ant;
	}

	public void setTols6ant(Integer tols6ant) {
		this.tols6ant = tols6ant;
	}

	public Integer getTols6dep() {
		return tols6dep;
	}

	public void setTols6dep(Integer tols6dep) {
		this.tols6dep = tols6dep;
	}

	public Integer getTole7ant() {
		return tole7ant;
	}

	public void setTole7ant(Integer tole7ant) {
		this.tole7ant = tole7ant;
	}

	public Integer getTole7dep() {
		return tole7dep;
	}

	public void setTole7dep(Integer tole7dep) {
		this.tole7dep = tole7dep;
	}

	public Integer getTols7ant() {
		return tols7ant;
	}

	public void setTols7ant(Integer tols7ant) {
		this.tols7ant = tols7ant;
	}

	public Integer getTols7dep() {
		return tols7dep;
	}

	public void setTols7dep(Integer tols7dep) {
		this.tols7dep = tols7dep;
	}

	public Integer getTole8ant() {
		return tole8ant;
	}

	public void setTole8ant(Integer tole8ant) {
		this.tole8ant = tole8ant;
	}

	public Integer getTole8dep() {
		return tole8dep;
	}

	public void setTole8dep(Integer tole8dep) {
		this.tole8dep = tole8dep;
	}

	public Integer getTols8ant() {
		return tols8ant;
	}

	public void setTols8ant(Integer tols8ant) {
		this.tols8ant = tols8ant;
	}

	public Integer getTols8dep() {
		return tols8dep;
	}

	public void setTols8dep(Integer tols8dep) {
		this.tols8dep = tols8dep;
	}

	public Integer getPreassinaladoe2() {
		return preassinaladoe2;
	}

	public void setPreassinaladoe2(Integer preassinaladoe2) {
		this.preassinaladoe2 = preassinaladoe2;
	}

	public Integer getPreassinalados1() {
		return preassinalados1;
	}

	public void setPreassinalados1(Integer preassinalados1) {
		this.preassinalados1 = preassinalados1;
	}

	
	public Integer getDescIntervaloDuasMarcacoes() {
		return descIntervaloDuasMarcacoes;
	}

	public void setDescIntervaloDuasMarcacoes(Integer descIntervaloDuasMarcacoes) {
		this.descIntervaloDuasMarcacoes = descIntervaloDuasMarcacoes;
	}

	public Integer getFlexRefeicaoAntes() {
		return flexRefeicaoAntes;
	}

	public void setFlexRefeicaoAntes(Integer flexRefeicaoAntes) {
		this.flexRefeicaoAntes = flexRefeicaoAntes;
	}

	public Integer getFlexRefeicaoDepois() {
		return flexRefeicaoDepois;
	}

	public void setFlexRefeicaoDepois(Integer flexRefeicaoDepois) {
		this.flexRefeicaoDepois = flexRefeicaoDepois;
	}

	public TipoRegime getTipoRegime() {
		return tipoRegime;
	}

	public void setTipoRegime(TipoRegime tipoRegime) {
		this.tipoRegime = tipoRegime;
	}

	public Integer getS4() {
		return s4;
	}

	public void setS4(Integer s4) {
		this.s4 = s4;
	}

			
	public Integer getFechamento() {
		return fechamento;
	}

	public void setFechamento(Integer fechamento) {
		this.fechamento = fechamento;
	}

		
	public Integer getDSR() {
		return DSR;
	}

	public void setDSR(Integer dSR) {
		DSR = dSR;
	}

	@Transient
	public boolean isJornadaPreenchida() {
		return (!this.getJornada().isEmpty());
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
		Jornada other = (Jornada) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}


	
	
}

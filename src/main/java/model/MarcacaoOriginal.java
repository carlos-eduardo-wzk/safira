package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MarcacaoOriginal implements Serializable {

	private static final long serialVersionUID = 1L;
	


    public MarcacaoOriginal() {
		super();
	}
    
	public MarcacaoOriginal(Long id, Date data, Long colaborador_id,
			Integer h1, Integer h2, Integer h3, Integer h4, Integer h5,
			Integer h6, Integer h7, Integer h8) {
		Id = id;
		this.data = data;
		this.colaborador_id = colaborador_id;
		this.h1 = h1;
		this.h2 = h2;
		this.h3 = h3;
		this.h4 = h4;
		this.h5 = h5;
		this.h6 = h6;
		this.h7 = h7;
		this.h8 = h8;
	}
    
	@Id
    @GeneratedValue
	private Long Id;
	private Date data;
	private Long colaborador_id;
	private Integer h1;
	private Integer h2;
	private Integer h3;
	private Integer h4;
	private Integer h5;
	private Integer h6;
	private Integer h7;
	private Integer h8;

	
	
	
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
	@Override
	public String toString() {
		return "MarcacaoOriginal [Id=" + Id + ", data=" + data
				+ ", colaborador_id=" + colaborador_id + ", h1=" + h1 + ", h2="
				+ h2 + ", h3=" + h3 + ", h4=" + h4 + ", h5=" + h5 + ", h6="
				+ h6 + ", h7=" + h7 + ", h8=" + h8 + "]";
	}
	
	
	
	
	

}

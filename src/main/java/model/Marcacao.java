package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityResult;
import javax.persistence.FetchType;
import javax.persistence.FieldResult;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;


//@NamedNativeQueries({ @NamedNativeQuery(name = "acertoAb", query = "SELECT DataAbono, oa.data, horas, horasAbonadas, motivoAbono, colaborador_id, h1, h2, h3, h4, h5, h6, h7, h8, nome "
//		+ " FROM safira.ocorrenciaapurada oa"
//		+ " left join safira.vw_marcdiacolaborador md"
//		+ " on (oa.data=md.data and oa.colaborador_id=md.colaborador_id)"
//		+ " left join safira.colaborador co"
//		+ " on ( md.colaborador_id = co.Id )"
//		+ " where md.data= :dia and co.matricula = :matri" + " limit 0,1   ") })

//@SqlResultSetMappings({ @SqlResultSetMapping(name = "acertoMapping", classes = {
//		@ConstructorResult(targetClass = Acerto.class, columns = {
//		@ColumnResult(name = "DataAbono"), @ColumnResult(name = "data"),
//		@ColumnResult(name = "horas"), @ColumnResult(name = "horasAbonadas"),
//		@ColumnResult(name = "motivoabono"),@ColumnResult(name = "motivoAbono"),
//		@ColumnResult(name = "colaborador_id"), @ColumnResult(name = "h1"),
//		@ColumnResult(name = "h2"), @ColumnResult(name = "h3"),
//		@ColumnResult(name = "h4"), @ColumnResult(name = "h5"),
//		@ColumnResult(name = "h6"), @ColumnResult(name = "h7"),
//		@ColumnResult(name = "h8"), @ColumnResult(name = "nome") }) }) })
//



@SqlResultSetMappings({
@SqlResultSetMapping(name = "AcertoResult", entities = {@EntityResult
      (entityClass = Acerto.class,
      fields = {
    	 @FieldResult(name = "Id", column = "id"),
         @FieldResult(name = "data", column = "data"),
         @FieldResult(name = "DataAbono", column = "DataAbono"),
         @FieldResult(name = "horas", column = "horas"),
         @FieldResult(name = "horasAbonadas", column = "horasAbonadas"),
         @FieldResult(name = "motivoAbono", column = "motivoAbono"),
         @FieldResult(name = "colaborador_id", column = "colaborador_id"),
         @FieldResult(name = "h1", column = "h1"),
         @FieldResult(name = "h2", column = "h2"),
         @FieldResult(name = "h3", column = "h3"),
         @FieldResult(name = "h4", column = "h4"),
         @FieldResult(name = "h5", column = "h5"),
         @FieldResult(name = "h6", column = "h6"),
         @FieldResult(name = "h7", column = "h7"),
         @FieldResult(name = "h8", column = "h8"),
         @FieldResult(name = "nome", column = "nome"),
    	 @FieldResult(name = "ocorrencia_id", column = "ocorrencia_id"),
    	 @FieldResult(name = "ocorrencia", column = "ocorrencia" ),
    	 @FieldResult(name = "empresa_id", column = "empresa_id" ),
    	 @FieldResult(name = "filial_id", column = "filial_id" ),
    	 @FieldResult(name = "depto_id", column = "depto_id" ),
    	 @FieldResult(name = "matricula", column = "matricula" ),
    	 @FieldResult(name = "pis", column = "pis" )
    	     	    	 
      })}),

@SqlResultSetMapping(name = "MarcacaoResult", entities = {@EntityResult
      (entityClass = MarcacaoOriginal.class,
      fields = {
     	 @FieldResult(name = "Id", column = "id"),
         @FieldResult(name = "data", column = "data"),
         @FieldResult(name = "colaborador_id", column = "colaborador_id"),
         @FieldResult(name = "h1", column = "h1"),
         @FieldResult(name = "h2", column = "h2"),
         @FieldResult(name = "h3", column = "h3"),
         @FieldResult(name = "h4", column = "h4"),
         @FieldResult(name = "h5", column = "h5"),
         @FieldResult(name = "h6", column = "h6"),
         @FieldResult(name = "h7", column = "h7"),
         @FieldResult(name = "h8", column = "h8")    	 
      })})
})


/*@SqlResultSetMapping(
        name = "BookValueMapping",
        classes = @ConstructorResult(
                targetClass = BookValue.class,
                columns = {
                    @ColumnResult(name = "id", type = Long.class),
                    @ColumnResult(name = "title"),
                    @ColumnResult(name = "version", type = Long.class),
                    @ColumnResult(name = "authorName")}))*/


@Entity
// usado para criar indices
//@Table(name = "tabela", indexes = {@Index(columnList="coluna", unique = true)})
public class Marcacao implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(nullable=false) 
	private Long Id;
	private Date data;
	private Integer hora;
	private String pis;
	private String nsr;
	private String matricula;
	private String numeroRelogio;
	private String fonteDados;
	

	@ManyToOne (fetch=FetchType.LAZY)
	@JoinColumn(name = "colaborador_id", nullable = true)
	private Colaborador colaborador;
	
	
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
	public Integer getHora() {
		return hora;
	}
	public void setHora(Integer hora) {
		this.hora = hora;
	}
	public String getPis() {
		return pis;
	}
	public void setPis(String pis) {
		this.pis = pis;
	}
	public String getNsr() {
		return nsr;
	}
	public void setNsr(String nsr) {
		this.nsr = nsr;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNumeroRelogio() {
		return numeroRelogio;
	}
	public void setNumeroRelogio(String numeroRelogio) {
		this.numeroRelogio = numeroRelogio;
	}
	public String getFonteDados() {
		return fonteDados;
	}
	public void setFonteDados(String fonteDados) {
		this.fonteDados = fonteDados;
	}
	
	
	@Override
	public String toString() {
		return "Marcacao [Id=" + Id + ", data=" + data + ", hora=" + hora
				+ ", pis=" + pis + ", nsr=" + nsr + ", matricula=" + matricula
				+ ", numeroRelogio=" + numeroRelogio + ", fonteDados="
				+ fonteDados + "]";
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
		Marcacao other = (Marcacao) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}
	

	
	
	
}

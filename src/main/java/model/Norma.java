package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Norma implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long Id;
	@Column(nullable = false, length = 80)
	private String norma;

	@Column(name = "Ocorrencia_faltas")
	private Integer OcorrenciaFaltas;

	@Column(name = "Ocorrencia_dsr")
	private Integer OcorrenciaDSR;

	@Column(name = "Ocorrencia_an")
	private Integer OcorrenciaAdicionalNoturno;

	@Column(name = "Ocorrencia_atraso")
	private Integer OcorrenciaAtraso;

	@Column(name = "Ocorrencia_atraso2")
	private Integer OcorrenciaAtraso2;

	@Column(name = "Ocorrencia_saida_antecipada")
	private Integer OcorrenciaSaidaAntecipada;

	@Column(name = "Ocorrencia_saida_antecipada2")
	private Integer OcorrenciaSaidaAntecipada2;

	@Column(name = "Ocorrencia_atraso_nao_descontado")
	private Integer OcorrenciaAtrasoNaoDescontato;

	@Column(name = "Ocorrencia_saida_antecipada_nao_descontada")
	private Integer OcorrenciaSaidaAntecipadaNaoDescontada;

	@Column(name = "Ocorrencia_afastamento")
	private Integer OcorrenciaAfastamento;

	@Column(name = "Ocorrencia_horas_normais")
	private Integer OcorrenciaHorasNormais;

	@Column(name = "Ocorrencia_horas_normais_noturna")
	private Integer OcorrenciaHorasNormaisNoturna;

	@Column(name = "Ocorrencia_horas_normais_tolerancia")
	private Integer OcorrenciaHorasNormaisTolerancia;

	@Column(name = "Ocorrencia_folga")
	private Integer OcorrenciaFolga;

	@Enumerated(EnumType.STRING)
	private TipoHoraExtra tipoHoraExtra = TipoHoraExtra.DIARIO;

	@Column(name = "Ocorrencia_he_Seg_FaixaDiurno1")
	private Integer OcorrenciaHeSegFaixaDiurno1;
	@Column(name = "lim_seg_faixaDiurno1")
	private Integer limSegFaixaDiurno1;

	@Column(name = "Ocorrencia_he_Seg_FaixaDiurno2")
	private Integer OcorrenciaHeSegFaixaDiurno2;
	@Column(name = "lim_seg_faixaDiurno2")
	private Integer limSegFaixaDiurno2;

	@Column(name = "Ocorrencia_he_Seg_FaixaDiurno3", length = 5)
	private Integer OcorrenciaHeSegFaixaDiurno3;
	@Column(name = "lim_seg_faixaDiurno3")
	private Integer limSegFaixaDiurno3;

	@Column(name = "Ocorrencia_he_Seg_FaixaNot1", length = 5)
	private Integer OcorrenciaHeSegFaixaNot1;
	@Column(name = "lim_seg_faixaNot1")
	private Integer limSegFaixaNot1;

	@Column(name = "Ocorrencia_he_Seg_FaixaNot2", length = 5)
	private Integer OcorrenciaHeSegFaixaNot2;
	@Column(name = "lim_seg_faixaNot2")
	private Integer limSegFaixaNot2;

	@Column(name = "Ocorrencia_he_Seg_FaixaNot3", length = 5)
	private Integer OcorrenciaHeSegFaixaNot3;
	@Column(name = "lim_seg_faixaNot3")
	private Integer limSegFaixaNot3;

	// ter�a
	@Column(name = "Ocorrencia_he_Ter_FaixaDiurno1")
	private Integer OcorrenciaHeTerFaixaDiurno1;
	@Column(name = "lim_ter_faixaDiurno1")
	private Integer limTerFaixaDiurno1;

	@Column(name = "Ocorrencia_he_Ter_FaixaDiurno2")
	private Integer OcorrenciaHeTerFaixaDiurno2;
	@Column(name = "lim_ter_faixaDiurno2")
	private Integer limTerFaixaDiurno2;

	@Column(name = "Ocorrencia_he_ter_FaixaDiurno3", length = 5)
	private Integer OcorrenciaHeTerFaixaDiurno3;
	@Column(name = "lim_ter_faixaDiurno3")
	private Integer limTerFaixaDiurno3;

	@Column(name = "Ocorrencia_he_Ter_FaixaNot1", length = 5)
	private Integer OcorrenciaHeTerFaixaNot1;
	@Column(name = "lim_ter_faixaNot1")
	private Integer limTerFaixaNot1;

	@Column(name = "Ocorrencia_he_Ter_FaixaNot2", length = 5)
	private Integer OcorrenciaHeTerFaixaNot2;
	@Column(name = "lim_ter_faixaNot2")
	private Integer limTerFaixaNot2;

	@Column(name = "Ocorrencia_he_Ter_FaixaNot3", length = 5)
	private Integer OcorrenciaHeTerFaixaNot3;
	@Column(name = "lim_ter_faixaNot3")
	private Integer limTerFaixaNot3;

	// Quarta
	@Column(name = "Ocorrencia_he_Qua_FaixaDiurno1")
	private Integer OcorrenciaHeQuaFaixaDiurno1;
	@Column(name = "lim_qua_faixaDiurno1")
	private Integer limQuaFaixaDiurno1;

	@Column(name = "Ocorrencia_he_Qua_FaixaDiurno2")
	private Integer OcorrenciaHeQuaFaixaDiurno2;
	@Column(name = "lim_qua_faixaDiurno2")
	private Integer limQuaFaixaDiurno2;

	@Column(name = "Ocorrencia_he_qua_FaixaDiurno3", length = 5)
	private Integer OcorrenciaHeQuaFaixaDiurno3;
	@Column(name = "lim_qua_faixaDiurno3")
	private Integer limQuaFaixaDiurno3;

	@Column(name = "Ocorrencia_he_Qua_FaixaNot1", length = 5)
	private Integer OcorrenciaHeQuaFaixaNot1;
	@Column(name = "lim_qua_faixaNot1")
	private Integer limQuaFaixaNot1;

	@Column(name = "Ocorrencia_he_Qua_FaixaNot2", length = 5)
	private Integer OcorrenciaHeQuaFaixaNot2;
	@Column(name = "lim_qua_faixaNot2")
	private Integer limQuaFaixaNot2;

	@Column(name = "Ocorrencia_he_Qua_FaixaNot3", length = 5)
	private Integer OcorrenciaHeQuaFaixaNot3;
	@Column(name = "lim_qua_faixaNot3")
	private Integer limQuaFaixaNot3;

	// Quinta
	@Column(name = "Ocorrencia_he_qui_FaixaDiurno1")
	private Integer OcorrenciaHeQuiFaixaDiurno1;
	@Column(name = "lim_qui_faixaDiurno1")
	private Integer limQuiFaixaDiurno1;

	@Column(name = "Ocorrencia_he_qui_FaixaDiurno2")
	private Integer OcorrenciaHeQuiFaixaDiurno2;
	@Column(name = "lim_qui_faixaDiurno2")
	private Integer limQuiFaixaDiurno2;

	@Column(name = "Ocorrencia_he_qui_FaixaDiurno3", length = 5)
	private Integer OcorrenciaHeQuiFaixaDiurno3;
	@Column(name = "lim_qui_faixaDiurno3")
	private Integer limQuiFaixaDiurno3;

	@Column(name = "Ocorrencia_he_qui_FaixaNot1", length = 5)
	private Integer OcorrenciaHeQuiFaixaNot1;
	@Column(name = "lim_qui_faixaNot1")
	private Integer limQuiFaixaNot1;

	@Column(name = "Ocorrencia_he_qui_FaixaNot2", length = 5)
	private Integer OcorrenciaHeQuiFaixaNot2;
	@Column(name = "lim_qui_faixaNot2")
	private Integer limQuiFaixaNot2;

	@Column(name = "Ocorrencia_he_qui_FaixaNot3", length = 5)
	private Integer OcorrenciaHeQuiFaixaNot3;
	@Column(name = "lim_qui_faixaNot3")
	private Integer limQuiFaixaNot3;

	// sexta
	@Column(name = "Ocorrencia_he_sex_FaixaDiurno1")
	private Integer OcorrenciaHeSexFaixaDiurno1;
	@Column(name = "lim_sex_faixaDiurno1")
	private Integer limSexFaixaDiurno1;

	@Column(name = "Ocorrencia_he_sex_FaixaDiurno2")
	private Integer OcorrenciaHeSexFaixaDiurno2;
	@Column(name = "lim_sex_faixaDiurno2")
	private Integer limSexFaixaDiurno2;

	@Column(name = "Ocorrencia_he_sex_FaixaDiurno3", length = 5)
	private Integer OcorrenciaHeSexFaixaDiurno3;
	@Column(name = "lim_sex_faixaDiurno3")
	private Integer limSexFaixaDiurno3;

	@Column(name = "Ocorrencia_he_sex_FaixaNot1", length = 5)
	private Integer OcorrenciaHeSexFaixaNot1;
	@Column(name = "lim_sex_faixaNot1")
	private Integer limSexFaixaNot1;

	@Column(name = "Ocorrencia_he_sex_FaixaNot2", length = 5)
	private Integer OcorrenciaHeSexFaixaNot2;
	@Column(name = "lim_sex_faixaNot2")
	private Integer limSexFaixaNot2;

	@Column(name = "Ocorrencia_he_sex_FaixaNot3", length = 5)
	private Integer OcorrenciaHeSexFaixaNot3;
	@Column(name = "lim_sex_faixaNot3")
	private Integer limSexFaixaNot3;

	// sab
	@Column(name = "Ocorrencia_he_sab_FaixaDiurno1")
	private Integer OcorrenciaHeSabFaixaDiurno1;
	@Column(name = "lim_sab_faixaDiurno1")
	private Integer limSabFaixaDiurno1;

	@Column(name = "Ocorrencia_he_sab_FaixaDiurno2")
	private Integer OcorrenciaHeSabFaixaDiurno2;
	@Column(name = "lim_sab_faixaDiurno2")
	private Integer limSabFaixaDiurno2;

	@Column(name = "Ocorrencia_he_sab_FaixaDiurno3", length = 5)
	private Integer OcorrenciaHeSabFaixaDiurno3;
	@Column(name = "lim_sab_faixaDiurno3")
	private Integer limSabFaixaDiurno3;

	@Column(name = "Ocorrencia_he_sab_FaixaNot1", length = 5)
	private Integer OcorrenciaHeSabFaixaNot1;
	@Column(name = "lim_sab_faixaNot1")
	private Integer limSabFaixaNot1;

	@Column(name = "Ocorrencia_he_sab_FaixaNot2", length = 5)
	private Integer OcorrenciaHeSabFaixaNot2;
	@Column(name = "lim_sab_faixaNot2")
	private Integer limSabFaixaNot2;

	@Column(name = "Ocorrencia_he_sab_FaixaNot3", length = 5)
	private Integer OcorrenciaHeSabFaixaNot3;
	@Column(name = "lim_sab_faixaNot3")
	private Integer limSabFaixaNot3;

	// dom
	@Column(name = "Ocorrencia_he_dom_FaixaDiurno1")
	private Integer OcorrenciaHeDomFaixaDiurno1;
	@Column(name = "lim_dom_faixaDiurno1")
	private Integer limDomFaixaDiurno1;

	@Column(name = "Ocorrencia_he_dom_FaixaDiurno2")
	private Integer OcorrenciaHeDomFaixaDiurno2;
	@Column(name = "lim_dom_faixaDiurno2")
	private Integer limDomFaixaDiurno2;

	@Column(name = "Ocorrencia_he_dom_FaixaDiurno3", length = 5)
	private Integer OcorrenciaHeDomFaixaDiurno3;
	@Column(name = "lim_dom_faixaDiurno3")
	private Integer limDomFaixaDiurno3;

	@Column(name = "Ocorrencia_he_dom_FaixaNot1", length = 5)
	private Integer OcorrenciaHeDomFaixaNot1;
	@Column(name = "lim_dom_faixaNot1")
	private Integer limDomFaixaNot1;

	@Column(name = "Ocorrencia_he_dom_FaixaNot2", length = 5)
	private Integer OcorrenciaHeDomFaixaNot2;
	@Column(name = "lim_dom_faixaNot2")
	private Integer limDomFaixaNot2;

	@Column(name = "Ocorrencia_he_dom_FaixaNot3", length = 5)
	private Integer OcorrenciaHeDomFaixaNot3;
	@Column(name = "lim_dom_faixaNot3")
	private Integer limDomFaixaNot3;

	// fer
	@Column(name = "Ocorrencia_he_fer_FaixaDiurno1")
	private Integer OcorrenciaHeFerFaixaDiurno1;
	@Column(name = "lim_fer_faixaDiurno1")
	private Integer limFerFaixaDiurno1;

	@Column(name = "Ocorrencia_he_fer_FaixaDiurno2")
	private Integer OcorrenciaHeFerFaixaDiurno2;
	@Column(name = "lim_fer_faixaDiurno2")
	private Integer limFerFaixaDiurno2;

	@Column(name = "Ocorrencia_he_fer_FaixaDiurno3", length = 5)
	private Integer OcorrenciaHeFerFaixaDiurno3;
	@Column(name = "lim_fer_faixaDiurno3")
	private Integer limFerFaixaDiurno3;

	@Column(name = "Ocorrencia_he_fer_FaixaNot1", length = 5)
	private Integer OcorrenciaHeFerFaixaNot1;
	@Column(name = "lim_fer_faixaNot1")
	private Integer limFerFaixaNot1;

	@Column(name = "Ocorrencia_he_fer_FaixaNot2", length = 5)
	private Integer OcorrenciaHeFerFaixaNot2;
	@Column(name = "lim_fer_faixaNot2")
	private Integer limFerFaixaNot2;

	@Column(name = "Ocorrencia_he_fer_FaixaNot3", length = 5)
	private Integer OcorrenciaHeFerFaixaNot3;
	@Column(name = "lim_fer_faixaNot3")
	private Integer limFerFaixaNot3;

	// folga
	@Column(name = "Ocorrencia_he_fol_FaixaDiurno1")
	private Integer OcorrenciaHeFolFaixaDiurno1;
	@Column(name = "lim_fol_faixaDiurno1")
	private Integer limFolFaixaDiurno1;

	@Column(name = "Ocorrencia_he_fol_FaixaDiurno2")
	private Integer OcorrenciaHeFolFaixaDiurno2;
	@Column(name = "lim_fol_faixaDiurno2")
	private Integer limFolFaixaDiurno2;

	@Column(name = "Ocorrencia_he_fol_FaixaDiurno3", length = 5)
	private Integer OcorrenciaHeFolFaixaDiurno3;
	@Column(name = "lim_fol_faixaDiurno3")
	private Integer limFolFaixaDiurno3;

	@Column(name = "Ocorrencia_he_fol_FaixaNot1", length = 5)
	private Integer OcorrenciaHeFolFaixaNot1;
	@Column(name = "lim_fol_faixaNot1")
	private Integer limFolFaixaNot1;

	@Column(name = "Ocorrencia_he_fol_FaixaNot2", length = 5)
	private Integer OcorrenciaHeFolFaixaNot2;
	@Column(name = "lim_fol_faixaNot2")
	private Integer limFolFaixaNot2;

	@Column(name = "Ocorrencia_he_fol_FaixaNot3", length = 5)
	private Integer OcorrenciaHeFolFaixaNot3;
	@Column(name = "lim_fol_faixaNot3")
	private Integer limFolFaixaNot3;

	// especial
	@Column(name = "Ocorrencia_he_esp_FaixaDiurno1")
	private Integer OcorrenciaHeEspFaixaDiurno1;
	@Column(name = "lim_esp_faixaDiurno1")
	private Integer limEspFaixaDiurno1;

	@Column(name = "Ocorrencia_he_esp_FaixaDiurno2")
	private Integer OcorrenciaHeEspFaixaDiurno2;
	@Column(name = "lim_esp_faixaDiurno2")
	private Integer limEspFaixaDiurno2;

	@Column(name = "Ocorrencia_he_esp_FaixaDiurno3", length = 5)
	private Integer OcorrenciaHeEspFaixaDiurno3;
	@Column(name = "lim_esp_faixaDiurno3")
	private Integer limEspFaixaDiurno3;

	@Column(name = "Ocorrencia_he_esp_FaixaNot1", length = 5)
	private Integer OcorrenciaHeEspFaixaNot1;
	@Column(name = "lim_esp_faixaNot1")
	private Integer limEspFaixaNot1;

	@Column(name = "Ocorrencia_he_esp_FaixaNot2", length = 5)
	private Integer OcorrenciaHeEspFaixaNot2;
	@Column(name = "lim_esp_faixaNot2")
	private Integer limEspFaixaNot2;

	@Column(name = "Ocorrencia_he_esp_FaixaNot3", length = 5)
	private Integer OcorrenciaHeEspFaixaNot3;
	@Column(name = "lim_esp_faixaNot3")
	private Integer limEspFaixaNot3;


	@Column(name = "Ocorrencia_debito")
	private Integer OcorrenciaDebito;

	@Column(name = "Ocorrencia_credito")
	private Integer OcorrenciaCredito;

	
	@Column(name = "banco_horas_seg")
	private Boolean bancoHorasSeg;

	@Column(name = "banco_horas_ter")
	private Boolean bancoHorasTer;

	@Column(name = "banco_horas_qua")
	private Boolean bancoHorasQua;

	@Column(name = "banco_horas_qui")
	private Boolean bancoHorasQui;

	@Column(name = "banco_horas_sex")
	private Boolean bancoHorasSex;

	@Column(name = "banco_horas_sab")
	private Boolean bancoHorasSab;

	@Column(name = "banco_horas_dom")
	private Boolean bancoHorasDom;

	@Column(name = "banco_horas_fer")
	private Boolean bancoHorasFer;

	@Column(name = "banco_horas_fol")
	private Boolean bancoHorasFol;

	@Column(name = "banco_horas_esp")
	private Boolean bancoHorasEsp;
	
	private String script;
	
	private String scriptDOM;
	private String scriptSEG;
	private String scriptTER;
	private String scriptQUA;
	private String scriptQUI;
	private String scriptSEX;
	private String scriptSAB;
	
	
	
	public String getScriptDOM() {
		return scriptDOM;
	}

	public void setScriptDOM(String scriptDOM) {
		this.scriptDOM = scriptDOM;
	}

	public String getScriptSEG() {
		return scriptSEG;
	}

	public void setScriptSEG(String scriptSEG) {
		this.scriptSEG = scriptSEG;
	}

	public String getScriptTER() {
		return scriptTER;
	}

	public void setScriptTER(String scriptTER) {
		this.scriptTER = scriptTER;
	}

	public String getScriptQUA() {
		return scriptQUA;
	}

	public void setScriptQUA(String scriptQUA) {
		this.scriptQUA = scriptQUA;
	}

	public String getScriptQUI() {
		return scriptQUI;
	}

	public void setScriptQUI(String scriptQUI) {
		this.scriptQUI = scriptQUI;
	}

	public String getScriptSEX() {
		return scriptSEX;
	}

	public void setScriptSEX(String scriptSEX) {
		this.scriptSEX = scriptSEX;
	}

	public String getScriptSAB() {
		return scriptSAB;
	}

	public void setScriptSAB(String scriptSAB) {
		this.scriptSAB = scriptSAB;
	}

	public String getScript() {
		return script;
	}

	public void setScript(String script) {
		this.script = script;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNorma() {
		return norma;
	}

	public void setNorma(String norma) {
		this.norma = norma.toUpperCase();
	}

	public Integer getOcorrenciaHeSegFaixaDiurno1() {
		return OcorrenciaHeSegFaixaDiurno1;
	}

	public void setOcorrenciaHeSegFaixaDiurno1(
			Integer ocorrenciaHeSegFaixaDiurno1) {
		OcorrenciaHeSegFaixaDiurno1 = ocorrenciaHeSegFaixaDiurno1;
	}

	public Integer getLimSegFaixaDiurno1() {
		return limSegFaixaDiurno1;
	}

	public void setLimSegFaixaDiurno1(Integer limSegFaixaDiurno1) {
		this.limSegFaixaDiurno1 = limSegFaixaDiurno1;
	}

	public void setOcorrenciaHeSegFaixaDiurno3(
			Integer ocorrenciaHeSegFaixaDiurno3) {
		OcorrenciaHeSegFaixaDiurno3 = ocorrenciaHeSegFaixaDiurno3;
	}

	public Integer getOcorrenciaHeSegFaixaDiurno2() {
		return OcorrenciaHeSegFaixaDiurno2;
	}

	public void setOcorrenciaHeSegFaixaDiurno2(
			Integer ocorrenciaHeSegFaixaDiurno2) {
		OcorrenciaHeSegFaixaDiurno2 = ocorrenciaHeSegFaixaDiurno2;
	}

	public Integer getLimSegFaixaDiurno2() {
		return limSegFaixaDiurno2;
	}

	public void setLimSegFaixaDiurno2(Integer limSegFaixaDiurno2) {
		this.limSegFaixaDiurno2 = limSegFaixaDiurno2;
	}

	public Integer getLimSegFaixaDiurno3() {
		return limSegFaixaDiurno3;
	}

	public void setLimSegFaixaDiurno3(Integer limSegFaixaDiurno3) {
		this.limSegFaixaDiurno3 = limSegFaixaDiurno3;
	}

	public Integer getLimSegFaixaNot1() {
		return limSegFaixaNot1;
	}

	public void setLimSegFaixaNot1(Integer limSegFaixaNot1) {
		this.limSegFaixaNot1 = limSegFaixaNot1;
	}

	public Integer getLimSegFaixaNot2() {
		return limSegFaixaNot2;
	}

	public void setLimSegFaixaNot2(Integer limSegFaixaNot2) {
		this.limSegFaixaNot2 = limSegFaixaNot2;
	}

	public Integer getLimSegFaixaNot3() {
		return limSegFaixaNot3;
	}

	public void setLimSegFaixaNot3(Integer limSegFaixaNot3) {
		this.limSegFaixaNot3 = limSegFaixaNot3;
	}

	public Integer getOcorrenciaHeSegFaixaNot1() {
		return OcorrenciaHeSegFaixaNot1;
	}

	public void setOcorrenciaHeSegFaixaNot1(Integer ocorrenciaHeSegFaixaNot1) {
		OcorrenciaHeSegFaixaNot1 = ocorrenciaHeSegFaixaNot1;
	}

	public Integer getOcorrenciaHeSegFaixaNot3() {
		return OcorrenciaHeSegFaixaNot3;
	}

	public void setOcorrenciaHeSegFaixaNot3(Integer ocorrenciaHeSegFaixaNot3) {
		OcorrenciaHeSegFaixaNot3 = ocorrenciaHeSegFaixaNot3;
	}

	public Integer getOcorrenciaHeSegFaixaDiurno3() {
		return OcorrenciaHeSegFaixaDiurno3;
	}

	public void setOcorrenciaHeSegFaixaNot2(Integer ocorrenciaHeSegFaixaNot2) {
		OcorrenciaHeSegFaixaNot2 = ocorrenciaHeSegFaixaNot2;
	}

	// terca

	public Integer getOcorrenciaHeTerFaixaDiurno1() {
		return OcorrenciaHeTerFaixaDiurno1;
	}

	public void setOcorrenciaHeTerFaixaDiurno1(
			Integer ocorrenciaHeTerFaixaDiurno1) {
		OcorrenciaHeTerFaixaDiurno1 = ocorrenciaHeTerFaixaDiurno1;
	}

	public Integer getOcorrenciaHeTerFaixaDiurno2() {
		return OcorrenciaHeTerFaixaDiurno2;
	}

	public void setOcorrenciaHeTerFaixaDiurno2(
			Integer ocorrenciaHeTerFaixaDiurno2) {
		OcorrenciaHeTerFaixaDiurno2 = ocorrenciaHeTerFaixaDiurno2;
	}

	public Integer getOcorrenciaHeTerFaixaDiurno3() {
		return OcorrenciaHeTerFaixaDiurno3;
	}

	public void setOcorrenciaHeTerFaixaDiurno3(
			Integer ocorrenciaHeTerFaixaDiurno3) {
		OcorrenciaHeTerFaixaDiurno3 = ocorrenciaHeTerFaixaDiurno3;
	}

	public Integer getOcorrenciaHeTerFaixaNot1() {
		return OcorrenciaHeTerFaixaNot1;
	}

	public void setOcorrenciaHeTerFaixaNot1(Integer ocorrenciaHeTerFaixaNot1) {
		OcorrenciaHeTerFaixaNot1 = ocorrenciaHeTerFaixaNot1;
	}

	public Integer getOcorrenciaHeTerFaixaNot2() {
		return OcorrenciaHeTerFaixaNot2;
	}

	public void setOcorrenciaHeTerFaixaNot2(Integer ocorrenciaHeTerFaixaNot2) {
		OcorrenciaHeTerFaixaNot2 = ocorrenciaHeTerFaixaNot2;
	}

	public Integer getOcorrenciaHeTerFaixaNot3() {
		return OcorrenciaHeTerFaixaNot3;
	}

	public void setOcorrenciaHeTerFaixaNot3(Integer ocorrenciaHeTerFaixaNot3) {
		OcorrenciaHeTerFaixaNot3 = ocorrenciaHeTerFaixaNot3;
	}

	public Integer getLimTerFaixaDiurno1() {
		return limTerFaixaDiurno1;
	}

	public void setLimTerFaixaDiurno1(Integer limTerFaixaDiurno1) {
		this.limTerFaixaDiurno1 = limTerFaixaDiurno1;
	}

	public Integer getLimTerFaixaDiurno2() {
		return limTerFaixaDiurno2;
	}

	public void setLimTerFaixaDiurno2(Integer limTerFaixaDiurno2) {
		this.limTerFaixaDiurno2 = limTerFaixaDiurno2;
	}

	public Integer getLimTerFaixaDiurno3() {
		return limTerFaixaDiurno3;
	}

	public void setLimTerFaixaDiurno3(Integer limTerFaixaDiurno3) {
		this.limTerFaixaDiurno3 = limTerFaixaDiurno3;
	}

	public Integer getLimTerFaixaNot1() {
		return limTerFaixaNot1;
	}

	public void setLimTerFaixaNot1(Integer limTerFaixaNot1) {
		this.limTerFaixaNot1 = limTerFaixaNot1;
	}

	public Integer getLimTerFaixaNot2() {
		return limTerFaixaNot2;
	}

	public void setLimTerFaixaNot2(Integer limTerFaixaNot2) {
		this.limTerFaixaNot2 = limTerFaixaNot2;
	}

	public Integer getLimTerFaixaNot3() {
		return limTerFaixaNot3;
	}

	public void setLimTerFaixaNot3(Integer limTerFaixaNot3) {
		this.limTerFaixaNot3 = limTerFaixaNot3;
	}

	public Integer getOcorrenciaHeQuaFaixaDiurno1() {
		return OcorrenciaHeQuaFaixaDiurno1;
	}

	public void setOcorrenciaHeQuaFaixaDiurno1(
			Integer ocorrenciaHeQuaFaixaDiurno1) {
		OcorrenciaHeQuaFaixaDiurno1 = ocorrenciaHeQuaFaixaDiurno1;
	}

	public Integer getLimQuaFaixaDiurno1() {
		return limQuaFaixaDiurno1;
	}

	public void setLimQuaFaixaDiurno1(Integer limQuaFaixaDiurno1) {
		this.limQuaFaixaDiurno1 = limQuaFaixaDiurno1;
	}

	public Integer getOcorrenciaHeQuaFaixaDiurno2() {
		return OcorrenciaHeQuaFaixaDiurno2;
	}

	public void setOcorrenciaHeQuaFaixaDiurno2(
			Integer ocorrenciaHeQuaFaixaDiurno2) {
		OcorrenciaHeQuaFaixaDiurno2 = ocorrenciaHeQuaFaixaDiurno2;
	}

	public Integer getLimQuaFaixaDiurno2() {
		return limQuaFaixaDiurno2;
	}

	public void setLimQuaFaixaDiurno2(Integer limQuaFaixaDiurno2) {
		this.limQuaFaixaDiurno2 = limQuaFaixaDiurno2;
	}

	public Integer getOcorrenciaHeQuaFaixaDiurno3() {
		return OcorrenciaHeQuaFaixaDiurno3;
	}

	public void setOcorrenciaHeQuaFaixaDiurno3(
			Integer ocorrenciaHeQuaFaixaDiurno3) {
		OcorrenciaHeQuaFaixaDiurno3 = ocorrenciaHeQuaFaixaDiurno3;
	}

	public Integer getLimQuaFaixaDiurno3() {
		return limQuaFaixaDiurno3;
	}

	public void setLimQuaFaixaDiurno3(Integer limQuaFaixaDiurno3) {
		this.limQuaFaixaDiurno3 = limQuaFaixaDiurno3;
	}

	public Integer getOcorrenciaHeQuaFaixaNot1() {
		return OcorrenciaHeQuaFaixaNot1;
	}

	public void setOcorrenciaHeQuaFaixaNot1(Integer ocorrenciaHeQuaFaixaNot1) {
		OcorrenciaHeQuaFaixaNot1 = ocorrenciaHeQuaFaixaNot1;
	}

	public Integer getLimQuaFaixaNot1() {
		return limQuaFaixaNot1;
	}

	public void setLimQuaFaixaNot1(Integer limQuaFaixaNot1) {
		this.limQuaFaixaNot1 = limQuaFaixaNot1;
	}

	public Integer getOcorrenciaHeQuaFaixaNot2() {
		return OcorrenciaHeQuaFaixaNot2;
	}

	public void setOcorrenciaHeQuaFaixaNot2(Integer ocorrenciaHeQuaFaixaNot2) {
		OcorrenciaHeQuaFaixaNot2 = ocorrenciaHeQuaFaixaNot2;
	}

	public Integer getLimQuaFaixaNot2() {
		return limQuaFaixaNot2;
	}

	public void setLimQuaFaixaNot2(Integer limQuaFaixaNot2) {
		this.limQuaFaixaNot2 = limQuaFaixaNot2;
	}

	public Integer getOcorrenciaHeQuaFaixaNot3() {
		return OcorrenciaHeQuaFaixaNot3;
	}

	public void setOcorrenciaHeQuaFaixaNot3(Integer ocorrenciaHeQuaFaixaNot3) {
		OcorrenciaHeQuaFaixaNot3 = ocorrenciaHeQuaFaixaNot3;
	}

	public Integer getLimQuaFaixaNot3() {
		return limQuaFaixaNot3;
	}

	public void setLimQuaFaixaNot3(Integer limQuaFaixaNot3) {
		this.limQuaFaixaNot3 = limQuaFaixaNot3;
	}

	public Integer getOcorrenciaHeQuiFaixaDiurno1() {
		return OcorrenciaHeQuiFaixaDiurno1;
	}

	public void setOcorrenciaHeQuiFaixaDiurno1(
			Integer ocorrenciaHeQuiFaixaDiurno1) {
		OcorrenciaHeQuiFaixaDiurno1 = ocorrenciaHeQuiFaixaDiurno1;
	}

	public Integer getLimQuiFaixaDiurno1() {
		return limQuiFaixaDiurno1;
	}

	public void setLimQuiFaixaDiurno1(Integer limQuiFaixaDiurno1) {
		this.limQuiFaixaDiurno1 = limQuiFaixaDiurno1;
	}

	public Integer getOcorrenciaHeQuiFaixaDiurno2() {
		return OcorrenciaHeQuiFaixaDiurno2;
	}

	public void setOcorrenciaHeQuiFaixaDiurno2(
			Integer ocorrenciaHeQuiFaixaDiurno2) {
		OcorrenciaHeQuiFaixaDiurno2 = ocorrenciaHeQuiFaixaDiurno2;
	}

	public Integer getLimQuiFaixaDiurno2() {
		return limQuiFaixaDiurno2;
	}

	public void setLimQuiFaixaDiurno2(Integer limQuiFaixaDiurno2) {
		this.limQuiFaixaDiurno2 = limQuiFaixaDiurno2;
	}

	public Integer getOcorrenciaHeQuiFaixaDiurno3() {
		return OcorrenciaHeQuiFaixaDiurno3;
	}

	public void setOcorrenciaHeQuiFaixaDiurno3(
			Integer ocorrenciaHeQuiFaixaDiurno3) {
		OcorrenciaHeQuiFaixaDiurno3 = ocorrenciaHeQuiFaixaDiurno3;
	}

	public Integer getLimQuiFaixaDiurno3() {
		return limQuiFaixaDiurno3;
	}

	public void setLimQuiFaixaDiurno3(Integer limQuiFaixaDiurno3) {
		this.limQuiFaixaDiurno3 = limQuiFaixaDiurno3;
	}

	public Integer getOcorrenciaHeQuiFaixaNot1() {
		return OcorrenciaHeQuiFaixaNot1;
	}

	public void setOcorrenciaHeQuiFaixaNot1(Integer ocorrenciaHeQuiFaixaNot1) {
		OcorrenciaHeQuiFaixaNot1 = ocorrenciaHeQuiFaixaNot1;
	}

	public Integer getLimQuiFaixaNot1() {
		return limQuiFaixaNot1;
	}

	public void setLimQuiFaixaNot1(Integer limQuiFaixaNot1) {
		this.limQuiFaixaNot1 = limQuiFaixaNot1;
	}

	public Integer getOcorrenciaHeQuiFaixaNot2() {
		return OcorrenciaHeQuiFaixaNot2;
	}

	public void setOcorrenciaHeQuiFaixaNot2(Integer ocorrenciaHeQuiFaixaNot2) {
		OcorrenciaHeQuiFaixaNot2 = ocorrenciaHeQuiFaixaNot2;
	}

	public Integer getLimQuiFaixaNot2() {
		return limQuiFaixaNot2;
	}

	public void setLimQuiFaixaNot2(Integer limQuiFaixaNot2) {
		this.limQuiFaixaNot2 = limQuiFaixaNot2;
	}

	public Integer getOcorrenciaHeQuiFaixaNot3() {
		return OcorrenciaHeQuiFaixaNot3;
	}

	public void setOcorrenciaHeQuiFaixaNot3(Integer ocorrenciaHeQuiFaixaNot3) {
		OcorrenciaHeQuiFaixaNot3 = ocorrenciaHeQuiFaixaNot3;
	}

	public Integer getLimQuiFaixaNot3() {
		return limQuiFaixaNot3;
	}

	public void setLimQuiFaixaNot3(Integer limQuiFaixaNot3) {
		this.limQuiFaixaNot3 = limQuiFaixaNot3;
	}

	public Integer getOcorrenciaHeSexFaixaDiurno1() {
		return OcorrenciaHeSexFaixaDiurno1;
	}

	public void setOcorrenciaHeSexFaixaDiurno1(
			Integer ocorrenciaHeSexFaixaDiurno1) {
		OcorrenciaHeSexFaixaDiurno1 = ocorrenciaHeSexFaixaDiurno1;
	}

	public Integer getLimSexFaixaDiurno1() {
		return limSexFaixaDiurno1;
	}

	public void setLimSexFaixaDiurno1(Integer limSexFaixaDiurno1) {
		this.limSexFaixaDiurno1 = limSexFaixaDiurno1;
	}

	public Integer getOcorrenciaHeSexFaixaDiurno2() {
		return OcorrenciaHeSexFaixaDiurno2;
	}

	public void setOcorrenciaHeSexFaixaDiurno2(
			Integer ocorrenciaHeSexFaixaDiurno2) {
		OcorrenciaHeSexFaixaDiurno2 = ocorrenciaHeSexFaixaDiurno2;
	}

	public Integer getLimSexFaixaDiurno2() {
		return limSexFaixaDiurno2;
	}

	public void setLimSexFaixaDiurno2(Integer limSexFaixaDiurno2) {
		this.limSexFaixaDiurno2 = limSexFaixaDiurno2;
	}

	public Integer getOcorrenciaHeSexFaixaDiurno3() {
		return OcorrenciaHeSexFaixaDiurno3;
	}

	public void setOcorrenciaHeSexFaixaDiurno3(
			Integer ocorrenciaHeSexFaixaDiurno3) {
		OcorrenciaHeSexFaixaDiurno3 = ocorrenciaHeSexFaixaDiurno3;
	}

	public Integer getLimSexFaixaDiurno3() {
		return limSexFaixaDiurno3;
	}

	public void setLimSexFaixaDiurno3(Integer limSexFaixaDiurno3) {
		this.limSexFaixaDiurno3 = limSexFaixaDiurno3;
	}

	public Integer getOcorrenciaHeSexFaixaNot1() {
		return OcorrenciaHeSexFaixaNot1;
	}

	public void setOcorrenciaHeSexFaixaNot1(Integer ocorrenciaHeSexFaixaNot1) {
		OcorrenciaHeSexFaixaNot1 = ocorrenciaHeSexFaixaNot1;
	}

	public Integer getLimSexFaixaNot1() {
		return limSexFaixaNot1;
	}

	public void setLimSexFaixaNot1(Integer limSexFaixaNot1) {
		this.limSexFaixaNot1 = limSexFaixaNot1;
	}

	public Integer getOcorrenciaHeSexFaixaNot2() {
		return OcorrenciaHeSexFaixaNot2;
	}

	public void setOcorrenciaHeSexFaixaNot2(Integer ocorrenciaHeSexFaixaNot2) {
		OcorrenciaHeSexFaixaNot2 = ocorrenciaHeSexFaixaNot2;
	}

	public Integer getLimSexFaixaNot2() {
		return limSexFaixaNot2;
	}

	public void setLimSexFaixaNot2(Integer limSexFaixaNot2) {
		this.limSexFaixaNot2 = limSexFaixaNot2;
	}

	public Integer getOcorrenciaHeSexFaixaNot3() {
		return OcorrenciaHeSexFaixaNot3;
	}

	public void setOcorrenciaHeSexFaixaNot3(Integer ocorrenciaHeSexFaixaNot3) {
		OcorrenciaHeSexFaixaNot3 = ocorrenciaHeSexFaixaNot3;
	}

	public Integer getLimSexFaixaNot3() {
		return limSexFaixaNot3;
	}

	public void setLimSexFaixaNot3(Integer limSexFaixaNot3) {
		this.limSexFaixaNot3 = limSexFaixaNot3;
	}

	public Integer getOcorrenciaHeSabFaixaDiurno1() {
		return OcorrenciaHeSabFaixaDiurno1;
	}

	public void setOcorrenciaHeSabFaixaDiurno1(
			Integer ocorrenciaHeSabFaixaDiurno1) {
		OcorrenciaHeSabFaixaDiurno1 = ocorrenciaHeSabFaixaDiurno1;
	}

	public Integer getLimSabFaixaDiurno1() {
		return limSabFaixaDiurno1;
	}

	public void setLimSabFaixaDiurno1(Integer limSabFaixaDiurno1) {
		this.limSabFaixaDiurno1 = limSabFaixaDiurno1;
	}

	public Integer getOcorrenciaHeSabFaixaDiurno2() {
		return OcorrenciaHeSabFaixaDiurno2;
	}

	public void setOcorrenciaHeSabFaixaDiurno2(
			Integer ocorrenciaHeSabFaixaDiurno2) {
		OcorrenciaHeSabFaixaDiurno2 = ocorrenciaHeSabFaixaDiurno2;
	}

	public Integer getLimSabFaixaDiurno2() {
		return limSabFaixaDiurno2;
	}

	public void setLimSabFaixaDiurno2(Integer limSabFaixaDiurno2) {
		this.limSabFaixaDiurno2 = limSabFaixaDiurno2;
	}

	public Integer getOcorrenciaHeSabFaixaDiurno3() {
		return OcorrenciaHeSabFaixaDiurno3;
	}

	public void setOcorrenciaHeSabFaixaDiurno3(
			Integer ocorrenciaHeSabFaixaDiurno3) {
		OcorrenciaHeSabFaixaDiurno3 = ocorrenciaHeSabFaixaDiurno3;
	}

	public Integer getLimSabFaixaDiurno3() {
		return limSabFaixaDiurno3;
	}

	public void setLimSabFaixaDiurno3(Integer limSabFaixaDiurno3) {
		this.limSabFaixaDiurno3 = limSabFaixaDiurno3;
	}

	public Integer getOcorrenciaHeSabFaixaNot1() {
		return OcorrenciaHeSabFaixaNot1;
	}

	public void setOcorrenciaHeSabFaixaNot1(Integer ocorrenciaHeSabFaixaNot1) {
		OcorrenciaHeSabFaixaNot1 = ocorrenciaHeSabFaixaNot1;
	}

	public Integer getLimSabFaixaNot1() {
		return limSabFaixaNot1;
	}

	public void setLimSabFaixaNot1(Integer limSabFaixaNot1) {
		this.limSabFaixaNot1 = limSabFaixaNot1;
	}

	public Integer getOcorrenciaHeSabFaixaNot2() {
		return OcorrenciaHeSabFaixaNot2;
	}

	public void setOcorrenciaHeSabFaixaNot2(Integer ocorrenciaHeSabFaixaNot2) {
		OcorrenciaHeSabFaixaNot2 = ocorrenciaHeSabFaixaNot2;
	}

	public Integer getLimSabFaixaNot2() {
		return limSabFaixaNot2;
	}

	public void setLimSabFaixaNot2(Integer limSabFaixaNot2) {
		this.limSabFaixaNot2 = limSabFaixaNot2;
	}

	public Integer getOcorrenciaHeSabFaixaNot3() {
		return OcorrenciaHeSabFaixaNot3;
	}

	public void setOcorrenciaHeSabFaixaNot3(Integer ocorrenciaHeSabFaixaNot3) {
		OcorrenciaHeSabFaixaNot3 = ocorrenciaHeSabFaixaNot3;
	}

	public Integer getLimSabFaixaNot3() {
		return limSabFaixaNot3;
	}

	public void setLimSabFaixaNot3(Integer limSabFaixaNot3) {
		this.limSabFaixaNot3 = limSabFaixaNot3;
	}

	public Integer getOcorrenciaHeDomFaixaDiurno1() {
		return OcorrenciaHeDomFaixaDiurno1;
	}

	public void setOcorrenciaHeDomFaixaDiurno1(
			Integer ocorrenciaHeDomFaixaDiurno1) {
		OcorrenciaHeDomFaixaDiurno1 = ocorrenciaHeDomFaixaDiurno1;
	}

	public Integer getLimDomFaixaDiurno1() {
		return limDomFaixaDiurno1;
	}

	public void setLimDomFaixaDiurno1(Integer limDomFaixaDiurno1) {
		this.limDomFaixaDiurno1 = limDomFaixaDiurno1;
	}

	public Integer getOcorrenciaHeDomFaixaDiurno2() {
		return OcorrenciaHeDomFaixaDiurno2;
	}

	public void setOcorrenciaHeDomFaixaDiurno2(
			Integer ocorrenciaHeDomFaixaDiurno2) {
		OcorrenciaHeDomFaixaDiurno2 = ocorrenciaHeDomFaixaDiurno2;
	}

	public Integer getLimDomFaixaDiurno2() {
		return limDomFaixaDiurno2;
	}

	public void setLimDomFaixaDiurno2(Integer limDomFaixaDiurno2) {
		this.limDomFaixaDiurno2 = limDomFaixaDiurno2;
	}

	public Integer getOcorrenciaHeDomFaixaDiurno3() {
		return OcorrenciaHeDomFaixaDiurno3;
	}

	public void setOcorrenciaHeDomFaixaDiurno3(
			Integer ocorrenciaHeDomFaixaDiurno3) {
		OcorrenciaHeDomFaixaDiurno3 = ocorrenciaHeDomFaixaDiurno3;
	}

	public Integer getLimDomFaixaDiurno3() {
		return limDomFaixaDiurno3;
	}

	public void setLimDomFaixaDiurno3(Integer limDomFaixaDiurno3) {
		this.limDomFaixaDiurno3 = limDomFaixaDiurno3;
	}

	public Integer getOcorrenciaHeDomFaixaNot1() {
		return OcorrenciaHeDomFaixaNot1;
	}

	public void setOcorrenciaHeDomFaixaNot1(Integer ocorrenciaHeDomFaixaNot1) {
		OcorrenciaHeDomFaixaNot1 = ocorrenciaHeDomFaixaNot1;
	}

	public Integer getLimDomFaixaNot1() {
		return limDomFaixaNot1;
	}

	public void setLimDomFaixaNot1(Integer limDomFaixaNot1) {
		this.limDomFaixaNot1 = limDomFaixaNot1;
	}

	public Integer getOcorrenciaHeDomFaixaNot2() {
		return OcorrenciaHeDomFaixaNot2;
	}

	public void setOcorrenciaHeDomFaixaNot2(Integer ocorrenciaHeDomFaixaNot2) {
		OcorrenciaHeDomFaixaNot2 = ocorrenciaHeDomFaixaNot2;
	}

	public Integer getLimDomFaixaNot2() {
		return limDomFaixaNot2;
	}

	public void setLimDomFaixaNot2(Integer limDomFaixaNot2) {
		this.limDomFaixaNot2 = limDomFaixaNot2;
	}

	public Integer getOcorrenciaHeDomFaixaNot3() {
		return OcorrenciaHeDomFaixaNot3;
	}

	public void setOcorrenciaHeDomFaixaNot3(Integer ocorrenciaHeDomFaixaNot3) {
		OcorrenciaHeDomFaixaNot3 = ocorrenciaHeDomFaixaNot3;
	}

	public Integer getLimDomFaixaNot3() {
		return limDomFaixaNot3;
	}

	public void setLimDomFaixaNot3(Integer limDomFaixaNot3) {
		this.limDomFaixaNot3 = limDomFaixaNot3;
	}

	public Integer getOcorrenciaHeFerFaixaDiurno1() {
		return OcorrenciaHeFerFaixaDiurno1;
	}

	public void setOcorrenciaHeFerFaixaDiurno1(
			Integer ocorrenciaHeFerFaixaDiurno1) {
		OcorrenciaHeFerFaixaDiurno1 = ocorrenciaHeFerFaixaDiurno1;
	}

	public Integer getLimFerFaixaDiurno1() {
		return limFerFaixaDiurno1;
	}

	public void setLimFerFaixaDiurno1(Integer limFerFaixaDiurno1) {
		this.limFerFaixaDiurno1 = limFerFaixaDiurno1;
	}

	public Integer getOcorrenciaHeFerFaixaDiurno2() {
		return OcorrenciaHeFerFaixaDiurno2;
	}

	public void setOcorrenciaHeFerFaixaDiurno2(
			Integer ocorrenciaHeFerFaixaDiurno2) {
		OcorrenciaHeFerFaixaDiurno2 = ocorrenciaHeFerFaixaDiurno2;
	}

	public Integer getLimFerFaixaDiurno2() {
		return limFerFaixaDiurno2;
	}

	public void setLimFerFaixaDiurno2(Integer limFerFaixaDiurno2) {
		this.limFerFaixaDiurno2 = limFerFaixaDiurno2;
	}

	public Integer getOcorrenciaHeFerFaixaDiurno3() {
		return OcorrenciaHeFerFaixaDiurno3;
	}

	public void setOcorrenciaHeFerFaixaDiurno3(
			Integer ocorrenciaHeFerFaixaDiurno3) {
		OcorrenciaHeFerFaixaDiurno3 = ocorrenciaHeFerFaixaDiurno3;
	}

	public Integer getLimFerFaixaDiurno3() {
		return limFerFaixaDiurno3;
	}

	public void setLimFerFaixaDiurno3(Integer limFerFaixaDiurno3) {
		this.limFerFaixaDiurno3 = limFerFaixaDiurno3;
	}

	public Integer getOcorrenciaHeFerFaixaNot1() {
		return OcorrenciaHeFerFaixaNot1;
	}

	public void setOcorrenciaHeFerFaixaNot1(Integer ocorrenciaHeFerFaixaNot1) {
		OcorrenciaHeFerFaixaNot1 = ocorrenciaHeFerFaixaNot1;
	}

	public Integer getLimFerFaixaNot1() {
		return limFerFaixaNot1;
	}

	public void setLimFerFaixaNot1(Integer limFerFaixaNot1) {
		this.limFerFaixaNot1 = limFerFaixaNot1;
	}

	public Integer getOcorrenciaHeFerFaixaNot2() {
		return OcorrenciaHeFerFaixaNot2;
	}

	public void setOcorrenciaHeFerFaixaNot2(Integer ocorrenciaHeFerFaixaNot2) {
		OcorrenciaHeFerFaixaNot2 = ocorrenciaHeFerFaixaNot2;
	}

	public Integer getLimFerFaixaNot2() {
		return limFerFaixaNot2;
	}

	public void setLimFerFaixaNot2(Integer limFerFaixaNot2) {
		this.limFerFaixaNot2 = limFerFaixaNot2;
	}

	public Integer getOcorrenciaHeFerFaixaNot3() {
		return OcorrenciaHeFerFaixaNot3;
	}

	public void setOcorrenciaHeFerFaixaNot3(Integer ocorrenciaHeFerFaixaNot3) {
		OcorrenciaHeFerFaixaNot3 = ocorrenciaHeFerFaixaNot3;
	}

	public Integer getLimFerFaixaNot3() {
		return limFerFaixaNot3;
	}

	public void setLimFerFaixaNot3(Integer limFerFaixaNot3) {
		this.limFerFaixaNot3 = limFerFaixaNot3;
	}

	public Integer getOcorrenciaHeFolFaixaDiurno1() {
		return OcorrenciaHeFolFaixaDiurno1;
	}

	public void setOcorrenciaHeFolFaixaDiurno1(
			Integer ocorrenciaHeFolFaixaDiurno1) {
		OcorrenciaHeFolFaixaDiurno1 = ocorrenciaHeFolFaixaDiurno1;
	}

	public Integer getLimFolFaixaDiurno1() {
		return limFolFaixaDiurno1;
	}

	public void setLimFolFaixaDiurno1(Integer limFolFaixaDiurno1) {
		this.limFolFaixaDiurno1 = limFolFaixaDiurno1;
	}

	public Integer getOcorrenciaHeFolFaixaDiurno2() {
		return OcorrenciaHeFolFaixaDiurno2;
	}

	public void setOcorrenciaHeFolFaixaDiurno2(
			Integer ocorrenciaHeFolFaixaDiurno2) {
		OcorrenciaHeFolFaixaDiurno2 = ocorrenciaHeFolFaixaDiurno2;
	}

	public Integer getLimFolFaixaDiurno2() {
		return limFolFaixaDiurno2;
	}

	public void setLimFolFaixaDiurno2(Integer limFolFaixaDiurno2) {
		this.limFolFaixaDiurno2 = limFolFaixaDiurno2;
	}

	public Integer getOcorrenciaHeFolFaixaDiurno3() {
		return OcorrenciaHeFolFaixaDiurno3;
	}

	public void setOcorrenciaHeFolFaixaDiurno3(
			Integer ocorrenciaHeFolFaixaDiurno3) {
		OcorrenciaHeFolFaixaDiurno3 = ocorrenciaHeFolFaixaDiurno3;
	}

	public Integer getLimFolFaixaDiurno3() {
		return limFolFaixaDiurno3;
	}

	public void setLimFolFaixaDiurno3(Integer limFolFaixaDiurno3) {
		this.limFolFaixaDiurno3 = limFolFaixaDiurno3;
	}

	public Integer getOcorrenciaHeFolFaixaNot1() {
		return OcorrenciaHeFolFaixaNot1;
	}

	public void setOcorrenciaHeFolFaixaNot1(Integer ocorrenciaHeFolFaixaNot1) {
		OcorrenciaHeFolFaixaNot1 = ocorrenciaHeFolFaixaNot1;
	}

	public Integer getLimFolFaixaNot1() {
		return limFolFaixaNot1;
	}

	public void setLimFolFaixaNot1(Integer limFolFaixaNot1) {
		this.limFolFaixaNot1 = limFolFaixaNot1;
	}

	public Integer getOcorrenciaHeFolFaixaNot2() {
		return OcorrenciaHeFolFaixaNot2;
	}

	public void setOcorrenciaHeFolFaixaNot2(Integer ocorrenciaHeFolFaixaNot2) {
		OcorrenciaHeFolFaixaNot2 = ocorrenciaHeFolFaixaNot2;
	}

	public Integer getLimFolFaixaNot2() {
		return limFolFaixaNot2;
	}

	public void setLimFolFaixaNot2(Integer limFolFaixaNot2) {
		this.limFolFaixaNot2 = limFolFaixaNot2;
	}

	public Integer getOcorrenciaHeFolFaixaNot3() {
		return OcorrenciaHeFolFaixaNot3;
	}

	public void setOcorrenciaHeFolFaixaNot3(Integer ocorrenciaHeFolFaixaNot3) {
		OcorrenciaHeFolFaixaNot3 = ocorrenciaHeFolFaixaNot3;
	}

	public Integer getLimFolFaixaNot3() {
		return limFolFaixaNot3;
	}

	public void setLimFolFaixaNot3(Integer limFolFaixaNot3) {
		this.limFolFaixaNot3 = limFolFaixaNot3;
	}

	public Integer getOcorrenciaHeEspFaixaDiurno1() {
		return OcorrenciaHeEspFaixaDiurno1;
	}

	public void setOcorrenciaHeEspFaixaDiurno1(
			Integer ocorrenciaHeEspFaixaDiurno1) {
		OcorrenciaHeEspFaixaDiurno1 = ocorrenciaHeEspFaixaDiurno1;
	}

	public Integer getLimEspFaixaDiurno1() {
		return limEspFaixaDiurno1;
	}

	public void setLimEspFaixaDiurno1(Integer limEspFaixaDiurno1) {
		this.limEspFaixaDiurno1 = limEspFaixaDiurno1;
	}

	public Integer getOcorrenciaHeEspFaixaDiurno2() {
		return OcorrenciaHeEspFaixaDiurno2;
	}

	public void setOcorrenciaHeEspFaixaDiurno2(
			Integer ocorrenciaHeEspFaixaDiurno2) {
		OcorrenciaHeEspFaixaDiurno2 = ocorrenciaHeEspFaixaDiurno2;
	}

	public Integer getLimEspFaixaDiurno2() {
		return limEspFaixaDiurno2;
	}

	public void setLimEspFaixaDiurno2(Integer limEspFaixaDiurno2) {
		this.limEspFaixaDiurno2 = limEspFaixaDiurno2;
	}

	public Integer getOcorrenciaHeEspFaixaDiurno3() {
		return OcorrenciaHeEspFaixaDiurno3;
	}

	public void setOcorrenciaHeEspFaixaDiurno3(
			Integer ocorrenciaHeEspFaixaDiurno3) {
		OcorrenciaHeEspFaixaDiurno3 = ocorrenciaHeEspFaixaDiurno3;
	}

	public Integer getLimEspFaixaDiurno3() {
		return limEspFaixaDiurno3;
	}

	public void setLimEspFaixaDiurno3(Integer limEspFaixaDiurno3) {
		this.limEspFaixaDiurno3 = limEspFaixaDiurno3;
	}

	public Integer getOcorrenciaHeEspFaixaNot1() {
		return OcorrenciaHeEspFaixaNot1;
	}

	public void setOcorrenciaHeEspFaixaNot1(Integer ocorrenciaHeEspFaixaNot1) {
		OcorrenciaHeEspFaixaNot1 = ocorrenciaHeEspFaixaNot1;
	}

	public Integer getLimEspFaixaNot1() {
		return limEspFaixaNot1;
	}

	public void setLimEspFaixaNot1(Integer limEspFaixaNot1) {
		this.limEspFaixaNot1 = limEspFaixaNot1;
	}

	public Integer getOcorrenciaHeEspFaixaNot2() {
		return OcorrenciaHeEspFaixaNot2;
	}

	public void setOcorrenciaHeEspFaixaNot2(Integer ocorrenciaHeEspFaixaNot2) {
		OcorrenciaHeEspFaixaNot2 = ocorrenciaHeEspFaixaNot2;
	}

	public Integer getLimEspFaixaNot2() {
		return limEspFaixaNot2;
	}

	public void setLimEspFaixaNot2(Integer limEspFaixaNot2) {
		this.limEspFaixaNot2 = limEspFaixaNot2;
	}

	public Integer getOcorrenciaHeEspFaixaNot3() {
		return OcorrenciaHeEspFaixaNot3;
	}

	public void setOcorrenciaHeEspFaixaNot3(Integer ocorrenciaHeEspFaixaNot3) {
		OcorrenciaHeEspFaixaNot3 = ocorrenciaHeEspFaixaNot3;
	}

	public Integer getLimEspFaixaNot3() {
		return limEspFaixaNot3;
	}

	public void setLimEspFaixaNot3(Integer limEspFaixaNot3) {
		this.limEspFaixaNot3 = limEspFaixaNot3;
	}

	public Integer getOcorrenciaFaltas() {
		return OcorrenciaFaltas;
	}

	public void setOcorrenciaFaltas(Integer ocorrenciaFaltas) {
		OcorrenciaFaltas = ocorrenciaFaltas;
	}

	public Integer getOcorrenciaDSR() {
		return OcorrenciaDSR;
	}

	public void setOcorrenciaDSR(Integer ocorrenciaDSR) {
		OcorrenciaDSR = ocorrenciaDSR;
	}

	public Integer getOcorrenciaAdicionalNoturno() {
		return OcorrenciaAdicionalNoturno;
	}

	public void setOcorrenciaAdicionalNoturno(Integer ocorrenciaAdicionalNoturno) {
		OcorrenciaAdicionalNoturno = ocorrenciaAdicionalNoturno;
	}

	public Integer getOcorrenciaAtraso() {
		return OcorrenciaAtraso;
	}

	public void setOcorrenciaAtraso(Integer ocorrenciaAtraso) {
		OcorrenciaAtraso = ocorrenciaAtraso;
	}

	public Integer getOcorrenciaSaidaAntecipada() {
		return OcorrenciaSaidaAntecipada;
	}

	public void setOcorrenciaSaidaAntecipada(Integer ocorrenciaSaidaAntecipada) {
		OcorrenciaSaidaAntecipada = ocorrenciaSaidaAntecipada;
	}

	public Integer getOcorrenciaAfastamento() {
		return OcorrenciaAfastamento;
	}

	public void setOcorrenciaAfastamento(Integer ocorrenciaAfastamento) {
		OcorrenciaAfastamento = ocorrenciaAfastamento;
	}

	public Integer getOcorrenciaHorasNormais() {
		return OcorrenciaHorasNormais;
	}

	public void setOcorrenciaHorasNormais(Integer ocorrenciaHorasNormais) {
		OcorrenciaHorasNormais = ocorrenciaHorasNormais;
	}

	public Integer getOcorrenciaHorasNormaisTolerancia() {
		return OcorrenciaHorasNormaisTolerancia;
	}

	public void setOcorrenciaHorasNormaisTolerancia(
			Integer ocorrenciaHorasNormaisTolerancia) {
		OcorrenciaHorasNormaisTolerancia = ocorrenciaHorasNormaisTolerancia;
	}

	public TipoHoraExtra getTipoHoraExtra() {
		return tipoHoraExtra;
	}

	public void setTipoHoraExtra(TipoHoraExtra tipoHoraExtra) {
		this.tipoHoraExtra = tipoHoraExtra;
	}

	public Integer getOcorrenciaAtraso2() {
		return OcorrenciaAtraso2;
	}

	public void setOcorrenciaAtraso2(Integer ocorrenciaAtraso2) {
		OcorrenciaAtraso2 = ocorrenciaAtraso2;
	}

	public Integer getOcorrenciaSaidaAntecipada2() {
		return OcorrenciaSaidaAntecipada2;
	}

	public void setOcorrenciaSaidaAntecipada2(Integer ocorrenciaSaidaAntecipada2) {
		OcorrenciaSaidaAntecipada2 = ocorrenciaSaidaAntecipada2;
	}

	public Integer getOcorrenciaAtrasoNaoDescontato() {
		return OcorrenciaAtrasoNaoDescontato;
	}

	public void setOcorrenciaAtrasoNaoDescontato(
			Integer ocorrenciaAtrasoNaoDescontato) {
		OcorrenciaAtrasoNaoDescontato = ocorrenciaAtrasoNaoDescontato;
	}

	public Integer getOcorrenciaSaidaAntecipadaNaoDescontada() {
		return OcorrenciaSaidaAntecipadaNaoDescontada;
	}

	public void setOcorrenciaSaidaAntecipadaNaoDescontada(
			Integer ocorrenciaSaidaAntecipadaNaoDescontada) {
		OcorrenciaSaidaAntecipadaNaoDescontada = ocorrenciaSaidaAntecipadaNaoDescontada;
	}

	public Integer getOcorrenciaFolga() {
		return OcorrenciaFolga;
	}

	public void setOcorrenciaFolga(Integer ocorrenciaFolga) {
		OcorrenciaFolga = ocorrenciaFolga;
	}

	public Integer getOcorrenciaHorasNormaisNoturna() {
		return OcorrenciaHorasNormaisNoturna;
	}

	public void setOcorrenciaHorasNormaisNoturna(
			Integer ocorrenciaHorasNormaisNoturna) {
		OcorrenciaHorasNormaisNoturna = ocorrenciaHorasNormaisNoturna;
	}

	public Boolean getBancoHorasSeg() {
		return bancoHorasSeg;
	}

	public void setBancoHorasSeg(Boolean bancoHorasSeg) {
		this.bancoHorasSeg = bancoHorasSeg;
	}

	public Boolean getBancoHorasTer() {
		return bancoHorasTer;
	}

	public void setBancoHorasTer(Boolean bancoHorasTer) {
		this.bancoHorasTer = bancoHorasTer;
	}

	public Boolean getBancoHorasQua() {
		return bancoHorasQua;
	}

	public void setBancoHorasQua(Boolean bancoHorasQua) {
		this.bancoHorasQua = bancoHorasQua;
	}

	public Boolean getBancoHorasQui() {
		return bancoHorasQui;
	}

	public void setBancoHorasQui(Boolean bancoHorasQui) {
		this.bancoHorasQui = bancoHorasQui;
	}

	public Boolean getBancoHorasSex() {
		return bancoHorasSex;
	}

	public void setBancoHorasSex(Boolean bancoHorasSex) {
		this.bancoHorasSex = bancoHorasSex;
	}

	public Boolean getBancoHorasSab() {
		return bancoHorasSab;
	}

	public void setBancoHorasSab(Boolean bancoHorasSab) {
		this.bancoHorasSab = bancoHorasSab;
	}

	public Boolean getBancoHorasDom() {
		return bancoHorasDom;
	}

	public void setBancoHorasDom(Boolean bancoHorasDom) {
		this.bancoHorasDom = bancoHorasDom;
	}

	public Boolean getBancoHorasFer() {
		return bancoHorasFer;
	}

	public void setBancoHorasFer(Boolean bancoHorasFer) {
		this.bancoHorasFer = bancoHorasFer;
	}

	public Boolean getBancoHorasFol() {
		return bancoHorasFol;
	}

	public void setBancoHorasFol(Boolean bancoHorasFol) {
		this.bancoHorasFol = bancoHorasFol;
	}

	public Boolean getBancoHorasEsp() {
		return bancoHorasEsp;
	}

	public void setBancoHorasEsp(Boolean bancoHorasEsp) {
		this.bancoHorasEsp = bancoHorasEsp;
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
		Norma other = (Norma) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}

	public Integer getOcorrenciaHeSegFaixaNot2() {
		return OcorrenciaHeSegFaixaNot2;
	}

	
	
	public Integer getOcorrenciaDebito() {
		return OcorrenciaDebito;
	}

	public void setOcorrenciaDebito(Integer ocorrenciaDebito) {
		OcorrenciaDebito = ocorrenciaDebito;
	}

	public Integer getOcorrenciaCredito() {
		return OcorrenciaCredito;
	}

	public void setOcorrenciaCredito(Integer ocorrenciaCredito) {
		OcorrenciaCredito = ocorrenciaCredito;
	}

	@Override
	public String toString() {
		return "Norma [Id=" + Id + ", norma=" + norma + ", OcorrenciaFaltas="
				+ OcorrenciaFaltas + ", OcorrenciaDSR=" + OcorrenciaDSR
				+ ", OcorrenciaAdicionalNoturno=" + OcorrenciaAdicionalNoturno
				+ ", OcorrenciaAtraso=" + OcorrenciaAtraso
				+ ", OcorrenciaAtraso2=" + OcorrenciaAtraso2
				+ ", OcorrenciaSaidaAntecipada=" + OcorrenciaSaidaAntecipada
				+ ", OcorrenciaSaidaAntecipada2=" + OcorrenciaSaidaAntecipada2
				+ ", OcorrenciaAtrasoNaoDescontato="
				+ OcorrenciaAtrasoNaoDescontato
				+ ", OcorrenciaSaidaAntecipadaNaoDescontada="
				+ OcorrenciaSaidaAntecipadaNaoDescontada
				+ ", OcorrenciaAfastamento=" + OcorrenciaAfastamento
				+ ", OcorrenciaHorasNormais=" + OcorrenciaHorasNormais
				+ ", OcorrenciaHorasNormaisNoturna="
				+ OcorrenciaHorasNormaisNoturna
				+ ", OcorrenciaHorasNormaisTolerancia="
				+ OcorrenciaHorasNormaisTolerancia + ", OcorrenciaFolga="
				+ OcorrenciaFolga + ", tipoHoraExtra=" + tipoHoraExtra
				+ ", OcorrenciaHeSegFaixaDiurno1="
				+ OcorrenciaHeSegFaixaDiurno1 + ", limSegFaixaDiurno1="
				+ limSegFaixaDiurno1 + ", OcorrenciaHeSegFaixaDiurno2="
				+ OcorrenciaHeSegFaixaDiurno2 + ", limSegFaixaDiurno2="
				+ limSegFaixaDiurno2 + ", OcorrenciaHeSegFaixaDiurno3="
				+ OcorrenciaHeSegFaixaDiurno3 + ", limSegFaixaDiurno3="
				+ limSegFaixaDiurno3 + ", OcorrenciaHeSegFaixaNot1="
				+ OcorrenciaHeSegFaixaNot1 + ", limSegFaixaNot1="
				+ limSegFaixaNot1 + ", OcorrenciaHeSegFaixaNot2="
				+ OcorrenciaHeSegFaixaNot2 + ", limSegFaixaNot2="
				+ limSegFaixaNot2 + ", OcorrenciaHeSegFaixaNot3="
				+ OcorrenciaHeSegFaixaNot3 + ", limSegFaixaNot3="
				+ limSegFaixaNot3 + ", OcorrenciaHeTerFaixaDiurno1="
				+ OcorrenciaHeTerFaixaDiurno1 + ", limTerFaixaDiurno1="
				+ limTerFaixaDiurno1 + ", OcorrenciaHeTerFaixaDiurno2="
				+ OcorrenciaHeTerFaixaDiurno2 + ", limTerFaixaDiurno2="
				+ limTerFaixaDiurno2 + ", OcorrenciaHeTerFaixaDiurno3="
				+ OcorrenciaHeTerFaixaDiurno3 + ", limTerFaixaDiurno3="
				+ limTerFaixaDiurno3 + ", OcorrenciaHeTerFaixaNot1="
				+ OcorrenciaHeTerFaixaNot1 + ", limTerFaixaNot1="
				+ limTerFaixaNot1 + ", OcorrenciaHeTerFaixaNot2="
				+ OcorrenciaHeTerFaixaNot2 + ", limTerFaixaNot2="
				+ limTerFaixaNot2 + ", OcorrenciaHeTerFaixaNot3="
				+ OcorrenciaHeTerFaixaNot3 + ", limTerFaixaNot3="
				+ limTerFaixaNot3 + ", OcorrenciaHeQuaFaixaDiurno1="
				+ OcorrenciaHeQuaFaixaDiurno1 + ", limQuaFaixaDiurno1="
				+ limQuaFaixaDiurno1 + ", OcorrenciaHeQuaFaixaDiurno2="
				+ OcorrenciaHeQuaFaixaDiurno2 + ", limQuaFaixaDiurno2="
				+ limQuaFaixaDiurno2 + ", OcorrenciaHeQuaFaixaDiurno3="
				+ OcorrenciaHeQuaFaixaDiurno3 + ", limQuaFaixaDiurno3="
				+ limQuaFaixaDiurno3 + ", OcorrenciaHeQuaFaixaNot1="
				+ OcorrenciaHeQuaFaixaNot1 + ", limQuaFaixaNot1="
				+ limQuaFaixaNot1 + ", OcorrenciaHeQuaFaixaNot2="
				+ OcorrenciaHeQuaFaixaNot2 + ", limQuaFaixaNot2="
				+ limQuaFaixaNot2 + ", OcorrenciaHeQuaFaixaNot3="
				+ OcorrenciaHeQuaFaixaNot3 + ", limQuaFaixaNot3="
				+ limQuaFaixaNot3 + ", OcorrenciaHeQuiFaixaDiurno1="
				+ OcorrenciaHeQuiFaixaDiurno1 + ", limQuiFaixaDiurno1="
				+ limQuiFaixaDiurno1 + ", OcorrenciaHeQuiFaixaDiurno2="
				+ OcorrenciaHeQuiFaixaDiurno2 + ", limQuiFaixaDiurno2="
				+ limQuiFaixaDiurno2 + ", OcorrenciaHeQuiFaixaDiurno3="
				+ OcorrenciaHeQuiFaixaDiurno3 + ", limQuiFaixaDiurno3="
				+ limQuiFaixaDiurno3 + ", OcorrenciaHeQuiFaixaNot1="
				+ OcorrenciaHeQuiFaixaNot1 + ", limQuiFaixaNot1="
				+ limQuiFaixaNot1 + ", OcorrenciaHeQuiFaixaNot2="
				+ OcorrenciaHeQuiFaixaNot2 + ", limQuiFaixaNot2="
				+ limQuiFaixaNot2 + ", OcorrenciaHeQuiFaixaNot3="
				+ OcorrenciaHeQuiFaixaNot3 + ", limQuiFaixaNot3="
				+ limQuiFaixaNot3 + ", OcorrenciaHeSexFaixaDiurno1="
				+ OcorrenciaHeSexFaixaDiurno1 + ", limSexFaixaDiurno1="
				+ limSexFaixaDiurno1 + ", OcorrenciaHeSexFaixaDiurno2="
				+ OcorrenciaHeSexFaixaDiurno2 + ", limSexFaixaDiurno2="
				+ limSexFaixaDiurno2 + ", OcorrenciaHeSexFaixaDiurno3="
				+ OcorrenciaHeSexFaixaDiurno3 + ", limSexFaixaDiurno3="
				+ limSexFaixaDiurno3 + ", OcorrenciaHeSexFaixaNot1="
				+ OcorrenciaHeSexFaixaNot1 + ", limSexFaixaNot1="
				+ limSexFaixaNot1 + ", OcorrenciaHeSexFaixaNot2="
				+ OcorrenciaHeSexFaixaNot2 + ", limSexFaixaNot2="
				+ limSexFaixaNot2 + ", OcorrenciaHeSexFaixaNot3="
				+ OcorrenciaHeSexFaixaNot3 + ", limSexFaixaNot3="
				+ limSexFaixaNot3 + ", OcorrenciaHeSabFaixaDiurno1="
				+ OcorrenciaHeSabFaixaDiurno1 + ", limSabFaixaDiurno1="
				+ limSabFaixaDiurno1 + ", OcorrenciaHeSabFaixaDiurno2="
				+ OcorrenciaHeSabFaixaDiurno2 + ", limSabFaixaDiurno2="
				+ limSabFaixaDiurno2 + ", OcorrenciaHeSabFaixaDiurno3="
				+ OcorrenciaHeSabFaixaDiurno3 + ", limSabFaixaDiurno3="
				+ limSabFaixaDiurno3 + ", OcorrenciaHeSabFaixaNot1="
				+ OcorrenciaHeSabFaixaNot1 + ", limSabFaixaNot1="
				+ limSabFaixaNot1 + ", OcorrenciaHeSabFaixaNot2="
				+ OcorrenciaHeSabFaixaNot2 + ", limSabFaixaNot2="
				+ limSabFaixaNot2 + ", OcorrenciaHeSabFaixaNot3="
				+ OcorrenciaHeSabFaixaNot3 + ", limSabFaixaNot3="
				+ limSabFaixaNot3 + ", OcorrenciaHeDomFaixaDiurno1="
				+ OcorrenciaHeDomFaixaDiurno1 + ", limDomFaixaDiurno1="
				+ limDomFaixaDiurno1 + ", OcorrenciaHeDomFaixaDiurno2="
				+ OcorrenciaHeDomFaixaDiurno2 + ", limDomFaixaDiurno2="
				+ limDomFaixaDiurno2 + ", OcorrenciaHeDomFaixaDiurno3="
				+ OcorrenciaHeDomFaixaDiurno3 + ", limDomFaixaDiurno3="
				+ limDomFaixaDiurno3 + ", OcorrenciaHeDomFaixaNot1="
				+ OcorrenciaHeDomFaixaNot1 + ", limDomFaixaNot1="
				+ limDomFaixaNot1 + ", OcorrenciaHeDomFaixaNot2="
				+ OcorrenciaHeDomFaixaNot2 + ", limDomFaixaNot2="
				+ limDomFaixaNot2 + ", OcorrenciaHeDomFaixaNot3="
				+ OcorrenciaHeDomFaixaNot3 + ", limDomFaixaNot3="
				+ limDomFaixaNot3 + ", OcorrenciaHeFerFaixaDiurno1="
				+ OcorrenciaHeFerFaixaDiurno1 + ", limFerFaixaDiurno1="
				+ limFerFaixaDiurno1 + ", OcorrenciaHeFerFaixaDiurno2="
				+ OcorrenciaHeFerFaixaDiurno2 + ", limFerFaixaDiurno2="
				+ limFerFaixaDiurno2 + ", OcorrenciaHeFerFaixaDiurno3="
				+ OcorrenciaHeFerFaixaDiurno3 + ", limFerFaixaDiurno3="
				+ limFerFaixaDiurno3 + ", OcorrenciaHeFerFaixaNot1="
				+ OcorrenciaHeFerFaixaNot1 + ", limFerFaixaNot1="
				+ limFerFaixaNot1 + ", OcorrenciaHeFerFaixaNot2="
				+ OcorrenciaHeFerFaixaNot2 + ", limFerFaixaNot2="
				+ limFerFaixaNot2 + ", OcorrenciaHeFerFaixaNot3="
				+ OcorrenciaHeFerFaixaNot3 + ", limFerFaixaNot3="
				+ limFerFaixaNot3 + ", OcorrenciaHeFolFaixaDiurno1="
				+ OcorrenciaHeFolFaixaDiurno1 + ", limFolFaixaDiurno1="
				+ limFolFaixaDiurno1 + ", OcorrenciaHeFolFaixaDiurno2="
				+ OcorrenciaHeFolFaixaDiurno2 + ", limFolFaixaDiurno2="
				+ limFolFaixaDiurno2 + ", OcorrenciaHeFolFaixaDiurno3="
				+ OcorrenciaHeFolFaixaDiurno3 + ", limFolFaixaDiurno3="
				+ limFolFaixaDiurno3 + ", OcorrenciaHeFolFaixaNot1="
				+ OcorrenciaHeFolFaixaNot1 + ", limFolFaixaNot1="
				+ limFolFaixaNot1 + ", OcorrenciaHeFolFaixaNot2="
				+ OcorrenciaHeFolFaixaNot2 + ", limFolFaixaNot2="
				+ limFolFaixaNot2 + ", OcorrenciaHeFolFaixaNot3="
				+ OcorrenciaHeFolFaixaNot3 + ", limFolFaixaNot3="
				+ limFolFaixaNot3 + ", OcorrenciaHeEspFaixaDiurno1="
				+ OcorrenciaHeEspFaixaDiurno1 + ", limEspFaixaDiurno1="
				+ limEspFaixaDiurno1 + ", OcorrenciaHeEspFaixaDiurno2="
				+ OcorrenciaHeEspFaixaDiurno2 + ", limEspFaixaDiurno2="
				+ limEspFaixaDiurno2 + ", OcorrenciaHeEspFaixaDiurno3="
				+ OcorrenciaHeEspFaixaDiurno3 + ", limEspFaixaDiurno3="
				+ limEspFaixaDiurno3 + ", OcorrenciaHeEspFaixaNot1="
				+ OcorrenciaHeEspFaixaNot1 + ", limEspFaixaNot1="
				+ limEspFaixaNot1 + ", OcorrenciaHeEspFaixaNot2="
				+ OcorrenciaHeEspFaixaNot2 + ", limEspFaixaNot2="
				+ limEspFaixaNot2 + ", OcorrenciaHeEspFaixaNot3="
				+ OcorrenciaHeEspFaixaNot3 + ", limEspFaixaNot3="
				+ limEspFaixaNot3 + "]";
	}

	// @Override
	// public String toString() {
	// return "Norma [Id=" + Id + ", norma=" + norma
	// + ", OcorrenciaHeSegFaixaDiurno1="
	// + OcorrenciaHeSegFaixaDiurno1 + ", limSegFaixaDiurno1="
	// + limSegFaixaDiurno1 + ", OcorrenciaHeSegFaixaDiurno2="
	// + OcorrenciaHeSegFaixaDiurno2 + ", limSegFaixaDiurno2="
	// + limSegFaixaDiurno2 + ", OcorrenciaHeSegFaixaDiurno3="
	// + OcorrenciaHeSegFaixaDiurno3 + ", limSegFaixaDiurno3="
	// + limSegFaixaDiurno3 + ", OcorrenciaHeSegFaixaNot1="
	// + OcorrenciaHeSegFaixaNot1 + ", limSegFaixaNot1="
	// + limSegFaixaNot1 + ", OcorrenciaHeSegFaixaNot2="
	// + OcorrenciaHeSegFaixaNot2 + ", limSegFaixaNot2="
	// + limSegFaixaNot2 + ", OcorrenciaHeSegFaixaNot3="
	// + OcorrenciaHeSegFaixaNot3 + ", limSegFaixaNot3="
	// + limSegFaixaNot3 + "]";
	// }

}

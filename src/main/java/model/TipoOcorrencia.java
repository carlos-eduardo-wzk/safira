package model;

public enum TipoOcorrencia {

	HORA_NORMAL("HN"),
	ATRASO("ATRASO"),
	SAIDA_ANTECIPADA("SAIDA"),
	HE("HE"),
	FALTA("FALTA"),	
	AFASTAMENTO("AFASTAMENTO"),
	FOLGA("FOLGA"),	
	DEBITO("DEBITO"),
	CREDITO("CREDITO"),	
	AN("AN");
	
	
	
	
	private TipoOcorrencia(String descricao) {
		this.descricao = descricao;
	}

	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	
}

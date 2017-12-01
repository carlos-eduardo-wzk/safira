package model;

public enum TipoDia {

	AFASTADO("AFASTADO"), 
	FERIADO("FERIADO"),
	NORMAL("NORMAL"),
	DEMITIDO("DEMITIDO"),
	DESCANSO("DESCANSO"),
	FOLGA("FOLGA"),
	SEMJORNADA("SEM_JORNADA"),
	FALTA("FALTA"),
	MARCACAOINVALIDA("MARCACAO_INVALIDA");
	
	
	private TipoDia(String descricao) {
		this.descricao = descricao;
	}

	private String descricao;

	public String getDescricao() {
		return descricao;
	}
}

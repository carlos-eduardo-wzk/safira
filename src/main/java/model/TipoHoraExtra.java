package model;

public enum TipoHoraExtra {
	DIARIO("diario"), 
	MENSAL("mensal");

	private String descricao;

	TipoHoraExtra(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
}

package model;

public enum TipoAjusteBanco {
	
	SALDOINICIAL("saldoinicial"), 
	AJUSTE("ajuste"), 
	FECHAMENTO("fechamento");

	private String descricao;

	TipoAjusteBanco(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}

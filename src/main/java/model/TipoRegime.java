package model;

public enum TipoRegime {

	FIXO("fixo"), 
	FLEXIVEL("flexivel");

	private String descricao;

	TipoRegime(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}

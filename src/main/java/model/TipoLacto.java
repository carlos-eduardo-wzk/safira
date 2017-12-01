package model;

public enum TipoLacto {
	
	CREDITO("credito"), 
	DEBITO("debito");

	private String descricao;

	TipoLacto(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}

package model;

public enum TipoComunicacao {

	IP("IP"), 
	PEN("PEN DRIVER");

	
	private TipoComunicacao(String descricao) {
		this.descricao = descricao;
	}

	private String descricao;

	public String getDescricao() {
		return descricao;
	}
	
}

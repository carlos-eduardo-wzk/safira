package model;

public enum UnidadeFederacao {

	AC("Acre"), AL("Alagoas"), AM("Amazonas"), AP("Amapa°"), BA("Bahia"), CE(
			"Cear·"), DF("Distrito Federal"), ES("Espirito Santo"), GO("Goias"), MA(
			"Maranh„o"), MG("Minas Gerais"), MS("Mato Grosso Sul"), MT(
			"Mato Grosso"), PA("Par√°"), PB("Paraiba"), PE("Pernanbuco"), PI(
			"Piaui"), PR("Parana"), RJ("Rio de Janeiro"), RN(
			"Rio Grande do Norte"), RO("Rondonia"), RR("Roraima"), RS(
			"Rio Grande do Sul"), SC("Santa Catarina"), SE("Sergipe"), SP(
			"S„o Paulo"), TO("Tocantins");

	private String descricao;

	UnidadeFederacao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}

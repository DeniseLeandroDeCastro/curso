package br.com.ifrn.domain.enums;

public enum TipoCliente {
	
	PESSOAFISICA(1, "Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Jurídica");
	
	private int cod;
	private String descricao;
	
	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;	
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	//Método para devolver o tipo de pessoa em enum
	public static TipoCliente toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		/*
		 * For para percorrer todos os valores possíveis de TipoPessoa
		 * se o tipo de pessoa for igual ao tipo passado pelo usuário
		 * será devolvido o tipo, senão será emitida a mensagem de erro:
		 * Id inválido.
		 */
		for(TipoCliente x : TipoCliente.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + cod);	
	}
}

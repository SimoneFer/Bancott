package br.com.tt.bancott.model;

public class Movimento {
	private String tipo;
	private Double valor;
	private String descricao;
	
	//cria��o do construtor da classe movimento
	public Movimento(String tipo, double valor, String descricao) {
		this.tipo = tipo;
		this.valor = valor;
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return String.format("Movimento[tipo=%s,valor=R$ %.2f,descricao=%s]", 
				tipo,
				valor,
				descricao);
}
}

package br.com.tt.bancott.model;

public class Conta {
	private Integer agencia;
	private Integer numero;
	private Double saldo;

	// array
	private Movimento[] movimentos;

	public Conta(Integer agencia, Integer numero) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0.0;
		this.movimentos = new Movimento[1000];
	}

	@Override
	public String toString() {
		return String.format("Conta[agencia=%s,numero=%s,saldo=R$ %.2f]", agencia, numero, saldo);
	}

	public void incluirMovimento(Movimento movimento) {
		for (int indice = 0; indice < movimentos.length; indice++) {

			if (movimentos[indice] == null) {
				movimentos[indice] = movimento;
				break;
			}
		}
	}

	public Movimento[] getMovimentos() {
		return movimentos;
	}
}

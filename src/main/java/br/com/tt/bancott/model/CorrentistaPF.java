package br.com.tt.bancott.model;

public class CorrentistaPF extends Correntista {

	private String documento;
	private String tipoDeDocumento;

	public CorrentistaPF(String nome, Conta conta, String documento, String tipoDeDocumento) {
		super(nome, conta);
		this.documento = documento;
		this.tipoDeDocumento = tipoDeDocumento;
	}

}

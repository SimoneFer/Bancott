package br.com.tt.bancott.model;

public class CorrentistaPF extends Correntista {

	private String documento;
	private TipoDocumentoPF tipoDeDocumento;
	
//Método construtor - Visibilidade; Mesmo nome da classe; Parâmetros de entrada (variáveis)
	public CorrentistaPF(String nome, Conta conta,TipoDocumentoPF tipoDeDocumento, String documento) {
		super(nome, conta);
		this.documento = documento;
		this.tipoDeDocumento = tipoDeDocumento;
		this.documento = documento;
	}

}

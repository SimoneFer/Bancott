package br.com.tt.bancott.model;

public class CorrentistaPF extends Correntista {

	private String documento;
	private TipoDocumentoPF tipoDeDocumento;
	
//M�todo construtor - Visibilidade; Mesmo nome da classe; Par�metros de entrada (vari�veis)
	public CorrentistaPF(String nome, Conta conta,TipoDocumentoPF tipoDeDocumento, String documento) {
		super(nome, conta);
		this.documento = documento;
		this.tipoDeDocumento = tipoDeDocumento;
		this.documento = documento;
	}

}

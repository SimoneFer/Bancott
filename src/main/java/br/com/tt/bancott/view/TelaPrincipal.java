package br.com.tt.bancott.view;

import java.util.Scanner;

public class TelaPrincipal {

	public void abrirTela() {
		Scanner scanner = new Scanner(System.in);
		
		do {
			this.imprimirMenu();
		

				// ler a entrada do usuário
		int opcaoUsuario = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		switch (opcaoUsuario) {
		case 1:
			System.out.println("Tela correntista!");
			TelaCorrentista telaCorrentista = new TelaCorrentista();
			telaCorrentista.abrirTela();
			break;

		case 2:
			TelaMovimento telaMovimento = new TelaMovimento();
			telaMovimento.abrirTela();
			break;

		case 0:
			System.out.println("Encerrar programa");          
			scanner.close();
			System.exit(0);
			break;

		default:
			System.out.println("Opção inválida! Selecione outra opção.");
			break;
		}
		} while(true);
	}
		
		private void imprimirMenu() {
			
		    System.out.println("=====Tela Principal=====");
			System.out.println("Digite:");
			System.out.println(" - [1] para Tela Correntista");
			System.out.println(" - [2] para Tela Movimento");
			System.out.println(" - [0] para encerrar programa");
			System.out.println("-----------------------------");

	

	}

}

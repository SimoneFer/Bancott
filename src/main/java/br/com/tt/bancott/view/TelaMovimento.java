package br.com.tt.bancott.view;

import java.util.Scanner;

import br.com.tt.bancott.infra.BancoDados;
import br.com.tt.bancott.model.Correntista;
import br.com.tt.bancott.model.Movimento;

public class TelaMovimento {
	private Scanner scanner = new Scanner(System.in);

	public void abrirTela() {
		do {
			this.mostrarMenu();
			int opcaoUsuario = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			switch (opcaoUsuario) {
			case 1:
				 this.incluirMovimento();
				break;
			case 2:
				this.listarMovimentosCorrentistas();
				break;
			case 0:
				// encerra a execução do método
				return;
			
			default:
				System.out.println("Opção inválida. Selecione outra opção.");
				break;

			}

		} while (true);
	}

	private void listarMovimentosCorrentistas() {
		this.listarTodosCorrentistas();
		System.out.println("Digite o número do correntista):");
		int indiceCorrentista = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		BancoDados bancoDeDados = BancoDados.getInstancia();
		Correntista correntista =  bancoDeDados.selecionarCorrentista(indiceCorrentista);
		
		Movimento[] movimentos  = correntista.listarMovimentosDaConta();
		
		for(Movimento movimento : movimentos) {
			
			if (movimento !=null) {
				System.out.println(movimento);
			}
		}
	}

	private void incluirMovimento() {
		//1- listar os correntistas
		this.listarTodosCorrentistas();
		
			
		// 2- selecionar um correntista
		System.out.println("Digite o número do correntista):");
		int indiceCorrentista = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		BancoDados bancoDeDados = BancoDados.getInstancia();
		Correntista correntista =  bancoDeDados.selecionarCorrentista(indiceCorrentista);
		
		
		System.out.println("Digite o tipo do movimento(debito ou credito):");
		String tipo = scanner.nextLine();
		
		System.out.println("Digite o valor do movimento:");
		double valor = scanner.nextDouble(); 
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?"); //comando de final de curso
		
		System.out.println("Digite a descrição do movimento:");
		String descricao = scanner.nextLine(); 
		
		Movimento movimento = new Movimento(tipo, valor, descricao);
		
		//3- adicionar o movimento à conta do correntista selecionado
		
		correntista.incluirMovimentoAConta(movimento);
		
		System.out.println("Movimento cadastrado com sucesso");
		}

	private void mostrarMenu() {
		System.out.println("=====Tela Movimento=====");
		System.out.println("Digite:");
		System.out.println(" - [1] para incluir movimento");
		System.out.println(" - [2] para listar movimentos de um correntista");
		System.out.println(" - [0] para retornar a Tela Principal");
		System.out.println("-----------------------------");
	}
	private void listarTodosCorrentistas() {
		BancoDados bancoDeDados = BancoDados.getInstancia();
		Correntista[] correntistas =  bancoDeDados.listarTodosCorrentistas();
		
		int indice = 0;
		
		for (Correntista correntista : correntistas) {
			if(correntista != null) {
			System.out.println(String.format("%s-%s",  indice,correntista));
			}
			indice++;
		}
	}
}

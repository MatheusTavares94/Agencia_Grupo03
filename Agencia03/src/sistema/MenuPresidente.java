package sistema;

import java.util.Scanner;

import servicos.Conta;

public class MenuPresidente {
	Scanner scan = new Scanner(System.in);

	public void menuPresidente() {
		int opcao;

		do {
			System.out.println("");
			System.out.println("====================================");
			System.out.println(" 1 - Movimentações e Informações da Conta");
			System.out.println(" 2 - Relátorios");
			System.out.println(" 3 - Sair");
			System.out.println("========Digite a opção escolhida=======");
			opcao = scan.nextInt();

			switch (opcao) {

			case 1:
				menuMovimentacoes();
				break;

			case 2:
				menuRelatorios();
				break;

			case 3:
				System.out.println("Saindo...");
				break;

			default:
				System.out.println("Opção inválida!\nDigite novamente.");
			}
		} while (opcao != 3);
	}

	public void menuMovimentacoes() {
		int opcao;

		do {
			System.out.println("");
			System.out.println("====================================");
			System.out.println(" 1 - Saque");
			System.out.println(" 2 - Depósito");
			System.out.println(" 3 - Transferência");
			System.out.println(" 4 - Voltar ao menu anterior");
			System.out.println(" 5 - Finalizar");
			System.out.println("========Digite a opção escolhida=======");
			opcao = scan.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Digite o quanto deseja sacar:");
				double saque = scan.nextDouble();
				variavel.sacar(saque); // variavel a ser criada
				break;

			case 2:
				System.out.println("Digite o quanto deseja depositar:");
				double deposito = scan.nextDouble();
				variavel.depositar(deposito); // variavel a ser criada
				break;

			case 3:
				System.out.println("Digite o quanto deseja transferir:");
				double valorTransferir = scan.nextDouble();
				System.out.println("Digite o CPF da conta destino:");
				String contaTransferir = scan.next();
				variavel.transferir(contaTransferir, valorTransferir); // variavel a ser criada
				break;

			case 4:
				menuPresidente();
				break;

			case 5:
				System.exit(0);
				break;

			default:
				System.out.println("Opção inválida!\nDigite novamente.");
			}
		} while (opcao != 5);

	}

	public void menuRelatorios() {
		int opcao;

		do {
			System.out.println("");
			System.out.println("====================================");
			System.out.println(" 1 - Mostrar Saldo");
			System.out.println(" 2 - Relatório da Conta Corrente");
			System.out.println(" 3 - Simulação de Rendimento da Conta Poupança");
			System.out.println(" 4 - Relatório de Clientes");
			System.out.println(" 5 - Relatório de Capital Total");
			System.out.println(" 6 - Voltar ao menu anterior");
			System.out.println(" 7 - Finalizar");
			System.out.println("========Digite a opção escolhida=======");
			opcao = scan.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Seu saldo é de: " + (Conta.getSaldo()));
				break;

			case 2: // relatorioCC();
				break;

			case 3:
				simulaRendimento();
				break;

			case 4: // relatorioClientes();
				break;

			case 5: // relatorioCapitalTotal();
				break;

			case 6:
				menuPresidente();
				break;

			case 7:
				System.exit(0);
				break;

			default:
				System.out.println("Opção inválida!\nDigite novamente.");
			}
		} while (opcao != 5);

	}

	public void simulaRendimento() {
		double valor;
		int meses;
		System.out.println("Insira o valor para a simulação:");
		valor = scan.nextDouble();
		System.out.println("Insira o tempo em meses que deseja simular:");
		meses = scan.nextInt();
		System.out.println("O investimento de R$" + valor + " renderá R$" + (valor * 0.005) * meses + " ao total de "
				+ meses + "meses.");

	}

}
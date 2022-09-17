package sistema;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

import pessoal.Pessoa;
import servicos.Conta;

public class Menu {

	public Menu() {
		super();
	}

	static int contador = 0;
	static Scanner scan = new Scanner(System.in);

	static int operacao;
	static double valor;

	public static void menu(Pessoa usuario, Conta conta, Map<String, Conta> mc) throws IOException {
		int opcao;

		do {
			System.out.println("");
			System.out.println("====================================");
			System.out.println(" 1 - Movimentações e Informações da Conta");
			System.out.println(" 2 - Relatórios");
			System.out.println(" 3 - Sair");
			System.out.println("========Digite a opção escolhida=======");
			opcao = scan.nextInt();

			switch (opcao) {

			case 1:
				menuMovimentacoes(usuario, conta, mc);
				break;

			case 2:
				menuRelatorios(usuario, conta, mc);
				break;

			case 3:
				System.out.println("Saindo...");
				break;

			default:
				System.out.println("Opção inválida!\nDigite novamente.");
			}
		} while (opcao != 3);
	}

	public static void menuMovimentacoes(Pessoa usuario, Conta conta, Map<String, Conta> mc) throws IOException {
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
			operacao = opcao;

			switch (opcao) {

			case 1:
				System.out.println("Digite o quanto deseja sacar:");
				double saque = scan.nextDouble();
				conta.sacar(saque);
				valor = saque;
				contador++;
				Relatorio.Escrever(".\\src\\file\\0 " + usuario.getNome() + "_" + contador + "_Saque_RELATORIO.txt");
				System.out.println("Saque realizado com sucesso \nO novo saldo é R$" + conta.getSaldo());
				break;

			case 2:
				System.out.println("Digite o quanto deseja depositar:");
				double deposito = scan.nextDouble();
				conta.depositar(deposito);
				valor = deposito;
				contador++;
				Relatorio.Escrever(".\\src\\file\\0 " + usuario.getNome() + "_" + contador + "_Deposito_RELATORIO.txt");
				System.out.println("Depósito realizado com sucesso \nO novo saldo é R$" + conta.getSaldo());
				break;

			case 3:
				System.out.println("Digite o quanto deseja transferir:");
				double valorTransferir = scan.nextDouble();
				System.out.println("Digite o CPF da conta destino:");
				String contaTransferir = scan.next();
				if (mc.containsKey(contaTransferir) == true) {
					Conta contaDestino = mc.get(contaTransferir);
					conta.transferir(contaDestino, valorTransferir);
					valor = valorTransferir;
					contador++;
					Relatorio.Escrever(
							".\\src\\file\\0 " + usuario.getNome() + "_" + contador + "_Transferencia_RELATORIO.txt");
				} else {
					System.out.println("Não é possível realizar a operação");
				}
				break;

			case 4:
				menu(usuario, conta, mc);
				break;

			case 5:
				System.exit(0);
				break;

			default:
				System.out.println("Opção inválida!\nDigite novamente.");
			}
		} while (opcao != 5);

	}

	public static void menuRelatorios(Pessoa usuario, Conta conta, Map<String, Conta> mc) throws IOException {
		int opcao;

		do {
			System.out.println("");
			System.out.println("====================================");
			System.out.println(" 1 - Mostrar Saldo");
			System.out.println(" 2 - Relatório da Conta Corrente");
			System.out.println(" 3 - Simulação de Rendimento da Conta Poupança");
			System.out.println(" 4 - Voltar ao menu anterior");
			System.out.println(" 5 - Finalizar");
			System.out.println("========Digite a opção escolhida=======");
			opcao = scan.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Seu saldo é de R$" + conta.getSaldo());
				break;

			case 2:

				Leitor.leitor(".\\src\\file\\RELATORIO.txt");

				break;

			case 3:
				simulaRendimento();
				break;

			case 4:
				menu(usuario, conta, mc);
				break;

			case 5:
				System.exit(0);
				break;

			default:
				System.out.println("Opção inválida!\nDigite novamente.");
			}
		} while (opcao != 5);

	}

	public static void simulaRendimento() {
		double valor;
		int meses;
		System.out.println("Insira o valor para a simulação:");
		valor = scan.nextDouble();
		System.out.println("Insira o tempo em meses que deseja simular:");
		meses = scan.nextInt();
		System.out.println("O investimento de R$" + valor + " renderá R$" + (valor * 0.005) * meses + " ao total de "
				+ meses + "meses.");

	}

	public static int getOperacao() {
		return operacao;
	}

	public static double getValor() {
		return valor;
	}
}

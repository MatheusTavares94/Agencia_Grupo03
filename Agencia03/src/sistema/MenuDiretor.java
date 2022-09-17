package sistema;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import pessoal.Pessoa;
import servicos.Conta;

public class MenuDiretor extends Menu {

	public static void menu(Pessoa usuario, Conta conta, Map<String, Conta> mc, Map<String, Pessoa> mp) {
	}

	static int contador = 0;
	static Scanner scan = new Scanner(System.in);
	static int operacao;
	static double valor;

	public static void menuRelatorios(Pessoa usuario, Conta conta, Map<String, Conta> mc, Map<String, Pessoa> mp)
			throws IOException {
		int opcao;

		do {
			System.out.println("");
			System.out.println("====================================");
			System.out.println(" 1 - Mostrar Saldo");
			System.out.println(" 2 - Relatório da Conta Corrente");
			System.out.println(" 3 - Simulação de Rendimento da Conta Poupança");
			System.out.println(" 4 - Relatório de Clientes");
			System.out.println(" 5 - Voltar ao menu anterior");
			System.out.println(" 6 - Finalizar");
			System.out.println("========Digite a opção escolhida=======");
			opcao = scan.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Seu saldo é de R$" + conta.getSaldo());
				break;

			case 2: // relatorioCC();
				break;

			case 3:
				simulaRendimento();
				break;

			case 4:
				infoCliente(mp);
				break;

			case 5:
				menu(usuario, conta, mc, mp);
				break;

			case 6:
				System.exit(0);

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

	public static void infoCliente(Map<String, Pessoa> mp) {

		List<Pessoa> contasPessoa = new ArrayList<Pessoa>(mp.values());

		Collections.sort(contasPessoa);
		System.out.println((contasPessoa));
	}

	public static int getOperacao() {
		return operacao;
	}

	public static double getValor() {
		return valor;
	}
}
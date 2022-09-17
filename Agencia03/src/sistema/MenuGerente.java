package sistema;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

import pessoal.Gerente;
import pessoal.Pessoa;
import servicos.Conta;

public class MenuGerente extends Menu {
	static int contador = 0;
	static Scanner scan = new Scanner(System.in);
	static int operacao;
	static double valor;

	public static void menuRelatorios(Pessoa usuario, Conta conta, Map<String, Conta> mc) throws IOException {
		int opcao;

		do {
			System.out.println("");
			System.out.println("====================================");
			System.out.println(" 1 - Mostrar Saldo");
			System.out.println(" 2 - Relatório da Conta Corrente");
			System.out.println(" 3 - Simulação de Rendimento da Conta Poupança");
			System.out.println(" 4 - Relatório da Agência");
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
				System.out.println("Há um total de " + usuariosAgencia((Gerente) usuario)
						+ " contas cadastradas na mesma agência");
				break;

			case 5:
				menu(usuario, conta, mc);
				break;

			case 6:
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

	public static int usuariosAgencia(Pessoa usuario) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(".\\arquivos\\" + "Clientes.txt"));
		int contasAg = 0;
		String linha = "";

		while (true) {
			linha = br.readLine();

			if (linha != null) {
				String[] s = linha.split(";");
				if (usuario.getCargo().equals(s[0])) {
					contasAg++;
				}
			} else
				break;
		}
		br.close();
		return contasAg;
	}

	public static int getOperacao() {
		return operacao;
	}

	public static double getValor() {
		return valor;
	}

}
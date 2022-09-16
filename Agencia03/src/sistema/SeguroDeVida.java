package sistema;

import java.util.Scanner;

public class SeguroDeVida {

	double saldo;

	public void seguroDeVida(double valor) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira o valor a ser segurado:");
		double valorSeguro = scan.nextDouble();

		double valorDebitado = valorSeguro * 0.2;
		double saldoAtual = this.saldo - valorDebitado;
		this.saldo = saldoAtual;

		System.out.println("O valor debitado para contratação do Seguro de Vida é de R$" + valorDebitado + ".");
		System.out.println("Seguro de Vida contratado!\nSeu saldo atual é de R$" + saldoAtual + ".");
	}
}

//i. Criar uma classe seguro de vida que possa ser contratado pelo cliente
//onde o mesmo informa o valor que será segurado. No ato da contratação
//será debitado 20% do valor contratado como tributo do seguro;
//ii. Incluir no relatório de tributação o valor referente ao seguro de vida, caso
//este cliente possua estas informações.******************
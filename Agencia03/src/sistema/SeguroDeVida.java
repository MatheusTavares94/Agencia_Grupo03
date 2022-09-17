package sistema;

import java.util.Scanner;

public class SeguroDeVida {

	double saldo;

	public void contratarSeguro(double valor) {
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
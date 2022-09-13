package servicos;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(String cpfTitular, double saldo, String idAgencia, String tipo) {
		super(cpfTitular, saldo, idAgencia, tipo);
	}
	public ContaPoupanca() {
		super();
	}
}

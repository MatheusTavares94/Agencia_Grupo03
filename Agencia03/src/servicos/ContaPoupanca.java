package servicos;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(String cpfTitular, double saldo, String idAgencia, String tipo) {
		super(cpfTitular, saldo, idAgencia, tipo);
		this.setTipo("POUPANCA");
	}
	public ContaPoupanca() {
		super();
		this.setTipo("POUPANCA");
	}
}

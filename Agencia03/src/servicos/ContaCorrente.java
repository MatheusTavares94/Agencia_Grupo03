package servicos;

public class ContaCorrente extends Conta{

	public ContaCorrente(String cpfTitular, double saldo, String idAgencia, String tipo) {
		super(cpfTitular, saldo, idAgencia,tipo);
		this.setTipo("CONTACORRENTE");
	}
	public ContaCorrente() {
		super();
		this.setTipo("CONTACORRENTE");
	}
}
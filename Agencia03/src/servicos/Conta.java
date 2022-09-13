package servicos;

public abstract class Conta {
	private String cpfTitular;
	private double saldo;
	private String idAgencia;
	private String tipo;
	
	public Conta(String cpfTitular, double saldo, String idAgencia, String tipo) {
		this.cpfTitular = cpfTitular;
		this.saldo = saldo;
		this.idAgencia =  idAgencia;
		this.tipo = tipo;
	}
	public Conta() {		
	}
	
	public String getCpfTitular() {
		return cpfTitular;
	}
	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getIdAgencia() {
		return idAgencia;
	}
	public void setIdAgencia(String idAgencia) {
		this.idAgencia = idAgencia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public boolean sacar(double valor) {
		if (this.saldo < valor + 0.10) {
			return false;
		} else {
			double novoSaldo = this.saldo - valor - 0.10;
			this.saldo = novoSaldo;
			return true;
		}
	}
	
	public void depositar(double deposito) {
		this.saldo = this.saldo + deposito - 0.10;
	}
	
	public void transferir(Conta destino, double valor) {
	
		if (valor<=0) {
			System.out.println("Valor inválido!\n");
		}
		
		else if (this.saldo >= valor + 0.20) {
			this.saldo = this.saldo - valor-0.20;
			destino.saldo = destino.saldo + valor;
			System.out.println("Transferência realizado com sucesso!\n");
		} else {
			System.out.println("Não há saldo suficiente para transferência\n");
		}
	}
}

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
	
	
}

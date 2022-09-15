package pessoal;

public class Gerente extends Funcionario {
	private String idAgencia;
	
	public Gerente() {
		super();
		this.setCargo("GERENTE");
	}
	public Gerente(String cargo, String nome, String cpf, String senha, String idAgencia) {
		super(cargo, nome, cpf, senha, idAgencia);
		this.idAgencia = idAgencia;
		this.setCargo("GERENTE");
	}
	public String getIdAgencia() {
		return idAgencia;
	}
	public void setIdAgencia(String idAgencia) {
		this.idAgencia = idAgencia;
	}	

}

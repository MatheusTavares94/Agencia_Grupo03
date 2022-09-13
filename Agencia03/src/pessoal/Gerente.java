package pessoal;

public class Gerente extends Funcionario {
	private String idAgencia;
	
	public Gerente(String cargo) {
		super();
		this.setCargo("GERENTE");
	}
	public Gerente(String nome, String cpf, String senha, String cargo, String idAgencia) {
		super(nome, cpf, senha,cargo);
		this.idAgencia = idAgencia;
		this.setCargo("GERENTE");
	}

}

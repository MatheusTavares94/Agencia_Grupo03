package pessoal;

public class Gerente extends Funcionario {
	
	public Gerente(String cargo) {
		super();
		this.setCargo("GERENTE");
	}
	public Gerente(String nome, String cpf, String senha, String cargo, String idAgencia) {
		super(nome, cpf, senha,cargo, idAgencia);
		this.setCargo("GERENTE");
	}
	

}

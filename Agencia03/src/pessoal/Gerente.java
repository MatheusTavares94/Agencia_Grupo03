package pessoal;

public class Gerente extends Funcionario {

	public Gerente(String cargo) {
		super();
		this.setCargo("Gerente");
	}
	public Gerente(String nome, String cpf, String senha) {
		super(nome, cpf, senha);
		this.setCargo("Gerente");
	}

}

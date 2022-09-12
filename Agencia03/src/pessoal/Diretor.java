package pessoal;

public class Diretor extends Funcionario {

	public Diretor() {
		super();
		this.setCargo("Diretor");
	}
	public Diretor(String nome, String cpf, String senha) {
		super(nome, cpf, senha);
		this.setCargo("Diretor");
	}
}

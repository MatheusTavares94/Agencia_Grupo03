package pessoal;

public class Diretor extends Funcionario {

	public Diretor() {
		super();
		this.setCargo("DIRETOR");
	}
	public Diretor(String nome, String cpf, String senha, String cargo, String idAgencia) {
		super(nome, cpf, senha, cargo, idAgencia);
		this.setCargo("DIRETOR");
	}
}

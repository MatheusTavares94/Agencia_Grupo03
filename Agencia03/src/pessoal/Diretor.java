package pessoal;

public class Diretor extends Funcionario {

	public Diretor() {
		super();
		this.setCargo("DIRETOR");
	}
	public Diretor(String cargo, String nome, String cpf, String senha, String idAgencia) {
		super(cargo, nome, cpf, senha, idAgencia);
		this.setCargo("DIRETOR");
	}
}

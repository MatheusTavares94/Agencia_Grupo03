package pessoal;

public class Presidente extends Funcionario {

	public Presidente() {
		super();
		this.setCargo("PRESIDENTE");
	}	
	public Presidente(String nome, String cpf, String senha, String cargo, String idAgencia) {
		super(nome, cpf, senha, cargo, idAgencia);
		this.setCargo("PRESIDENTE");
	}
}

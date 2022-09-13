package pessoal;

public class Presidente extends Funcionario {

	public Presidente() {
		super();
		this.setCargo("PRESIDENTE");
	}	
	public Presidente(String nome, String cpf, String senha, String cargo) {
		super(nome, cpf, senha, cargo);
		this.setCargo("PRESIDENTE");
	}
}

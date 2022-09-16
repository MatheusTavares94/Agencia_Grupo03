package pessoal;

public class Presidente extends Funcionario {

	public Presidente() {
		super();
		this.setCargo("PRESIDENTE");
	}	
	public Presidente(String cargo, String nome, String cpf, String senha, String idAgencia) {
		super(cargo, nome, cpf, senha, idAgencia);
		this.setCargo("PRESIDENTE");
	}
	
}

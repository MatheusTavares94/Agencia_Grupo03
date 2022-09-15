package pessoal;

public class Gerente extends Funcionario {
	
	public Gerente() {
		super();
		this.setCargo("GERENTE");
	}
	public Gerente(String cargo, String nome, String cpf, String senha, String idAgencia) {
		super(cargo, nome, cpf, senha, idAgencia);
		this.setCargo("GERENTE");
	}
	

}

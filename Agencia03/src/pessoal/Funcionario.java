package pessoal;

public abstract class Funcionario extends Pessoa {
	

	public Funcionario() {
		super();		
	}

	public Funcionario(String cargo, String nome, String cpf, String senha, String idAgencia) {
		super(cargo, nome, cpf, senha, idAgencia);
	}	
	

	@Override
	public String toString() {
		return "Nome: " + getNome()+ "\nCPF: "
				+ getCpf()+"\nCargo: " + getCargo();
	}	
}
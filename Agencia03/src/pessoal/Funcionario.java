package pessoal;

public abstract class Funcionario extends Pessoa {
	

	public Funcionario() {
		super();		
	}

	public Funcionario(String nome, String cpf, String senha, String cargo, String idAgencia) {
		super(nome, cpf, senha, cargo, idAgencia);		
	}	
	

	@Override
	public String toString() {
		return "Nome: " + getNome()+ "\nCPF: "
				+ getCpf()+"\nCargo: " + getCargo();
	}	

}

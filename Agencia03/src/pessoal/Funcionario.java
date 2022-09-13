package pessoal;

public abstract class Funcionario extends Individuo {
	

	public Funcionario() {
		super();		
	}

	public Funcionario(String nome, String cpf, String senha, String cargo) {
		super(nome, cpf, senha, cargo);		
	}	
	

	@Override
	public String toString() {
		return "Nome: " + getNome()+ "\nCPF: "
				+ getCpf()+"\nCargo: " + getCargo();
	}	

}

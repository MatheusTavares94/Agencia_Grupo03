package pessoal;

public abstract class Funcionario extends Individuo {
	private String cargo;

	public Funcionario() {
		super();
		
	}

	public Funcionario(String nome, String cpf, String senha) {
		super(nome, cpf, senha);
		
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Nome: " + getNome()+ "\nCPF: "
				+ getCpf()+"\nCargo: " + getCargo();
	}
		
	

}

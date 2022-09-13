package pessoal;

public class Cliente extends Individuo {
	
	public Cliente() {
		super();
	}
	public Cliente(String nome, String cpf, String senha) {
		super(nome, cpf, senha, senha);
		this.setCargo("CLIENTE");		
	}
}		

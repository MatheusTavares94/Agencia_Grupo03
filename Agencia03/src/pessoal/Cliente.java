package pessoal;

public class Cliente extends Pessoa {
	
	public Cliente() {
		super();
		this.setCargo("CLIENTE");	
	}
	public Cliente(String nome, String cpf, String senha) {
		super(nome, cpf, senha, senha);
		this.setCargo("CLIENTE");		
	}
}		

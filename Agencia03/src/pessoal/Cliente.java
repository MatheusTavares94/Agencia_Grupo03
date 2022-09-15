package pessoal;

public class Cliente extends Pessoa {
	
	public Cliente() {
		super();
		this.setCargo("CLIENTE");	
	}
	public Cliente(String nome, String cpf, String senha, String cargo, String idAgencia) {
		super(nome, cpf, senha, cargo, idAgencia);
		this.setCargo("CLIENTE");		
	}
}
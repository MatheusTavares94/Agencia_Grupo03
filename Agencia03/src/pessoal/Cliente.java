package pessoal;

public class Cliente extends Pessoa {
	
	public Cliente() {
		super();
		this.setCargo("CLIENTE");	
	}
	public Cliente(String cargo, String nome, String cpf, String senha, String idAgencia) {
		super(cargo, nome, cpf, senha, idAgencia);
		this.setCargo("CLIENTE");		
	}
}
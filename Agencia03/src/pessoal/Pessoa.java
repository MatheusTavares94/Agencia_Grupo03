package pessoal;

public abstract class Pessoa {
	private String nome;
	private String cpf;
	private String senha;
	private String cargo;
	private String idAgencia;

	public Pessoa() {
		super();
	}

	public Pessoa(String cargo, String nome, String cpf, String senha, String idAgencia) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.cargo = cargo;
		this.idAgencia = idAgencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getIdAgencia() {
		return idAgencia;
	}
	public void setIdAgencia(String idAgencia) {
		this.idAgencia = idAgencia;
	}	

}

package sistema;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import enums.PessoasEnum;
import pessoal.Cliente;
import pessoal.Diretor;
import pessoal.Gerente;
import pessoal.Pessoa;
import pessoal.Presidente;

public class MapeamentoPessoas {
	static Map<String, Pessoa> mapa = new HashMap<>();

	public static void Ler(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		while ((linha = buffRead.readLine()) != null) {

			usuarioLogado(linha);
		}
		buffRead.close();

	}

	public static void usuarioLogado(String UsuarioLogado) {

		String s[] = UsuarioLogado.split(",");

		String cargo = s[0];
		String nome = s[1];
		String CPF = s[2];
		String SENHA = s[3];
		String idAgencia = s[4];

		if (cargo.equalsIgnoreCase(PessoasEnum.CLIENTE.name())) {
			Pessoa cliente = new Cliente(cargo, nome, CPF, SENHA, idAgencia);
			mapa.put(CPF, cliente);
		} else if (cargo.equalsIgnoreCase(PessoasEnum.GERENTE.name())) {
			Pessoa gerente = new Gerente(cargo, nome, CPF, SENHA, idAgencia);
			mapa.put(CPF, gerente);
		} else if (cargo.equalsIgnoreCase(PessoasEnum.DIRETOR.name())) {
			Pessoa diretor = new Diretor(cargo, nome, CPF, SENHA, idAgencia);
			mapa.put(CPF, diretor);
		} else if (cargo.equalsIgnoreCase(PessoasEnum.PRESIDENTE.name())) {
			Pessoa presidente = new Presidente(cargo, nome, CPF, SENHA, idAgencia);
			mapa.put(CPF, presidente);

		}
	}
}
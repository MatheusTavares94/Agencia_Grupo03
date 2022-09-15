package sistema;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import Enums.pessoasEnum;
import pessoal.Cliente;
import pessoal.Diretor;
import pessoal.Gerente;
import pessoal.Pessoa;
import pessoal.Presidente;

public class Autenticar {
	public static Pessoa Ler(String path, String cpf, String senha) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String UsuarioLogado = "Senha ou CPF incorreto";
		String linha = "";
		while ((linha = buffRead.readLine()) != null) {
			if ((linha.contains(cpf)) && (linha.contains(senha))) {
				UsuarioLogado = linha;
				break;
			} else
				UsuarioLogado = "Senha ou CPF incorreto";
		}

		buffRead.close();

		if (UsuarioLogado.equals("Senha ou CPF incorreto")) {
			System.out.println("Senha ou CPF incorreto\n\nDeseja continuar? Digite \"s\" para sim ou \"n\" para não\n");
			Scanner scan = new Scanner(System.in);
			String resposta = scan.next();
			if (resposta.equals("n") || resposta.equals("N")) {
				System.exit(1);
			} else {
				SistemaInterno.Input();
			}
			return null;

		} else {
			String Name[] = UsuarioLogado.split(",");
			String name = Name[1];
			System.out.println("Olá, \n" + name + "!");
			return usuarioLogado(UsuarioLogado);
		}
	}

	public static Pessoa usuarioLogado(String UsuarioLogado) {
		String s[] = UsuarioLogado.split(",");

		String cargo = s[0];
		String nome = s[1];
		String CPF = s[2];
		String SENHA = s[3];
		String idAgencia = s[4];

		if (cargo.equalsIgnoreCase(pessoasEnum.CLIENTE.name())) {
			Pessoa cliente = new Cliente(cargo, nome, CPF, SENHA, idAgencia);
			return cliente;
		} else if (cargo.equalsIgnoreCase(pessoasEnum.GERENTE.name())) {
			Pessoa gerente = new Gerente(cargo, nome, CPF, SENHA, idAgencia);
			return gerente;
		} else if (cargo.equalsIgnoreCase(pessoasEnum.DIRETOR.name())) {
			Pessoa diretor = new Diretor(cargo, nome, CPF, SENHA, idAgencia);
			return diretor;
		} else if (cargo.equalsIgnoreCase(pessoasEnum.PRESIDENTE.name())) {
			Pessoa presidente = new Presidente(cargo, nome, CPF, SENHA, idAgencia);
			return presidente;
		} else {
			return null;
		}

	}
}
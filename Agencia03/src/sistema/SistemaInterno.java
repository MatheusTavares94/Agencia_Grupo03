package sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Enums.pessoasEnum;
import pessoal.Cliente;
import pessoal.Diretor;
import pessoal.Gerente;
import pessoal.Pessoa;
import pessoal.Presidente;

public class SistemaInterno {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("	         _._._                       _._._\r\n"
+ "	        _|   |_                     _|   |_\r\n"
+ "	        | ... |_._._._._._._._._._._| ... |\r\n"
+ "	        | ||| |     o BATBANK o     | ||| |\r\n"
+ "	        | \"\"\" |  \"\"\"    \"\"\"    \"\"\"  | \"\"\" |\r\n"
+ "	   ())  |[-|-]| [-|-]  [-|-]  [-|-] |[-|-]|  ())\r\n"
+ "	  (())) |     |---------------------|     | (()))\r\n"
+ "	 (())())| \"\"\" |  \"\"\"    \"\"\"    \"\"\"  | \"\"\" |(())())\r\n"
+ "	 (()))()|[-|-]|  :::   .-\"-.   :::  |[-|-]|(()))()\r\n"
+ "	 ()))(()|     | |~|~|  |_|_|  |~|~| |     |()))(()\r\n"
+ "	    ||  |_____|_|_|_|__|_|_|__|_|_|_|_____|  ||\r\n"
+ "	 ~ ~^^ @@@@@@@@@@@@@@/=======\\@@@@@@@@@@@@@@ ^^~ ~\r\n"
+ "	      ^~^~                                ~^~^");
		System.out.println("========================Seja bem vindo(a)========================");
		System.out.println("=================================================================");
		System.out.println("========================Login no Sistema:========================");
		System.out.println("\nInforme seu CPF ");
		String cpf = scan.next();
		System.out.println("Senha: ");
		String senha = scan.next();

		List<Pessoa> cadastro = new ArrayList<Pessoa>();
		cadastro.add(new Cliente("Dorival", "1234", "1234","0001"));
		cadastro.add(new Cliente("Arrascaeta de Souza", "1235", "1235","0002"));
		cadastro.add(new Presidente("Roniejo", "2000", "2001", "PRESIDENTE","0001"));
		cadastro.add(new Gerente("Gabriel Henrique", "3000", "3001", "GERENTE", "0001"));
		cadastro.add(new Diretor("Vinicius Barbosa", "4000", "4001", "DIRETOR","0002"));

		Pessoa usuarioLogado = null;
		for (Pessoa pessoa : cadastro) {
			if (pessoa.getCpf().equals(cpf) && pessoa.getSenha().equals(senha)) {
				usuarioLogado = pessoa;
				break;
			}
		}
		if (usuarioLogado == null) {
			System.out.println("cpf ou senha invalidos.");
		} else {
			System.out.println("Login efetuado com sucesso!");
			if (usuarioLogado.getCargo().equalsIgnoreCase(pessoasEnum.CLIENTE.name())) {
				MenuCliente menuCliente = new MenuCliente();
				menuCliente.menuCliente();

			} else if (usuarioLogado.getCargo().equalsIgnoreCase(pessoasEnum.PRESIDENTE.name())) {
				System.out.println("É um presidente");

			} else if (usuarioLogado.getCargo().equalsIgnoreCase(pessoasEnum.GERENTE.name())) {
//				MenuGerente menuGerente = new MenuGerente();
//				menuGerente.menuGerente();

			} else if (usuarioLogado.getCargo().equalsIgnoreCase(pessoasEnum.DIRETOR.name())) {
				MenuDiretor menuDiretor = new MenuDiretor();
				menuDiretor.menuDiretor();
			}
		}
	}
}

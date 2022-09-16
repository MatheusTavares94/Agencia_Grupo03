package sistema;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

import Enums.pessoasEnum;
import pessoal.Pessoa;
import servicos.Conta;

public class SistemaInterno {

	public static void main(String[] args) throws IOException {

		System.out.println(
				"	         _._._                       _._._\r\n" + "	        _|   |_                     _|   |_\r\n"
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

		String Cpf = Inputcpf();
		String Senha = Inputsenha();
		
		Mapeamento
				.Ler("C:\\Users\\Matheus\\Documents\\Trabalho POO\\Agencia_Grupo03\\Agencia03\\src\\file\\PESSOAS.txt");
		Map<String, Pessoa> mp = Mapeamento.mapa;
		MapeamentoContas
				.Ler("C:\\Users\\Matheus\\Documents\\Trabalho POO\\Agencia_Grupo03\\Agencia03\\src\\file\\CONTAS.txt");
		Map<String, Conta> mc = MapeamentoContas.mapa;
		String resposta;
		do {
			if (Mapeamento.mapa.containsKey(Cpf) && Mapeamento.mapa.get(Cpf).getSenha().equals(Senha)) {
				System.out.println("Olá, " + Mapeamento.mapa.get(Cpf).getNome());
				resposta = "n";
				Pessoa usuario = Mapeamento.mapa.get(Cpf);
				Conta contaUsuario = MapeamentoContas.mapa.get(Cpf);
				if (usuario.getCargo().equalsIgnoreCase(pessoasEnum.CLIENTE.name())) {
					MenuCliente menuCliente = new MenuCliente();
					menuCliente.menuCliente();

				} else if (usuario.getCargo().equalsIgnoreCase(pessoasEnum.PRESIDENTE.name())) {
					MenuPresidente menuPresidente = new MenuPresidente();
					menuPresidente.menuPresidente();

				} else if (usuario.getCargo().equalsIgnoreCase(pessoasEnum.GERENTE.name())) {
					MenuGerente menuGerente = new MenuGerente();
					menuGerente.menuGerente();

				} else if (usuario.getCargo().equalsIgnoreCase(pessoasEnum.DIRETOR.name())) {
					MenuDiretor menuDiretor = new MenuDiretor();
					menuDiretor.menuDiretor();
				}
			} else
				System.out.println(
						"Senha ou CPF incorreto!\n\nDeseja tentar novamente? Digite \"s\" para sim ou \"n\" para encerrar\n");
			Scanner scan = new Scanner(System.in);
			resposta = scan.next();
			if (resposta.equals("n") || resposta.equals("N")) {
				System.exit(1);
			} else {
				Inputcpf();
				Inputsenha();
			}
		} while (resposta.equals("s") || resposta.equals("S"));
		System.out.println("teste");
	}

	public static String Inputcpf() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nInforme seu CPF \n");
		String cpf = scan.next();
		return cpf;
	}

	public static String Inputsenha() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Senha: \n");
		String senha = scan.next();
		return senha;
	}
}
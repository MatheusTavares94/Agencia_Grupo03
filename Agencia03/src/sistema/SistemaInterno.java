package sistema;

import java.io.IOException;
import java.util.Map;

import enums.PessoasEnum;
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

		MapeamentoPessoas
				.Ler("C:\\Users\\Matheus\\Documents\\Trabalho POO\\Agencia_Grupo03\\Agencia03\\src\\file\\PESSOAS.txt");
		MapeamentoContas.Ler("C:\\Users\\Matheus\\Documents\\Trabalho POO\\Agencia_Grupo03\\Agencia03\\src\\file\\CONTAS.txt");
		Map<String, Pessoa> mp = MapeamentoPessoas.mapa;
		Map<String, Conta> mc = MapeamentoContas.mapa;
		
		Autenticar.autenticar();
		
		if (Autenticar.getUsuario().getCargo().equals(PessoasEnum.CLIENTE.name())) {
			MenuCliente.menuCliente(Autenticar.getUsuario(), Autenticar.getConta(), mc);
		}
		else if (Autenticar.getUsuario().getCargo().equals(PessoasEnum.GERENTE.name())) {
			MenuGerente.menuGerente(Autenticar.getUsuario(), Autenticar.getConta(), mc);
		}
		else if (Autenticar.getUsuario().getCargo().equals(PessoasEnum.DIRETOR.name())) {
			MenuDiretor.menuDiretor(Autenticar.getUsuario(), Autenticar.getConta(), mc);
		}
		else if (Autenticar.getUsuario().getCargo().equals(PessoasEnum.PRESIDENTE.name())) {
			MenuPresidente.menuPresidente(Autenticar.getUsuario(), Autenticar.getConta(), mc);
		}
		
		Relatorio.Escrever(".\\src\\RELATORIO.txt");
		
	}

}
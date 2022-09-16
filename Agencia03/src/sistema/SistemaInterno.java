package sistema;

import java.io.IOException;
import java.util.Map;

import enums.pessoasEnum;
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

		MapeamentoPessoas.Ler("C:\\Serratec\\Trabalho POO\\Agencia_Grupo03\\Agencia03\\src\\file\\PESSOAS.txt");
		MapeamentoContas.Ler("C:\\Serratec\\Trabalho POO\\Agencia_Grupo03\\Agencia03\\src\\file\\CONTAS.txt");
		Map<String, Pessoa> mp = MapeamentoPessoas.mapa;
		Map<String, Conta> mc = MapeamentoContas.mapa;
		
		Autenticar.autenticar();
		System.out.println(mc);
		
		if (Autenticar.getUsuario().getCargo().equals(pessoasEnum.CLIENTE.name())) {
			MenuCliente.menuCliente(Autenticar.getUsuario(), Autenticar.getConta(), mc);
		}
		else if (Autenticar.getUsuario().getCargo().equals(pessoasEnum.GERENTE.name())) {
			MenuGerente.menuGerente(Autenticar.getUsuario(), Autenticar.getConta(), mc);
		}
		else if (Autenticar.getUsuario().getCargo().equals(pessoasEnum.DIRETOR.name())) {
			MenuDiretor.menuDiretor(Autenticar.getUsuario(), Autenticar.getConta(), mc);
		}
		else if (Autenticar.getUsuario().getCargo().equals(pessoasEnum.PRESIDENTE.name())) {
			MenuPresidente.menuPresidente(Autenticar.getUsuario(), Autenticar.getConta(), mc);
		}
	}

}
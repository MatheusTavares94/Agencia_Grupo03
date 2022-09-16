package sistema;

import java.io.IOException;

import pessoal.Pessoa;


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

		Autenticar.autenticar();
		System.out.println(Autenticar.getUsuario());
	}

	
}
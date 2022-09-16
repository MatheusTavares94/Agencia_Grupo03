package sistema;

import java.util.Scanner;

import pessoal.Pessoa;

public class Autenticar {
	static Pessoa Usuario;
	
	public static Pessoa getUsuario() {
		return Usuario;
	}
	public static void autenticar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nInforme seu CPF \n");
		String cpf = scan.next();
		System.out.println("Senha: \n");
		String senha = scan.next();
		
		
		String resposta = "s";
		while (!(resposta.equals("n")) || !(resposta.equals("N"))) {
			if (MapeamentoPessoas.mapa.containsKey(cpf) && MapeamentoPessoas.mapa.get(cpf).getSenha().equals(senha)) {
				System.out.println("Olá, " + MapeamentoPessoas.mapa.get(cpf).getNome());
				Usuario = MapeamentoPessoas.mapa.get(cpf);
				break;

			} else {
				System.out.println(
						"Senha ou CPF incorreto!\n\nDeseja tentar novamente? Digite \"s\" para sim ou \"n\" para encerrar\n");
				scan = new Scanner(System.in);
				resposta = scan.next();
				if (resposta.equals("n") || resposta.equals("N")) {
					System.exit(1);
				} else {
					autenticar();
				}
			}
			break;
		}
		
		
	}

}
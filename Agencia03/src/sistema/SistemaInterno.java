package sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pessoal.Cliente;
import pessoal.Pessoa;

public class SistemaInterno {

	public static void main(String[] args, Object ArrayList) {
		Scanner scan = new Scanner(System.in);

		System.out.println("=============Seja bem vindo(a)=============");
		System.out.println("===========================================");
		System.out.println("=============Login no Sistema:=============");
		System.out.println("Informe seu CPF ");
		String cpf = scan.next();
		System.out.print("Senha: ");
		String senha = scan.next();

		List<Pessoa> cadastro = new ArrayList<Pessoa>();
		cadastro.add(new Cliente("Dorival", "1234", "1234"));
		cadastro.add(new Cliente("Arrascaeta de Souza", "1235", "1235"));
		
		for (Pessoa pessoa : cadastro) {
			if (pessoa.getCpf().equals(cpf));{	
				if (pessoa.getSenha().equals(senha)) {
				System.out.println("Login Efetuado com sucesso");
				}
				else {
				System.out.println("Senha ou cpf inválidos");	
				}
				
			}

		}
	}
}
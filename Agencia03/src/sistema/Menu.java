package sistema;
//package Menus;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//import pessoal.Cliente;
//import pessoal.Pessoa;
//
//public class Menu {
//	static Scanner scan = new Scanner(System.in);
//	
//	public static void menuLogin() {
//		String cpf;
//		String senha;
//		
//		System.out.println("	         _._._                       _._._\r\n"
//				+ "	        _|   |_                     _|   |_\r\n"
//				+ "	        | ... |_._._._._._._._._._._| ... |\r\n"
//				+ "	        | ||| |  o NATIONAL BANK o  | ||| |\r\n"
//				+ "	        | \"\"\" |  \"\"\"    \"\"\"    \"\"\"  | \"\"\" |\r\n"
//				+ "	   ())  |[-|-]| [-|-]  [-|-]  [-|-] |[-|-]|  ())\r\n"
//				+ "	  (())) |     |---------------------|     | (()))\r\n"
//				+ "	 (())())| \"\"\" |  \"\"\"    \"\"\"    \"\"\"  | \"\"\" |(())())\r\n"
//				+ "	 (()))()|[-|-]|  :::   .-\"-.   :::  |[-|-]|(()))()\r\n"
//				+ "	 ()))(()|     | |~|~|  |_|_|  |~|~| |     |()))(()\r\n"
//				+ "	    ||  |_____|_|_|_|__|_|_|__|_|_|_|_____|  ||\r\n"
//				+ "	 ~ ~^^ @@@@@@@@@@@@@@/=======\\@@@@@@@@@@@@@@ ^^~ ~\r\n"
//				+ "	      ^~^~                                ~^~^");
//		
//		System.out.println("=============Seja bem vindo(a)=============");
//		System.out.println("===========================================");		
//		System.out.println("=============Login no Sistema:=============");		
//		System.out.println("Informe seu CPF ");
//		cpf = scan.next();
//		System.out.print("Senha: ");
//		senha = scan.next();
//		
//		autenticar(cpf, senha);
//		List<Pessoa> cadastro = new ArrayList<Pessoa>();
//		cadastro.add(new Cliente("Dorival", "1234","1234"));
//		verificarCargo();
//		menuPricipal();
//	}
//
//	private static void autenticar(String cpf, String senha) {
//		if()
//	}
//
//	private static String verificarCargo(Pessoa p) {		
//		return p.getCargo();	
//		
//	}
//
//	public static void menuPricipal() {
//		int opcao;
//		
//		do {
//			System.out.println("");
//			System.out.println("====================================");
//			System.out.println(" 1 - Movimentações e informações da conta.");
//			System.out.println(" 2 - Relátorios.");
//			System.out.println(" 3 - Sair");			
//			System.out.println("========Digite a opção escolhida=======");
//			opcao = scan.nextInt();
//			
//			switch(opcao) {
//			
//			case 1: menuMovimentacoes();
//			break;
//				
//			case 2: menuRelatorios();
//			break;
//			
//			case 3:
//				System.out.println("Saindo...");
//			break;
//			
//			default: 
//				System.out.println("Opção inválida!\nDigite novamente");		
//			}			
//		}while(opcao != 3);
//	}
//	
//	
//	private static void menuMovimentacoes() {
//		int opcao;
//		
//		do {
//			System.out.println("");
//			System.out.println("====================================");
//			System.out.println(" 1 - Saque.");
//			System.out.println(" 2 - Depósito");
//			System.out.println(" 3 - Transferência");
//			System.out.println(" 4 - Voltar ao menu anterior");
//			System.out.println(" 5 - Finalizar");
//			System.out.println("========Digite a opção escolhida=======");
//			opcao = scan.nextInt();
//			
//			switch(opcao) {
//			
//			case 1: //saque();
//			break;
//				
//			case 2: //deposito();
//			break;
//			
//			case 3: //transferencia()				
//			break;
//			
//			case 4: menuPricipal();				
//			break;
//			
//			case 5: System.exit(0);				
//			break;
//			
//			default: 
//				System.out.println("Opção inválida!\nDigite novamente");		
//			}			
//		}while(opcao != 5);
//		
//	}
//	
//	private static void menuRelatorios() {
//		int opcao;
//		
//		do {
//			System.out.println("");
//			System.out.println("====================================");
//			System.out.println(" 1 - Mostrar Saldo");
//			System.out.println(" 2 - Mostrar relatório da Conta Corrente");
//			System.out.println(" 3 - Simulação de rendimento da Conta Poupança");
//			System.out.println(" 4 - Voltar ao menu anterior");
//			System.out.println(" 5 - Finalizar");
//			System.out.println("========Digite a opção escolhida=======");
//			opcao = scan.nextInt();
//			
//			switch(opcao) {
//			
//			case 1: //conta.getSaldo();
//			break;
//				
//			case 2: //Relatorio();
//			break;
//			
//			case 3: simulaRendimento();			
//			break;
//			
//			case 4: menuPricipal();				
//			break;
//			
//			case 5: System.exit(0);				
//			break;
//			
//			default: 
//				System.out.println("Opção inválida!\nDigite novamente");		
//			}			
//		}while(opcao != 5);
//		
//	}
//
//	private static void simulaRendimento() {
//		double valor;
//		int meses;		
//		System.out.println("Insira o valor para a simulação");
//		valor = scan.nextDouble();
//		System.out.println("Insira o tempo em meses que deseja simular");
//		meses = scan.nextInt();		
//		System.out.println("O investimento de R$"+valor+" renderá R$"+(valor*0.005)*meses+ " ao total de "+meses+"meses");
//		
//	}
//		
//}
//		
//

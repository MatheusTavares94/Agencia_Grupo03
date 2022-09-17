package sistema;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Relatorio {
	public static void Escrever(String path) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
//		Scanner in = new Scanner(System.in);
		
		switch (MenuCliente.getOperacao()) {
		case 1:
			buffWrite.append("Operação saque selecionada: \n" + "-" + MenuCliente.getValor() + " reais" + " Tarifa: 0,10 reais\nTotal: " + (MenuCliente.getValor() - 0.10) + " reais\n\n");
			
			break;
			
		case 2:
			buffWrite.append("Operação depósito selecionada: \n" + "+" + MenuCliente.getValor() + " reais" + " - 0,10 reais\nTotal: " + (MenuCliente.getValor() - 0.10) + " reais\n\n");
			
			break;
			
		case 3:
			buffWrite.append("Operação transferência selecionada: \n" + "-" + MenuCliente.getValor() + " reais" + " - 0,10 reais\nTotal: " + (MenuCliente.getValor() - 0.10) + " reais\n\n");
			
			break;

		default:
			break;
		}
		buffWrite.close();
	}

}

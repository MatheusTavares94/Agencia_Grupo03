package sistema;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Relatorio {
	public static void Escrever(String path) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));

		
		switch (Menu.getOperacao()) {
		case 1:
			buffWrite.append("Operação saque selecionada: \n" + "-" + Menu.getValor() + " reais" + " Tarifa: 0,10 reais\nTotal: " + (Menu.getValor() - 0.10) + " reais\n\n");
			buffWrite.close();
			break;
			
		case 2:
			buffWrite.append("Operação depósito selecionada: \n" + "+" + Menu.getValor() + " reais" + " Tarifa: 0,10 reais\nTotal: " + (Menu.getValor() - 0.10) + " reais\n\n");
			buffWrite.close();
			break;
			
		case 3:
			buffWrite.append("Operação transferência selecionada: \n" + "-" + Menu.getValor() + " reais" + " Tarifa 0,20 reais\nTotal: " + (Menu.getValor() - 0.20) + " reais\n\n");
			buffWrite.close();
			break;

		default:
			break;
		}
	}

}

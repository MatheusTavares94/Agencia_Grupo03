package sistema;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import enums.contasEnum;
import servicos.Conta;
import servicos.ContaCorrente;
import servicos.ContaPoupanca;

public class MapeamentoContas {
	
		static Map<String, Conta> mapa = new HashMap<>();

		public static void Ler(String path) throws IOException {
			BufferedReader buffRead = new BufferedReader(new FileReader(path));
			String linha = "";
			while ((linha = buffRead.readLine()) != null) {

				usuarioLogado(linha);
			}
			buffRead.close();

		}

		public static void usuarioLogado(String UsuarioLogado) {

			String s[] = UsuarioLogado.split(",");

			String cpf = s[0];
			double saldo = Double.parseDouble(s[1]);
			String idAgencia = s[2];
			String tipo = s[3];

			if (tipo.equalsIgnoreCase(contasEnum.CORRENTE.name())) {
				Conta cc = new ContaCorrente(cpf, saldo, idAgencia, tipo);
				mapa.put(cpf, cc);
			} else if (tipo.equalsIgnoreCase(contasEnum.POUPANCA.name())) {
				Conta cp = new ContaPoupanca(cpf, saldo, idAgencia ,tipo);
				mapa.put(cpf, cp);
	
		}
	}
}


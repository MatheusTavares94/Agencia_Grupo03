package Mapas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import enums.ContasEnum;
import servicos.Conta;
import servicos.ContaCorrente;
import servicos.ContaPoupanca;

public class MapaContas {
	public void mapaContas() {

		try (BufferedReader ler = new BufferedReader(new FileReader("MapaContas.txt"))) {
			String linha;

			Map<String, Conta> mapa = new HashMap<>();

			while ((linha = ler.readLine()) != null && !(linha.isEmpty())) {

				String[] s = linha.split(",");

				String cpf = s[0];
				double saldo = Double.parseDouble(s[1]);
				String idAgencia = s[2];
				String tipo = s[3];

				if (tipo.equalsIgnoreCase(ContasEnum.CORRENTE.name())) {
					ContaCorrente cc = new ContaCorrente(cpf, saldo, idAgencia, tipo);
					mapa.put(cpf, cc);
				} else if (tipo.equalsIgnoreCase(ContasEnum.POUPANCA.name())) {
					ContaPoupanca cp = new ContaPoupanca(cpf, saldo, idAgencia, tipo);
					mapa.put(cpf, cp);
				}
			}
			ler.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}

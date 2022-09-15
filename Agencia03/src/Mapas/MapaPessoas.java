package Mapas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import Enums.pessoasEnum;
import pessoal.Cliente;
import pessoal.Diretor;
import pessoal.Gerente;
import pessoal.Pessoa;
import pessoal.Presidente;

public class MapaPessoas {
	
	public void mapaPessoas() {
		
		try (BufferedReader ler = new BufferedReader(new FileReader("MapaPessoas.txt"))) {
			String linha;

			Map<String, Pessoa> mapa = new HashMap<>();

			while ((linha = ler.readLine()) != null && !(linha.isEmpty())) {				

				String[] s = linha.split(",");
				
				String cargo = s[0];
				String nome = s[1];
				String cpf = s[2];
				String senha = s[3];			
				String idAgencia = s[4];

				if (cargo.equalsIgnoreCase(pessoasEnum.CLIENTE.name())) {
					Cliente cliente = new Cliente(cargo, nome, cpf, senha, idAgencia);
					mapa.put(cpf, cliente);
					System.out.println(cliente.getNome());
				}
				else if (cargo.equalsIgnoreCase(pessoasEnum.DIRETOR.name())) {
					Diretor diretor = new Diretor(cargo, nome, cpf, senha, idAgencia);
					mapa.put(cpf, diretor);									
				}
				else if (cargo.equalsIgnoreCase(pessoasEnum.GERENTE.name())) {
					Gerente gerente = new Gerente(cargo, nome, cpf, senha, idAgencia);
					mapa.put(cpf, gerente);									
				}
				else if (cargo.equalsIgnoreCase(pessoasEnum.PRESIDENTE.name())) {
					Presidente presidente = new Presidente(cargo, nome, cpf, senha, idAgencia);
					mapa.put(cpf, presidente);
					System.out.println(presidente.getNome()+" cargo "+presidente.getCargo());
					
				}				
			}
			ler.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			
		}
	} 
}

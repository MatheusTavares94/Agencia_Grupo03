package sistema;

import java.io.IOException;
import java.util.Map;

import enums.PessoasEnum;
import pessoal.Pessoa;
import servicos.Conta;

public class SistemaInterno {

	public static void main(String[] args) throws IOException {
		Leitor.leitorBanner(".\\src\\file\\BATBANK.txt");
		MapeamentoPessoas.Ler(".\\src\\file\\PESSOAS.txt");
		MapeamentoContas.Ler(".\\src\\file\\CONTAS.txt");
		Map<String, Pessoa> mp = MapeamentoPessoas.mapa;
		Map<String, Conta> mc = MapeamentoContas.mapa;

		Autenticar.autenticar();

		if (Autenticar.getUsuario().getCargo().equals(PessoasEnum.CLIENTE.name())) {
			MenuCliente.menu(Autenticar.getUsuario(), Autenticar.getConta(), mc);
		} else if (Autenticar.getUsuario().getCargo().equals(PessoasEnum.GERENTE.name())) {
			MenuGerente.menu(Autenticar.getUsuario(), Autenticar.getConta(), mc);
		} else if (Autenticar.getUsuario().getCargo().equals(PessoasEnum.DIRETOR.name())) {
			//MenuDiretor.menu(Autenticar.getUsuario(), Autenticar.getConta(), mc, mp);
		} else if (Autenticar.getUsuario().getCargo().equals(PessoasEnum.PRESIDENTE.name())) {
			MenuPresidente.menu(Autenticar.getUsuario(), Autenticar.getConta(), mc);
		}

	}

}
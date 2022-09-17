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
			MenuCliente.menuCliente(Autenticar.getUsuario(), Autenticar.getConta(), mc);
		} else if (Autenticar.getUsuario().getCargo().equals(PessoasEnum.GERENTE.name())) {
			MenuGerente.menuGerente(Autenticar.getUsuario(), Autenticar.getConta(), mc);
		} else if (Autenticar.getUsuario().getCargo().equals(PessoasEnum.DIRETOR.name())) {
			MenuDiretor.menuDiretor(Autenticar.getUsuario(), Autenticar.getConta(), mc, mp);
		} else if (Autenticar.getUsuario().getCargo().equals(PessoasEnum.PRESIDENTE.name())) {
			MenuPresidente.menuPresidente(Autenticar.getUsuario(), Autenticar.getConta(), mc);
		}

	}

}
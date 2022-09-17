package sistema;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leitor {
	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		while (true) {
			linha = buffRead.readLine();
			if (linha != null) {
				System.out.println(linha);
			} else
				break;
		}
		buffRead.close();
	}

	public static void leitorBanner(String path) throws IOException {
		String linha = "";
		BufferedReader buffRead = new BufferedReader(new FileReader(path));

		while (true) {
			if (linha != null) {
				System.out.println(linha);

			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();
	}

}

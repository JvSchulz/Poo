package persistenciaExercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;

import java.util.List;

import exceptions.ErroNaGravacaoException;
import exceptions.ErroNaLeituraExecption;

public class EditorTexto {

	public void gravaText(String caminho, List<String> dados) {

		Writer arq;

		try {
			arq = new FileWriter(caminho);

			for (String i : dados) {
				arq.write(i+"\n");
			}
			arq.close();
		} catch (IOException e) {
			System.err.println("Erro ao manipular o arquivo");
			System.exit(0);
		}

	}

	public void gravaText(String caminho, String linha) throws ErroNaGravacaoException {

		Writer arq;
		try {
			arq = new FileWriter(caminho, true);
			arq.write(linha + "\n");
			arq.close();

		} catch (IOException e) {

			ErroNaGravacaoException erro = new ErroNaGravacaoException();
			erro.setCaminho(caminho);
			throw erro;

		}
	}

	public List<String> leTexto(String caminho) throws ErroNaLeituraExecption {

		List<String> dados = new ArrayList<String>();

		Reader arq;
		BufferedReader lerArq;

		try {

			arq = new FileReader(caminho);
			lerArq = new BufferedReader(arq);
			String s = lerArq.readLine();

			while (s != null) {
				dados.add(s);
				s = lerArq.readLine();
			}
			arq.close();
		} catch (IOException e) {
			 
			ErroNaLeituraExecption erro =  new ErroNaLeituraExecption();
			erro.setCaminho(caminho);
			throw erro;
			
		}
		return dados;
	}
}

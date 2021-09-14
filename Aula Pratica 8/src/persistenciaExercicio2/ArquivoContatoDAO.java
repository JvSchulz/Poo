package persistenciaExercicio2;
import java.util.LinkedList;
import java.util.List;
import dadosExercicio2.Contato;

public class ArquivoContatoDAO {

	private final String caminho = "E:\\eclise-java\\files\\contatos.csv";
	private static EditorTexto arquivo = new EditorTexto();

	private String toCSV(Contato contato) {

		String c = "";

		c += contato.getNome() + " ,";
		c += contato.getTelefone() + " ,";

		return c;
	}

	private Contato fromCSV(String s) {

		String[] atributos = s.split(" ,");
		Contato contato = new Contato();

		contato.setNome(atributos[0]);
		contato.setTelefone(Integer.parseInt(atributos[1]));

		return contato;
	}

	private List<Contato> stringToListaContato(List<String> arquivo) {

		List<Contato> contatos = new LinkedList<Contato>();

		for (String linha : arquivo) {
			contatos.add(fromCSV(linha));
		}
		return contatos;
	}

	private List<String> listaPessoaToString(List<Contato> contatos) {

		List<String> arquivo = new LinkedList<String>();

		for (Contato contato : contatos) {

			arquivo.add(toCSV(contato));
		}
		return arquivo;
	}

	public List<Contato> leContatos() {
		return stringToListaContato(arquivo.leTexto(caminho));
	}

	public void salvaContatos(List<Contato> contatos) {
		arquivo.gravaText(caminho, listaPessoaToString(contatos));
	}
	public void salvaContatoArquivo(Contato contato) {
		arquivo.gravaText(caminho, toCSV(contato));
	}
}

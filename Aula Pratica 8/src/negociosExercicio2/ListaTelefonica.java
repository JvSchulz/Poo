package negociosExercicio2;
import dadosExercicio2.Contato;
import persistenciaExercicio2.ContatoDAO;

import java.util.List;
import java.util.Map;



public class ListaTelefonica {
	private ContatoDAO contatoDAO =  new ContatoDAO();

	public void adicionaContato(Contato contato) {
		contatoDAO.insert(contato);
	}

	public void removeContato(Contato contato) {
		contatoDAO.delete(contato);
	}

	public List<Contato> buscarContatos(char letra) {
		return contatoDAO.getAll().get(letra);
	}

	public Map<Character, List<Contato>> buscarContatos() {
		return contatoDAO.getAll();
	}
}

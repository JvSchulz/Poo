package persistenciaExercicio2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import dadosExercicio2.Contato;

public class ContatoDAO {

	private ArquivoContatoDAO arquivoContatoDAO = new ArquivoContatoDAO();
	
	public void insert(Contato contato) {
		arquivoContatoDAO.salvaContatoArquivo(contato);
	}
	
	public void delete(Contato contato) {
		List<Contato> contatos = arquivoContatoDAO.leContatos();
		contatos.remove(contato);
		arquivoContatoDAO.salvaContatos(contatos);  
	}
	
	public Map<Character, List<Contato>> getAll(){
		Map<Character, List<Contato>> mapContatos = new HashMap<Character, List<Contato>>();
		
		for(char i = 65; i <91; i++) {
			List<Contato> lista = new LinkedList<Contato>();
			mapContatos.put(i, lista);
		}
		List<Contato> listaContatos =  arquivoContatoDAO.leContatos();
		
		for(Contato c : listaContatos) {
			String nome = c.getNome().toUpperCase();
			List<Contato> contatoTemp = mapContatos.get(nome.charAt(0));
			contatoTemp.add(c);
		}
		return mapContatos;
	}
}

package persistenciaExercicio2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import dados.Contato;
import exceptions.ContatoJaCadastrado;
import exceptions.ContatoNaoCadastradoException;
import exceptions.ErroNaGravacaoException;
import exceptions.ErroNaLeituraExecption;

public class ContatoDAO {

	private ArquivoContatoDAO arquivoContatoDAO = new ArquivoContatoDAO();
	
	public void insert(Contato contato) throws ContatoJaCadastrado, ErroNaLeituraExecption, ErroNaGravacaoException {
		List<Contato> contatos =  arquivoContatoDAO.leContatos();
		if(!contatos.contains(contato)) {
			contatos.add(contato);
			arquivoContatoDAO.salvaContatos(contatos);
		}
		else {
			throw new ContatoJaCadastrado();
		}
	}
	
	public void delete(Contato contato) throws ContatoNaoCadastradoException, ErroNaGravacaoException, ErroNaLeituraExecption {
		
		List<Contato> contatos = arquivoContatoDAO.leContatos();
		if(contatos.contains(contato)) {
			contatos.remove(contato);
			arquivoContatoDAO.salvaContatos(contatos);  
		}
		else {
			throw new ContatoNaoCadastradoException();
		}
		
	}
	
	public Map<Character, List<Contato>> getAll() throws ErroNaLeituraExecption{
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

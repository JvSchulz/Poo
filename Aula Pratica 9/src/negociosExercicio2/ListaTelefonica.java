package negociosExercicio2;
import dados.Contato;
import exceptions.ContatoJaCadastrado;
import exceptions.ContatoNaoCadastradoException;
import exceptions.ErroNaGravacaoException;
import exceptions.ErroNaLeituraExecption;
import persistenciaExercicio2.ContatoDAO;

import java.util.List;
import java.util.Map;



public class ListaTelefonica {
	private ContatoDAO contatoDAO =  new ContatoDAO();

	public void adicionaContato(Contato contato) throws ContatoJaCadastrado, ErroNaLeituraExecption, ErroNaGravacaoException {
		contatoDAO.insert(contato);
	}

	public void removeContato(Contato contato) throws ContatoNaoCadastradoException, ErroNaGravacaoException, ErroNaLeituraExecption {
		contatoDAO.delete(contato);
	}

	public List<Contato> buscarContatos(char letra) throws ErroNaLeituraExecption {
		return contatoDAO.getAll().get(letra);
	}

	public Map<Character, List<Contato>> buscarContatos() throws ErroNaLeituraExecption {
		return contatoDAO.getAll();
	}
}

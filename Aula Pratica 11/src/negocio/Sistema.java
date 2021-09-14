package negocio;

import java.sql.SQLException;
import java.util.List;

import dados.Pessoa;
import exceptions.DeleteException;
import exceptions.InsertException;
import exceptions.SelectException;
import exceptions.UpdateException;
import persistencia.Conexao;
import persistencia.PessoaDAO;

public class Sistema {

	private PessoaDAO pessoaDAO;

	public Sistema(String senha) throws ClassNotFoundException, SQLException, SelectException {

		Conexao.setSenha(senha);
		pessoaDAO = PessoaDAO.getInstance();
	}

	public void inserirPessoa(Pessoa p) throws InsertException, SelectException {
		pessoaDAO.insert(p);
	}

	public List<Pessoa> selectAll() throws SelectException {
		return pessoaDAO.selectAll();
	}

	public void deletePessoa(Pessoa p) throws DeleteException {
		pessoaDAO.delete(p);
	}

	public void atualizarPessoa(Pessoa p) throws UpdateException {
		pessoaDAO.update(p);
	}
}

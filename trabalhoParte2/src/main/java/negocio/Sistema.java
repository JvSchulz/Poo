package negocio;

import java.sql.SQLException;

import java.util.List;
import dados.Atores;
import dados.Filmes;
import exception.InsertException;
import exception.SelectException;
import persistencia.AtoresDAO;
import persistencia.Conexao;
import persistencia.FilmesDAO;

public class Sistema {

	private FilmesDAO filmesDAO;
	private AtoresDAO atoresDAO;

	public Sistema(String senha) throws ClassNotFoundException, SQLException, SelectException {
		Conexao.setSenha(senha);
		filmesDAO = FilmesDAO.getINstance();
		atoresDAO = AtoresDAO.getInstance();
	}

	public void inserirFilmes(Filmes f) throws InsertException, SelectException {
		filmesDAO.insert(f);
	}

	public void inserirAtor(Atores a) throws InsertException, SelectException {
		atoresDAO.insert(a);
	}

	public int selectA() {
		return atoresDAO.select();
	}
	public int selectF() {
		return filmesDAO.select();
	}
	public List<Filmes> selectFilmes() throws SelectException {
		return filmesDAO.selectAll();
	}
	
	public List<Atores> selectAtores() throws SelectException {
		return atoresDAO.selectAll();
	}

}

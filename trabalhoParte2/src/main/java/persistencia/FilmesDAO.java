package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import dados.Filmes;
import exception.InsertException;
import exception.SelectException;

public class FilmesDAO {
	private static FilmesDAO instance = null;
	private PreparedStatement selectNewId;
	private PreparedStatement insert;
	private PreparedStatement selectAll;
	private PreparedStatement select;

	public static FilmesDAO getINstance() throws ClassNotFoundException, SQLException, SelectException {

		if (instance == null) {
			instance = new FilmesDAO();
		}
		return instance;
	}

	private FilmesDAO() throws ClassNotFoundException, SQLException, SelectException {

		Connection conexao = Conexao.getConexao();
		selectNewId = conexao.prepareStatement("select nextval('id_filmes')");
		insert = conexao.prepareStatement("insert into filme values(?,?,?,?,?)");
		selectAll = conexao.prepareStatement("select * from filme");
		select = conexao.prepareStatement("select id from filme ");
	}

	public int select() {
		int i = 0;
		try {
			ResultSet rs = select.executeQuery();
			while (rs.next()) {
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;

	}

	private int selectNewId() throws SelectException {
		try {
			ResultSet rs = selectNewId.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);
			}
		} catch (SQLException e) {
			System.err.println(e);
		}
		return 0;
	}

	public void insert(Filmes filme) throws InsertException, SelectException {
		try {
			insert.setInt(1, selectNewId());
			insert.setString(2, filme.getIdApi());
			insert.setString(3, filme.getTitulo());
			insert.setInt(4, filme.getRank());
			insert.setString(5, filme.getAno());
			insert.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e);
		}
	}

	public List<Filmes> selectAll() throws SelectException {
		List<Filmes> filmes = new LinkedList<Filmes>();
		try {
			ResultSet rs = selectAll.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String idApi = rs.getString(2);
				String titulo = rs.getString(3);
				int rank = rs.getInt(4);
				String ano = rs.getString(5);
				Filmes filme = new Filmes();
				filme.setId(id);
				filme.setIdApi(idApi);
				filme.setTitulo(titulo);
				filme.setRank(rank);
				filme.setAno(ano);
				filmes.add(filme);
			}

		} catch (SQLException e) {
			throw new SelectException("Erro ao buscar filme");
		}
		return filmes;
	}
}

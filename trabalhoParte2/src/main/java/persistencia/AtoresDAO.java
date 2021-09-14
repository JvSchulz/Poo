package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import dados.Atores;
import exception.InsertException;
import exception.SelectException;

public class AtoresDAO {

	private static AtoresDAO instance = null;

	private PreparedStatement selectNewId;
	private PreparedStatement selectAll;
	private PreparedStatement insert;
	private PreparedStatement select;

	public static AtoresDAO getInstance() throws ClassNotFoundException, SQLException, SelectException {

		if (instance == null) {
			instance = new AtoresDAO();
		}
		return instance;
	}

	private AtoresDAO() throws ClassNotFoundException, SQLException, SelectException {

		Connection conexao = Conexao.getConexao();
		selectNewId = conexao.prepareStatement("select nextval('id_atores')");
		insert = conexao.prepareStatement("insert into atores values(?,?,?,?,?,?)");
		selectAll = conexao.prepareStatement("select * from atores");
		select = conexao.prepareStatement("select id from atores ");

	}

	public void insert(Atores ator) throws InsertException, SelectException {

		try {
			insert.setInt(1, SelectNewId());
			insert.setString(2, ator.getIdApi());
			insert.setString(3, ator.getNome());
			insert.setString(4, ator.getDataDeNascimento());
			insert.setString(5, ator.getSexo());
			insert.setString(6, ator.getMiniBiografia());
			insert.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e);
		}
	}

	private int SelectNewId() throws SelectException {

		try {

			ResultSet rs = selectNewId.executeQuery();

			if (rs.next()) {

				return rs.getInt(1);
			}

		} catch (SQLException e) {

			throw new SelectException("Erro ao buscar novo id da tabela atores");
		}

		return 0;
	}

	public int select() {
		int i =0;
		try {
			ResultSet rs = select.executeQuery();
			while(rs.next()) {
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;

	}

	public List<Atores> selectAll() throws SelectException {

		try {
			List<Atores> atores = new LinkedList<Atores>();
			ResultSet rs = selectAll.executeQuery();

			while (rs.next()) {
				String idApi = rs.getString(2);
				String nome = rs.getString(3);
				String dataDeNascimento = rs.getString(4);
				String sexo = rs.getString(5);
				Atores ator = new Atores();
				ator.setIdApi(idApi);
				ator.setNome(nome);
				ator.setDataDeNascimento(dataDeNascimento);
				ator.setSexo(sexo);
				atores.add(ator);
			}
			return atores;
		} catch (SQLException e) {
			throw new SelectException("Erro ao buscar ator");
		}
	}

}

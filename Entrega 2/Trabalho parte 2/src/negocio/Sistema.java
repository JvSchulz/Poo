package negocio;

import java.util.LinkedList;
import java.util.List;

import dados.Atores;

import dados.Filmes;

public class Sistema {
	private List<Filmes> filmesFavoritos = new LinkedList<Filmes>();
	private List<Atores> atoresFavoritos = new LinkedList<Atores>();
	private List<Filmes> filmes = new LinkedList<Filmes>();
	private List<Atores> atores = new LinkedList<Atores>();

	public void salvaFilmeFavorito(Filmes filme) {
		filmesFavoritos.add(filme);

	}

	public void salvaAtorFavorito(Atores ator) {
		atoresFavoritos.add(ator);
	}

	public void cadastraFilme(Filmes filme) {
		filmes.add(filme);
	}

	public void cadastraAtor(Atores ator) {
		atores.add(ator);
	}

	public List<Filmes> buscaFilmes() {
		return filmes;
	}

	public List<Atores> buscaAtores() {
		return atores;
	}
	public List<Filmes> buscaFilmesFavoritos() {
		return filmesFavoritos;
	}

	public List<Atores> buscaAtoresFavoritos() {
		return atoresFavoritos;
	}
}

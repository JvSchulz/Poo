package dados;

import java.util.List;

public class Filmes {

	private long id;
	private String titulo;
	private int rank;
	private String ano;
	private List<Atores> elenco;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public List<Atores> getElenco() {
		return elenco;
	}

	public void setElenco(List<Atores> elenco) {
		this.elenco = elenco;
	}
	@Override
	public boolean equals(Object filme) {
		if (this.titulo == ((Filmes) filme).getTitulo()) {
			return true;
		} else {
			return false;

		}
	}

	public String toString() {
		return "ID- " + id + "\nTitulo - " + titulo + "\nRank - " + rank + "\nAno- " + ano + "\nElenco- " + elenco;
	}

}

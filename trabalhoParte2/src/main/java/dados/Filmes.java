package dados;

import java.net.URL;
import java.util.List;

public class Filmes {

	private int id;
	private String idApi;
	private String titulo;
	private int rank;
	private String ano;
	private List<Atores> elenco;
	private URL url;

	public Filmes() {
	}

	public URL getUrl() {
		return url;
	}

	public void setUrl(URL url) {
		this.url = url;
	}

	public String getIdApi() {
		return idApi;
	}

	public void setIdApi(String idApi) {
		this.idApi = idApi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String toString() {
		return "ID- " + idApi + "\nTitulo - " + titulo + "\nRank - " + rank + "\nAno- " + ano + "\nElenco- " + elenco;
	}

}

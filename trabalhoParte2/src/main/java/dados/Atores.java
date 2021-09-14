package dados;

import java.net.URL;

public class Atores {
	private int id;
	private String idApi;
	private String nome;
	private String dataDeNascimento;
	private String sexo;
	private String miniBiografia;
	private URL url;

	public Atores(int id2, int idApi2, String nome2, String dataDeNascimento2, String sexo2, String miniBiografia2) {

	}

	public Atores() {
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

	public void setIdApi(String idApiAtor) {
		this.idApi = idApiAtor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getMiniBiografia() {
		return miniBiografia;
	}

	public void setMiniBiografia(String miniBiografia) {
		this.miniBiografia = miniBiografia;
	}

	public String toString() {
		return "\nID- " + idApi + "\nNome- " + nome + "\nData de nascimento- " + dataDeNascimento + "\nSexo- " + sexo
				+ "\nMini biografia- " + miniBiografia + "\n";
	}

}

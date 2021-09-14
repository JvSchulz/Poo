package dados;

public class Atores {
	private long id;
	private String nome;
	private String dataDeNascimento;
	private String sexo;
	private String miniBiografia;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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
		return "\nID- " + id + "\nNome- " + nome + "\nData de nascimento- " + dataDeNascimento + "\nSexo- " + sexo
				+ "\nMini biografia- " + miniBiografia + "\n";
	}

}

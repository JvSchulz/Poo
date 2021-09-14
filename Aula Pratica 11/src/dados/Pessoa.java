package dados;

public class Pessoa {
	

	private int id;
	private String nome;
	private long cpf;
	private int telefone;
	private Endereco endereco;

	public Pessoa(int id2, String nome2, long cpf2, int telefone2, Endereco endereco2) {
		// TODO Auto-generated constructor stub
	}

	public Pessoa() {
		// TODO Auto-generated constructor stub
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

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", endereco="
				+ endereco + "]";
	}

}

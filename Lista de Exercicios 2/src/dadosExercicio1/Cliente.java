package dadosExercicio1;

public class Cliente {
	private long cpf;
	private String nome;
	private String enderco;

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnderco() {
		return enderco;
	}

	public void setEnderco(String enderco) {
		this.enderco = enderco;
	}

	public Cliente() {

	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Cliente))
			return false;
		Cliente other = (Cliente) obj;
		if (cpf != other.cpf)
			return false;
		if (enderco == null) {
			if (other.enderco != null)
				return false;
		} else if (!enderco.equals(other.enderco))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", enderco=" + enderco + "]";
	}

}

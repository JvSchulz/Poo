package dadosExercicio1;

public class Loja {
	private String endereco;
	private int idLoja;
	private long telefone;

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdLoja() {
		return idLoja;
	}

	public void setIdLoja(int idLoja) {
		this.idLoja = idLoja;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public Loja() {

	}

	public Loja(String endereco, int idLoja, long telefone) {
		super();
		this.endereco = endereco;
		this.idLoja = idLoja;
		this.telefone = telefone;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Loja))
			return false;
		Loja other = (Loja) obj;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (idLoja != other.idLoja)
			return false;
		if (telefone != other.telefone)
			return false;
		return true;
	}

	public String toString() {
		return "Loja [endereco=" + endereco + ", idLoja=" + idLoja + ", telefone=" + telefone + "]";
	}

}

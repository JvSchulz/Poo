package dadosExercicio1;

public class Patio {
	private String endereco;
	private int numCarros;
	private int capacidadeCarros;

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumCarros() {
		return numCarros;
	}

	public void setNumCarros(int numCarros) {
		this.numCarros = numCarros;
	}

	public int getCapacidadeCarros() {
		return capacidadeCarros;
	}

	public void setCapacidadeCarros(int capacidadeCarros) {
		this.capacidadeCarros = capacidadeCarros;
	}

	public Patio() {

	}

	public Patio(String endereco, int numCarros, int capacidadeCarros) {
		super();
		this.endereco = endereco;
		this.numCarros = numCarros;
		this.capacidadeCarros = capacidadeCarros;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Patio))
			return false;
		Patio other = (Patio) obj;
		if (capacidadeCarros != other.capacidadeCarros)
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (numCarros != other.numCarros)
			return false;
		return true;
	}

	public String toString() {
		return "Patio [endereco=" + endereco + ", numCarros=" + numCarros + ", capacidadeCarros=" + capacidadeCarros
				+ "]";
	}

}

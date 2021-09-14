package dadosExercicio1;

public class Carro {
	private String placa;
	private String modelo;
	private int ano;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Carro() {

	}

	public Carro(String placa, String modelo, int ano) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Carro))
			return false;
		Carro other = (Carro) obj;
		if (ano != other.ano)
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		return true;
	}

	public String toString() {
		return "Carro [placa=" + placa + ", modelo=" + modelo + ", ano=" + ano + "]";
	}

}

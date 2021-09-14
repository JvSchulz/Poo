package dados;

public class Cliente {
	private long cpf;
	private String nome;
	private String endereco;
	private int telefone;

	private Reserva[] reservas = new Reserva[10];
	private int quantReservas = 0;

	public Reserva[] getReservas() {
		return reservas;
	}

	public int getquantReservas() {
		return quantReservas;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public void reservarIda(Reserva reserva) {
		if (quantReservas < reservas.length) {
			reservas[quantReservas] = reserva;
			quantReservas++;
		} else {
			System.out.println("Lista Cheia!");
		}

	}

	public void reservaVolta(Reserva ida, Reserva volta) {
		ida.setVolta(volta);

	}

	public boolean equals(Object o) {
		if (o instanceof Cliente) {
			Cliente c = (Cliente) o;

			if (c.getCpf() == this.getCpf()) {
				return true;
			}
		}
		return false;
	}

	public boolean comparaClientes(Cliente c1, Cliente c2) {
		if (c1.equals(c2)) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + "]";
	}
}

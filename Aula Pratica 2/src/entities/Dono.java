package entities;

public class Dono {
	private String nome;
	private Endereço endereco;
	private int cpf;
	
	public Dono(Endereço endereco) {
		this.endereco = endereco;
		
	}
	public Dono() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereço getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereço endereco) {
		this.endereco = endereco;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String toString() {
		return "Nome: " + this.nome + "\n"
				+"Cpf: "+ this.cpf + "\n"
				+ this.endereco;
	}
}

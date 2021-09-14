package entities;

public class Dono {
	private String nome;
	private Endere�o endereco;
	private int cpf;
	
	public Dono(Endere�o endereco) {
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

	public Endere�o getEndereco() {
		return endereco;
	}

	public void setEndereco(Endere�o endereco) {
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

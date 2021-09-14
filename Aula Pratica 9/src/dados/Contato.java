package dados;

public class Contato {
	private String nome;
	private int telefone;
	
	public Contato(){
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public boolean equals(Object object) {
		Contato c = (Contato) object;
		return c.getTelefone() == this.telefone;
	}
	
	public String toString() {
		return "Contato [nome=" + nome + ", telefone=" + telefone + "]";
	}
	
}

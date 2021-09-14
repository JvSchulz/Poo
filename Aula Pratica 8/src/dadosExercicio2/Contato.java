package dadosExercicio2;

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
	
	public boolean equals(Object o ) {
		Contato c = (Contato) o;
		if(this.telefone == c.getTelefone()) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "Contato [nome=" + nome + ", telefone=" + telefone + "]";
	}
	
}

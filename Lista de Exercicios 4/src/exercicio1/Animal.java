package exercicio1;

public abstract class Animal {
	
	private String nome;
	
	public String getNome() {
		return this.nome;
		}
	
	public void setNome(String nome) {
		this.nome =  nome;
	}
	
	public abstract String emitirSom();
	
}

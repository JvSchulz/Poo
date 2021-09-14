package entities;

public class Veterinarios {

	private String nome;
	private float salario;
	private Endereço endereco;
	private Animal animais[];
	private int quantidadeAnimais;

	public Veterinarios() {

	}

	public Veterinarios(int tamAnimais) {
		animais = new Animal[tamAnimais];
	}

	public void addAnimal(Animal animal) {
		if (quantidadeAnimais < animais.length) {
			animais[quantidadeAnimais] = animal;
			quantidadeAnimais++;

		} else {
			System.out.println("Não foi possivel inserir o animal.");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public Endereço getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereço endereco) {
		this.endereco = endereco;
	}

	public Animal[] getAnimais() {
		return animais;
	}

	public void setAnimais(Animal[] animais) {
		this.animais = animais;
	}

	public int getQuantidadeAnimais() {
		return quantidadeAnimais;
	}

	public void setQuantidadeAnimais(int quantidadeAnimais) {
		this.quantidadeAnimais = quantidadeAnimais;
	}

}
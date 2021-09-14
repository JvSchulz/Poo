package dadosExercicio4;

import java.util.Arrays;

public class Aluno {
	private String nome;
	private int idade;
	private double[] notas;
	private double media;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double getMedia() {
		return media;
	}

	public double calcularMedia() {
		double temp = 0;
		for (int i = 0; i < 5; i++) {
			temp = +this.notas[i];
		}
		this.media = temp/5;
		return this.media;
	}

	
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", notas=" + Arrays.toString(notas) + "]";
	}
	
}

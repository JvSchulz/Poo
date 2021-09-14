package dadosExercicio3;

import java.util.Arrays;

public class Imobiliaria {
	private String nome;
	Imoveis[] imoveis = new Imoveis[5];
	private int numImoveis = 0;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Imoveis[] getImoveis() {
		return imoveis;
	}

	public void setImoveis(Imoveis[] imoveis) {
		this.imoveis = imoveis;
	}

	public int getNumImoveis() {
		return numImoveis;
	}

	public void setNumImoveis(int numImoveis) {
		this.numImoveis = numImoveis;
	}

	public void cadastraImoveis(Imoveis imovel) {
		if (numImoveis < imoveis.length) {
			imoveis[numImoveis] = imovel;
			numImoveis++;
		} else {
			System.out.println("Não foi possivel cadastrar um novo imovel");
		}

	}
	public Imoveis[] filtrarPorArea(float x) {
		for(int i =0; i<imoveis.length;i++) {
			
	
		}
	}

	public String toString() {
		return "Imobiliaria [nome=" + nome + ", imoveis=" + Arrays.toString(imoveis) + ", numImoveis=" + numImoveis
				+ "]";
	}

}

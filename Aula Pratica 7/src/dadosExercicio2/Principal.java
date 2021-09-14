package dadosExercicio2;

import java.util.List;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {

		Gerador gerador;
		List<Integer> resultado;

		// Fibonacci
		gerador = new Fibonacci();
		gerador.gerar(random(10));
		resultado = gerador.getSequencia();
		imprimir("Fibonacci", gerador);

		// Naturais
		gerador = new Naturais();
		gerador.gerar(random(10));
		resultado = gerador.getSequencia();
		imprimir("Naturais", gerador);

		/*
		// Quadrados
		gerador = new Quadrados();
		gerador.gerar(random(50));
		resultado = gerador.getSequencia();
		imprimir("Quadrados", resultado);
*/
		// Primos
		gerador = new Primos();
		gerador.gerar(random(10));
		resultado = gerador.getSequencia();
		imprimir("Primos", gerador);

		// Fatorial
		gerador = new Fatorial();
		gerador.gerar(random(10));
		resultado = gerador.getSequencia();
		imprimir("Fatorial", gerador);
/*
		// Perfeitos
		gerador = new Perfeitos();
		gerador.gerar(random(50));
		resultado = gerador.getSequencia();
		imprimir("Perfeitos", resultado);
		*/
	}

	public static void imprimir(String tipo, Gerador g) {
		List<Integer> seq = g.getSequencia();
		
		if (seq.size() < 1) {
			System.out.print("\n" + tipo + " de " + seq.size() + ": [ ]");
		} 
		else {
			System.out.print("\n" + tipo + " de " + seq.size() + ": [");
			for (int i = 0; i < seq.size() - 1; i++) {
				System.out.print(seq.get(i) + ", ");
			}
			System.out.print(seq.get(seq.size() - 1) + "]");
		}
		System.out.println();
		System.out.println("Numero sorteado: " +g.sortear());
		System.out.println("Somatório: "+g.somatorio());
		System.out.println("Produtório: "+ g.produtorio());
		System.out.println("Média Aritmética: "+ g.mediaAritmetica());
		System.out.println("Média Geometrica: "+ g.mediaGeometrica());
		System.out.println("Variâcia: "+ g.variancia());
		System.out.println("Desvio padrão: "+ g.desvioPadrao());
		System.out.println("Amplitude: " + g.amplitude());
		System.out.println("------------------------------------");
	}
	

	public static int random(int n) {
		Random r = new Random();
		int result = r.nextInt(n);
		while (result == 0) {
			result = r.nextInt(n);
		}
		return result;
	}
}

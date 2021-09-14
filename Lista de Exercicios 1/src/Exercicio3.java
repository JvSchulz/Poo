import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor: ");
		int n = sc.nextInt();
		int[] vet = new int[n];
		Random generator = new Random();
		for (int i = 0; i < vet.length; i++) {
			vet[i] = generator.nextInt(10);
			System.out.println("[" + i + "] = " + vet[i]);
		}
		int maiorAtual = 0;
		buscaMaior(vet, maiorAtual, n);
		sc.close();

	}

	public static int buscaMaior(int vetor[], int maiorAtual, int indice) {
		if (indice == 0) {
			System.out.println("Maior valor: "+maiorAtual);
			return maiorAtual;
		}
		if (maiorAtual < vetor[indice-1])
			maiorAtual = vetor[indice-1];
		return buscaMaior(vetor, maiorAtual, indice - 1);
	}

}

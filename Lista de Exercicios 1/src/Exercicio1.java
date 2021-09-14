import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		int[] vet = new int[4];
		System.out.println("Digite os valores do vetor");
		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
			System.out.println("[" + i + "] = " + vet[i]);
		}

		// Soma dos elementos desse Vetor
		for (int i = 0; i < vet.length; i++) {
			soma = +soma + vet[i];
		}
		System.out.println("Soma dos elementos de vet = " + soma);

		// O menor valor do vetor
		int menor = vet[0];
		for (int i = 0; i < vet.length; i++) {
			if (menor > vet[i]) {
				menor = vet[i];
			}
		}
		System.out.println("Menor valor: " + menor);
		// O maior valor do vetor
		int maior = 0;
		for (int i = 0; i < vet.length; i++) {
			if (maior < vet[i]) {
				maior = vet[i];
			}
		}
		System.out.println("Maior valor: " + maior);
		//A media dos elementos do vetor 
		int media = 0;
		for (int i = 0; i < vet.length; i++) {
			media = +media + vet[i];
		}
		System.out.println("Media dos valores do vetor é = " + media/vet.length);
		//Numero primos
			int primos = 0;
			int somaPrimos = 0;
			for(int i=0;i<vet.length;i++) {
				for(int j=1;j<=vet[i];j++) {
					if(vet[i] % j ==0) {
						primos++;
					}
					
					}
				if(primos==2) {
					System.out.println("Vet["+i+"] = "+vet[i]+" é primo");
					somaPrimos =+ somaPrimos + vet[i];
				}
				primos = 0;
			}
			System.out.println("Valor da soma dos primos é: "+somaPrimos);
			

		sc.close();

	}
}

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palavra;
		System.out.println("Digite uma palavra para ser testada se é um palindromo");
		palavra = sc.nextLine();
		palindromo(palavra);
		if(palindromo(palavra)) {
			System.out.println("É palindromo");
			
		}
		else {
			System.out.println("Não é palindromo");
		}
		sc.close();
	}
	public static boolean palindromo(String palavra) {
		int j = palavra.length() -1;
		int i = 0;
		while(i<j) {
			if(palavra.charAt(i)!=palavra.charAt(j)) {
				return false;
			}
			i++;
			j--;
	}
		return true;
	}
}
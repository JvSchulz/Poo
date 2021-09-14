import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palavra;
		System.out.println("Digite uma palavra para ser testada se � um palindromo");
		palavra = sc.nextLine();
		palindromo(palavra);
		if(palindromo(palavra)) {
			System.out.println("� palindromo");
			
		}
		else {
			System.out.println("N�o � palindromo");
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
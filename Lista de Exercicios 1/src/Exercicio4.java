import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Digite qual operação deve ser executada: 1) resto de dois numeros, 2) potencia de um numero");
		int dif = sc.nextInt();
		if (dif == 1) {
			System.out.println("Digite o numero a ser divido e seu divisor respectivamente");
			float dividendo = sc.nextFloat();
			float divisor = sc.nextFloat();
			resto(dividendo, divisor);
		} else {
			if (dif == 2) {
				System.out.println("Digite o numero base e seu expoente respectivamente: ");
				int base = sc.nextInt();
				int expoente = sc.nextInt();
				expo(base, expoente);
			}
		}
		sc.close();
	}

	public static float resto(float valor1, float valor2) {
		float resto;
		resto = valor1 % valor2;
		System.out.println("Resto da divisão de " + valor1 + " e " + valor2 + " é igual a: " + resto);
		return resto;
	}

	public static int expo(int valorBase, int valorPot) {
		int resultado = 1;
		for (int i = 0; i < valorPot; i++) {
			resultado = resultado * valorBase;
		}
		System.out.println(valorBase+" elevado a "+valorPot+" é igual a: "+resultado);
		return resultado;
	}
}

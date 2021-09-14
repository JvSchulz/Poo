package Exercicio1;

public class Multiplicacao extends Soma {

	public int executar(int valor1, int valor2) {
		int mult = 0;
		while(valor2!=0) {
			mult += valor1;
			valor2--;
		}
		return mult;
	}

}

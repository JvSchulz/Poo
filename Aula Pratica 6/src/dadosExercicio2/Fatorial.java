package dadosExercicio2;

public class Fatorial extends Gerador {

	public void gerar(int n) {
		int f = 0;
		while (n > 1) {
			f = f * (n - 1);
			n--;
			}
		sequencia.add(f);
	}
}

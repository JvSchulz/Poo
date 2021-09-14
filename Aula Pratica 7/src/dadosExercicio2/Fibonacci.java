package dadosExercicio2;

public class Fibonacci extends Gerador {

	public void gerar(int n) {
		for (int i = 0; i < n; i++) {
            sequencia.add(Fibonacci.fibo(i));
        }
		
	}

	static int fibo(int n) {
		if (n < 2) {
			return n;
		} else {
			return  fibo(n - 1) + fibo(n - 2);
		}
	}
}

package dadosExercicio2;

import java.util.List;

public class Fibonacci extends Gerador {

	public List<Integer> gerar(int n) {
		for (int i = 0; i < n; i++) {
            sequencia.add(Fibonacci.fibo(i));
        }
		return sequencia;
		
	}

	static int fibo(int n) {
		if (n < 2) {
			return n;
		} else {
			return  fibo(n - 1) + fibo(n - 2);
		}
	}
}

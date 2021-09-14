package dadosExercicio2;

import java.util.List;

public class Primos extends Gerador {

	public List<Integer> gerar(int n) {
		int quant = 0;
		int num = 2;
		do {
			if (primo(num)) {
				sequencia.add(num);
				quant++;
			}
			num++;
		} while (quant < n);
		return sequencia;
	}

	public boolean primo(int v) {
		for (int i = 2; i < v; i++) {
			if (v % i == 0) {
				return false;
			}
		}
		return true;
	}
}

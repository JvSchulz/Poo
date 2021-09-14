package dados2;

import java.util.List;

public class Naturais extends Gerador {

	public List<Integer> gerar(int n) {
		for (int i = 0; i < n; i++) {
			sequencia.add(i);
		}
		return sequencia;
	}

}

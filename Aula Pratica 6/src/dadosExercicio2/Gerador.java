package dadosExercicio2;

import java.util.LinkedList;
import java.util.List;

public abstract class Gerador {

	protected List<Integer> sequencia = new LinkedList<Integer>();

	public List<Integer> getSequencia() {
		return sequencia;
	}

	public abstract List<Integer> gerar(int n);

}

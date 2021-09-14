package exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import exceptionsExercicio2.PilhaCheiaException;
import exceptionsExercicio2.ProcessoSemJuizException;

public class SistemaProcessos {
	Random r = new Random();
	private int limite = 10;
	private List<Processo> processos = new ArrayList<Processo>(limite);
	private List<Juiz> juizes = new ArrayList<Juiz>(limite);

	public void cadastrarProcesso(Processo processo) {
		processos.add(processo);
	}

	public void cadastrarJuiz(Juiz juiz) {
		juizes.add(juiz);
	}

	public void distribuirProcessos() throws ProcessoSemJuizException, PilhaCheiaException {
		for (Processo processo : processos) {
			int i = r.nextInt(juizes.size() - 1);
			juizes.get(i).cadastrarProcesso(processo);
			if (juizes.get(r.nextInt(i)).getProcessos().getSize() == juizes.get(i).getLimite()) {
				juizes.get(r.nextInt(juizes.size() - 1)).cadastrarProcesso(processo);
			}

		}
	}
}

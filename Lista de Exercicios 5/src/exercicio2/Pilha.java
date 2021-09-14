package exercicio2;

import java.util.ArrayList;
import java.util.List;

import exceptionsExercicio2.PilhaCheiaException;
import exceptionsExercicio2.PilhaVaziaException;

public class Pilha<T> {
	private int limite;
	private List<T> elementos = new ArrayList<T>(limite);

	public Pilha(int limite) {
		this.limite = limite;
	}

	public void inserir(T objeto) throws PilhaCheiaException {
		
		if (elementos.size() < limite) {
			elementos.add(objeto);
		} 
		else {
			throw new PilhaCheiaException();
		}
	}

	public T remover() throws PilhaVaziaException {
		if(elementos.size()>0) {
		int i = elementos.size() - 1;
		return elementos.remove(i);
		}
		else {
			throw new PilhaVaziaException();
		}
	}

	public int getSize() {
		return elementos.size();
	}
}

package exercicio1;

import java.util.LinkedList;
import java.util.List;

public class Vetor<T> {

	private List<T> vetor = new LinkedList<T>();
	private int m;
	private Iterator<T> iteradorColuna = new VetorIteradorColuna < T >(this);

	public Vetor() {
		
		this.vetor = (List<T>) new Object();
	}

	public int getM() {
		return vetor.size();
	}

	public void setM(int m) {
		this.m = m;
	}

	public void set(T elemento) {
		vetor.add(elemento);
	}

	public T get(int i) {
		return vetor.get(i);
	}
	
	public Iterator<T> getIteratorColuna(){
		this.iteradorColuna.reset();
		return this.iteradorColuna;
	}
}

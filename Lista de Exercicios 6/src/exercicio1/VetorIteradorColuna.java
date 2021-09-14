package exercicio1;

public class VetorIteradorColuna<T> implements Iterator<T> {

	private Vetor<T> vetor;
	private int atualI = 0;
	private int i = 0;
	public VetorIteradorColuna(Vetor<T> vetor) {
		this.vetor = vetor;
	}

	public boolean hasNext() {
		return atualI < vetor.getM();
	}

	public T next() {
		i = atualI;
		if(i%2 == 0) {
			atualI++;
			return vetor.get(i);
		}
		atualI ++;
		reset();
		
	}

	public void reset() {
		i = 0;
	}

}

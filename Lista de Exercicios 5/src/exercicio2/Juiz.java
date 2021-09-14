package exercicio2;

import exceptionsExercicio2.PilhaCheiaException;

public class Juiz {

	private String nome;

	private int limite;

	private Pilha<Processo> processos = new Pilha<Processo>(limite);

	public Juiz(int limite) {
		this.limite = limite;
	}

	
	public Pilha<Processo> getProcessos() {
		return processos;
	}


	public int getLimite() {
		return limite;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void cadastrarProcesso(Processo processo) throws PilhaCheiaException {
		if(processos.getSize()<limite) {
		processos.inserir(processo);
	}
		else {
			throw new PilhaCheiaException();
		}
	}
}


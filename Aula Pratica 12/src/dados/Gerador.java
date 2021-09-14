package dados;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public  class Gerador implements ISequencia {
	
	private static Gerador instance = null;

	protected List<Integer> sequencia = new LinkedList<Integer>();

	private Gerador() {
		
	}
	
	public static Gerador getInstance() {
		if(instance == null) {
			instance = new Gerador();
		}
		return instance;
	}
	
	public List<Integer> getSequencia() {
		return this.sequencia;
	}
	
	
	public void setSequencia(List<Integer> sequencia) {
		this.sequencia = sequencia;
	}

	public void adicionarValor(int valor) {
		this.sequencia.add(valor);
	}
	
	public List<Integer> getValores(){
		return sequencia;
	}
	
	public void setValores(List<Integer> valores) {
		this.sequencia =  valores;
	}
	
	public void limparValores() {
		this.sequencia.clear();
	}
	
	public int sortear() {
		Random r = new Random();
		return sequencia.get(r.nextInt(sequencia.size()));
	}

	public long somatorio() {
		long soma = 0;
		for (long num : sequencia) {
			soma += num;
		}
		return soma;
	}

	public long produtorio() {
		long produto = 1;
		for (int num : sequencia) {
			if (num > 0) {
				produto *= num;
			}
		}
		return produto;
	}

	public double mediaGeometrica() {
		double resultado;
		resultado = Math.pow(produtorio(), 1.0 / (double) sequencia.size());
		return resultado;
	}

	public double mediaAritmetica() {
		return somatorio() / (double) sequencia.size();
	}
	
	public double variancia() {
		double media =  mediaAritmetica();
		double soma  = 0;
		for(int num : sequencia) { 
			soma += Math.pow(num - media, 2);
		}
		return soma / (double) sequencia.size() -1;
	}
	
	public double desvioPadrao() {
		return Math.sqrt(variancia());
	}
	
	public int amplitude() {
		return Collections.max(sequencia) -  Collections.min(sequencia);
	}

}

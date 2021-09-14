package Exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static <T> void main(String[] args) {
		
		Random r = new Random();
		List <T> lista =  new ArrayList<T>();
		MOD m =  new MOD();
		MDC mdc= new MDC();
		Soma s = new Soma();
		Multiplicacao mt =  new Multiplicacao();
		lista.add((T) m);
		lista.add((T) mt);
		lista.add((T) mdc);
		lista.add((T) s);
		for( T m1  :  lista) {
			
			
		}
	}

}

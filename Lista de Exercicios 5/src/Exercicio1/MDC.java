package Exercicio1;

public class MDC implements OperacaoInteira{
	

	
	@Override
	public int executar(int valor1, int valor2) {
		int resto;
	    while (valor2 != 0) {
	        resto = valor1 % valor2;
	        valor1 = valor2;
	        valor2 = resto;
	        
	}
		return valor1;
	}
}
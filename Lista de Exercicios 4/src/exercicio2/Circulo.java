package exercicio2;

public class Circulo extends FormaGeometrica{

	public void setRaio(int valor) {
		this.medida1 =  valor;
		this.medida2 = valor*2;
	}
	
	public int calcularArea() {
		
		return (int) (3.14 *Math.pow(medida1, 2));
	}

	
	public int calcularPerimetro() {
		return (int) (3.14 * medida2);
	}

	public String toString() {
		return "\nRaio: "+medida1+" Diametro: "+medida2+" Area: "+calcularArea()+" Perimetro: "+calcularPerimetro();
	}
	
}

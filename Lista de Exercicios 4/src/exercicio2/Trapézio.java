package exercicio2;

public class Trapézio extends FormaGeometrica {

	private int altura;

	public void setBaseMenor(int valor) {
		this.medida1 = valor;
	}

	public void setBaseMaior(int valor) {
		this.medida2 = valor;
	}

	public void setAltura(int valor) {
		this.altura = valor;
	}

	public int calcularArea() {
		
		return ((medida2 - medida1) * altura)/2;
	}

	public int calcularPerimetro() {
		double temp = calcularArea();
		return (int) (4*(Math.sqrt(Math.pow(temp,2))));
	}


	public String toString() {
		return "\nBase maior: "+medida2+" Base menor: "+medida1+" Altura: "+altura+" Area: "+calcularArea()+" Perimetro: "+calcularPerimetro();
	}
}
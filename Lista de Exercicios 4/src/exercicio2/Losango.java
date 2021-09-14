package exercicio2;

public class Losango extends FormaGeometrica{
	
	public void setD(int valor) {
		this.medida1 = valor;
	}
	
	public void setd(int valor) {
		this.medida2 = valor;
	}

	
	public int calcularArea() {
		
		return (medida1*medida2)/2;
	}
	
	public int calcularPerimetro() {
		
		return (int) (4*Math.sqrt(Math.pow(medida1, 2)/4 + Math.pow(medida2, 2)/4));
	}
	public String toString() {
		return "\nDiagonal principal: "+medida1+" Diagonal secundaria: "+medida2+" Area: "+calcularArea()+" Perimetro: "+calcularPerimetro();
	}
}

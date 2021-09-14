package dadosExercicio3;

public class Imoveis {
	private double largura;
	private double comprimento;
	private double valor;

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Imoveis() {

	}

	public double calculaArea(double largura, double comprimento) {
		this.largura = largura;
		this.comprimento = comprimento;
		double area = largura * comprimento;
		System.out.printf("Área: %.2f", area);
		return area;
	}

	public String toString() {
		return "Imoveis [largura=" + largura + ", comprimento=" + comprimento + ", valor=" + valor + "]";
	}

}
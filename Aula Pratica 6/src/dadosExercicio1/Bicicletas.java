package dadosExercicio1;

public class Bicicletas extends Veiculo {

	private int numeroDeMarchas;

	public int getNumeroDeMarchas() {
		return numeroDeMarchas;
	}

	public void setNumeroDeMarchas(int numeroDeMarchas) {
		this.numeroDeMarchas = numeroDeMarchas;
	}

	public String info() {
		return "\nBicicleta: \n" + "Cor: " + this.getCor() + "\n Numero de marchas: " + numeroDeMarchas + "\n";
	}

}

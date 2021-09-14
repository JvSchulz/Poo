package exercicio2;

public enum Quadrante {

	PRIMEIRO("primeiro"), SEGUNDO("segundo"), TERCEIRO("terceiro"), QUARTO("quarto");

	private String quadrante;

	private Quadrante(String quadrante) {
		this.quadrante = quadrante;
	}

	public String getQuadrante() {
		return quadrante;
	}
}

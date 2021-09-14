package dadosExercicio1;

import java.util.Random;
import java.util.Scanner;

public class Fabrica {

	public Veiculo fabricar() {

		Random r = new Random();

		if (r.nextInt(2) == 1) {
			Carro c = new Carro();
			c.setCor(Cor.values()[r.nextInt(Cor.values().length)]);
			c.setNumeroPortas(2 + 2 * r.nextInt(2));
			c.setCombustivel(Combustivel.values()[r.nextInt(Combustivel.values().length)]);

			return c;
		} else {
			Bicicletas b = new Bicicletas();
			b.setCor(Cor.values()[r.nextInt(Cor.values().length)]);
			b.setNumeroDeMarchas(r.nextInt(28));

			return b;
		}
	}

	public static void main(String[] args) {

		int fim = -1;
		Fabrica fabrica = new Fabrica();
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(fabrica.fabricar().info());
			System.out.println("Digite 0 para interromper a produção");
			System.out.println("Digite qualquer numero pra continuar");
			fim = sc.nextInt();
		} while (fim != 0);
		sc.close();
	}
}

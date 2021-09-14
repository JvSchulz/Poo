import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Exercicio1 {

	public static void main(String[] args) {
		Map<Integer, List<Integer>> todasAsTabuadas = new HashMap<Integer, List<Integer>>();
		for (int i = 1; i <= 10; i++) {
			todasAsTabuadas.put(i, tabuada(i));
		}
		todasAsTabuadas.forEach((chave, tabuada) -> {
			System.out.print("Tabuada de " + chave + ": ");
			for (int j : tabuada) {
				System.out.print(j + " ");
			}
			System.out.println();
		});
	}

	public static List<Integer> tabuada(int n) {

		List<Integer> tabuada = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			tabuada.add(i * n);
		}
		return tabuada;
	}

}

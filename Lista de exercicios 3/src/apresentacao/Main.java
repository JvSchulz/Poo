package apresentacao;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import dados.Pessoa;
import negocio.Sistema;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static Sistema sistema = new Sistema();

	private static Pessoa cadastraPessoa() {

		Pessoa p = new Pessoa();
		System.out.println("Digite o nome: ");
		p.setNome(sc.nextLine());
		System.out.println("Digite a idade: ");
		p.setIdade(Integer.parseInt(sc.nextLine()));
		System.out.println("Digite o cpf");
		p.setCpf(Long.parseLong(sc.nextLine()));
		System.out.println("Digite a cidade: ");
		p.setCidade(sc.nextLine());
		return p;

	}

	public static void exibirPessoas() {
		sistema.buscarPessoa().forEach((chave, pessoas) -> {
			for (Pessoa p : pessoas) {
				if(p.getIdade()<13) {
					Collections.sort(pessoas, Comparator.comparing(Pessoa::getNome));
					System.out.println("1 até 12: Crianças;");
					System.out.println("\t" + p);
				}
				else if(p.getIdade()<19) {
					Collections.sort(pessoas, Comparator.comparing(Pessoa::getNome));
					System.out.println("12 até 18: adolescente;");
					System.out.println("\t" + p);
				}
				else if(p.getIdade()<26) {
					Collections.sort(pessoas, Comparator.comparing(Pessoa::getNome));
					System.out.println("19 até 25: Jovens;");
					System.out.println("\t" + p);
				}
				else if(p.getIdade()<60) {
					Collections.sort(pessoas, Comparator.comparing(Pessoa::getNome));
					System.out.println("26 até 59: Adultos;");
					System.out.println("\t" + p);
				}
				else if(p.getIdade()>=60) {
					Collections.sort(pessoas, Comparator.comparing(Pessoa::getNome));
					System.out.println("Acima de 60: Idosos;");
					System.out.println("\t" + p);
				}
				
			}
		});
	}

	public static void main(String[] args) {
		int indice = 0;

		while (indice != -1) {
			System.out.println("Digite os dados de uma nova pessoa");
			Pessoa pessoa = cadastraPessoa();
			sistema.adicionaPessoa(pessoa);
			exibirPessoas();
			System.out.println("Para parar digite '-1', caso queria acrescentar mais pessoas digite 1");
			indice = Integer.parseInt(sc.nextLine());
		}

	}

}

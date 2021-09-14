package apresentação;

import java.util.Scanner;

import dados.Pessoa;
import negocio.Sistema;

public class Main {

	private static Sistema sistema = new Sistema();
	private static Scanner sc = new Scanner(System.in);

	private static Pessoa novaPessoa() {

		Pessoa p = new Pessoa();

		System.out.println("Digite o nome: ");
		p.setNome(sc.next());

		System.out.println("Digite a idade: ");
		p.setIdade(sc.nextInt());

		System.out.println("Digite a altura: ");
		p.setAltura(sc.nextFloat());

		System.out.println("Digite a massa: ");
		p.setMassa(sc.nextFloat());

		return p;
	}

	private static void mostrarPessoas() {

		for (int i = 0; i < sistema.getLista().size(); i++) {
			System.out.println("Pessoa " + i);
			System.out.println(sistema.getLista().get(i));
			System.out.println();
		}
	}

	private static Pessoa escolherPessoa() {

		mostrarPessoas();

		System.out.println("Escolha uma pessoa: ");

		int escolha = sc.nextInt();

		if (escolha < sistema.getLista().size()) {
			return sistema.getLista().get(escolha);
		} else {
			return null;
		}
	}

	public static void imprimeMenu() {
		System.out.println("Escolha uma opção: ");
		System.out.println("0 - Sair");
		System.out.println("1 - Cadastrar pessoa");
		System.out.println("2 - Remover pessoa");
		System.out.println("3 -  Mostrar pessoas");
	}

	public static void menu() {
		int opcao = -1;
		while (opcao != 0) {
			imprimeMenu();
			opcao = sc.nextInt();
			switch (opcao) {
			case 0:
				break;
			case 1:
				sistema.adicionarPessoa(novaPessoa());
				break;
			case 2:
				sistema.removerPessoa(escolherPessoa());
				break;
			case 3:
				mostrarPessoas();
				break;
			default:
				System.out.println("Numero invlido!");
				break;
			}
		}
	}

	public static void main(String[] args) {
		menu();
	}

}

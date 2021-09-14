package apresentaçãoExercicio2;

import java.util.Scanner;

import dadosExercicio2.Contato;
import negociosExercicio2.ListaTelefonica;

public class Exercicio2 {
	private static ListaTelefonica lista = new ListaTelefonica();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opcao = -1;

		while (opcao != 0) {
			System.out.println("Escolha um opção: ");
			System.out.println("0 - Sair");
			System.out.println("1 - Cadastrar contato");
			System.out.println("2 - Remover contato");
			System.out.println("3 - Mostrar todos os contatos");

			opcao = sc.nextInt();

			switch (opcao) {
			case 0:
				break;
			case 1:
				Contato contato = novoContato();
				lista.adicionaContato(contato);
				break;
			case 2:
				removerContato();
				break;
			case 3:
				exibirContatos();
				break;
			default:
				break;
			}
		}
	}

	private static Contato novoContato() {

		System.out.println("Digite o nome do contato: ");
		String nome = sc.nextLine();
		nome = sc.nextLine();
		

		System.out.println("Digite o numero do telefone: ");
		int telefone = sc.nextInt();
		
		Contato c = new Contato();
		c.setNome(nome);
		c.setTelefone(telefone);
		return c;
	}

	private static void exibirContato(char letra) {
		for (int i = 0; i < lista.buscarContatos(letra).size(); i++) {
			System.out.println("Código: " + i);
			System.out.println(lista.buscarContatos(letra).get(i).toString());
		}
	}

	private static void removerContato() {
		System.out.println("Escolha uma letra que deseja remover um contato: ");
		String letra = sc.next().toUpperCase();

		if (lista.buscarContatos(letra.charAt(0)).size() > 0) {
			exibirContato(letra.charAt(0));

			System.out.println("Escolher um contato para ser removido: ");
			int indice = sc.nextInt();
			if (indice < lista.buscarContatos(letra.charAt(0)).size()) {
				lista.removeContato(lista.buscarContatos(letra.charAt(0)).get(indice));
			}
		}
		else {
			System.out.println("Não existem contatos para serem removidos");
		}
	}

	private static void exibirContatos() {
		lista.buscarContatos().forEach((chave, lista) -> {
			System.out.println(chave + ": ");
			for (Contato contato : lista) {
				System.out.println("  " + contato.toString());
			}
		});
	}

}

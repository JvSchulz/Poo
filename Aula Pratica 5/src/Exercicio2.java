import java.util.Scanner;

import dados.Contato;
import negocio.ListaTelefonica;

public class Exercicio2 {
	private static ListaTelefonica lista = new ListaTelefonica();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opcao = -1;

		while (opcao != 0) {
			System.out.println("Escolha um op??o: ");
			System.out.println("0 - Sair");
			System.out.println("1 - Cadastrar contato");
			System.out.println("2 - Remover contato");
			System.out.println("3 - Mostrar todos os contatos");

			opcao = Integer.parseInt(sc.nextLine());

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
		Contato c = new Contato();
		System.out.println("Digite o nome do contato: ");
		c.setNome(sc.nextLine());
		System.out.println("Digite o numero do telefone: ");
		c.setTelefone(Integer.parseInt(sc.nextLine()));
		return c;
	}

	private static void exibirContato(char letra) {
		for (int i = 0; i < lista.buscarContatos(letra).size(); i++) {
			System.out.println("C?digo: " + i);
			System.out.println(lista.buscarContatos(letra).get(i));
		}
	}
	private static void removerContato() {
		System.out.println("Escolha uma letra que deseja remover um contato: ");
		char letra = sc.nextLine().charAt(0);

		if (lista.buscarContatos(letra).size() > 0) {
			exibirContato(letra);
			
			System.out.println("Escolher um contato para ser removido: ");
			int indice =  Integer.parseInt(sc.nextLine());
			if(indice<lista.buscarContatos(letra).size()) {
				lista.removeContato(lista.buscarContatos(letra).get(indice));
			}
		}
	}
	private static void exibirContatos() {
		lista.buscarContatos().forEach((chave,contatos) ->{
			System.out.println(chave+": ");
			for(Contato contato: contatos) {
				System.out.println("\t"+contato);
			}
		});
	}

	
	
}

package apresentação;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import dados.Atores;
import dados.Filmes;
import negocio.Sistema;

public class Apresentacao {

	public static Scanner sc = new Scanner(System.in);
	public static Sistema sistema = new Sistema();

	public static Filmes cadastrarFilme() {
		List<Atores> elenco = new LinkedList<Atores>();
		int i = -1;
		Filmes filme = new Filmes();
		sc.nextLine();
		System.out.println("Digite o titulo do filme: ");
		filme.setTitulo(sc.nextLine());
		System.out.println("Digite o id do filme: ");
		filme.setId(Long.parseLong(sc.nextLine()));
		System.out.println("Digite o rank do filme: ");
		filme.setRank(Integer.parseInt(sc.nextLine()));
		System.out.println("Digite o ano do filme: ");
		filme.setAno(sc.nextLine());
		System.out.println("Cadastre o elenco do filme: ");
		while (i != 0) {
			Atores a = new Atores();
			System.out.println("Digite o nome do ator: ");
			a.setNome(sc.nextLine());
			System.out.println("Digite o id do ator: ");
			a.setId(Long.parseLong(sc.nextLine()));
			System.out.println("Digite a data de nascimento do ator: ");
			a.setDataDeNascimento(sc.nextLine());
			System.out.println("Digite o sexo do ator: ");
			a.setSexo(sc.nextLine());
			System.out.println("Digite a mini biografia do ator: ");
			a.setMiniBiografia(sc.nextLine());

			System.out.println("Para adicionar um novo ator digite qualquer numero, para parar digite 0");
			i = Integer.parseInt(sc.nextLine());
			elenco.add(a);
		}
		filme.setElenco(elenco);
		return filme;
	}

	public static Atores cadastrarAtor() {
		Atores a = new Atores();

		System.out.println("Digite o nome do ator: ");
		a.setNome(sc.nextLine());
		System.out.println("Digite o id do ator: ");
		a.setId(Long.parseLong(sc.nextLine()));
		System.out.println("Digite a dada de nascimento do ator: ");
		a.setDataDeNascimento(sc.nextLine());
		System.out.println("Digite o sexo do ator: ");
		a.setSexo(sc.nextLine());
		System.out.println("Digite a mini biografia do ator: ");
		a.setMiniBiografia(sc.nextLine());

		return a;
	}

	public static boolean comparaTitulo(Filmes filme) {
		List<Filmes> todosOsFilmes = sistema.buscaFilmes();
		if (todosOsFilmes.contains(filme)) {
			return true;
		}
		return false;
	}

	public static void exibirFilmes(Filmes filme) {

		List<Filmes> filmes = sistema.buscaFilmes();
		for (Filmes filme1 : filmes) {
			if (filme1.equals(filme)) {

				System.out.println(filme1);
			}
		}
	}

	public static void salvarFilmeFavorito() {
		int i = 1;
		List<Filmes> filmes = sistema.buscaFilmes();
		for (Filmes filme : filmes) {
			System.out.println(i + ": " + filme);
			i++;
		}
		System.out.println("Escolha o numero do filme que deseja salvar aos favoritos");
		int j = sc.nextInt();
		sistema.salvaFilmeFavorito(filmes.get(j - 1));
	}

	public static void salvarAtorFavorito() {
		int i = 1;
		List<Atores> atores = sistema.buscaAtores();
		for (Atores ator : atores) {
			System.out.println(i + ": " + ator);
			i++;
		}
		System.out.println("Escolha o numero do ator que deseja salvar aos favoritos");
		int j = sc.nextInt();
		sistema.salvaAtorFavorito(atores.get(j - 1));
	}

	public static void exibeFilmesFavoritos() {
		System.out.println(sistema.buscaFilmesFavoritos());
	}

	public static void exibeAtoresFavoritos() {
		System.out.println(sistema.buscaAtoresFavoritos());
	}

	public static void main(String[] args) {

		Filmes filme1 = new Filmes();
		filme1.setId(12);
		filme1.setTitulo("Desastre");
		filme1.setAno("12");
		filme1.setRank(12);
		Atores ator1 = new Atores();
		ator1.setNome("joao");
		ator1.setDataDeNascimento("12");
		ator1.setId(12);
		ator1.setMiniBiografia("12");
		List<Atores> elenco1 = new LinkedList<Atores>();
		elenco1.add(ator1);
		filme1.setElenco(elenco1);
		sistema.cadastraFilme(filme1);
		sistema.cadastraAtor(ator1);

		Filmes filme2 = new Filmes();
		filme2.setId(12);
		filme2.setTitulo("A procura");
		filme2.setAno("12");
		filme2.setRank(12);
		Atores ator2 = new Atores();
		ator2.setNome("joao");
		ator2.setDataDeNascimento("12");
		ator2.setId(12);
		ator2.setMiniBiografia("12");
		List<Atores> elenco2 = new LinkedList<Atores>();
		elenco2.add(ator2);
		filme2.setElenco(elenco2);
		sistema.cadastraFilme(filme2);
		sistema.cadastraAtor(ator2);
		if (comparaTitulo(filme2)) {
			System.out.println("São iguais");
		}
		int opcao = -1;

		while (opcao != 0) {
			System.out.println("Escolha um opção: ");
			System.out.println("0 - Sair");
			System.out.println("1 - Cadastrar filme");
			System.out.println("2 - Cadastrar ator");
			System.out.println("3 - Buscar filmes");
			System.out.println("4 - Salvar filme como favorito");
			System.out.println("5 - Salvar ator como favorito");
			System.out.println("6 - Mostrar filmes favoritos");
			System.out.println("7 - Mostrar atores favoritos");

			opcao = sc.nextInt();

			switch (opcao) {
			case 0:
				break;
			case 1:
				Filmes filme = cadastrarFilme();
				sistema.cadastraFilme(filme);
				break;
			case 2:
				Atores ator = cadastrarAtor();
				sistema.cadastraAtor(ator);
				break;
			case 3:
				System.out.println("Digite o titulo do filme que você quer exibir: ");
				// String nome = sc.nextLine();
				exibirFilmes(filme1);
				break;
			case 4:
				salvarFilmeFavorito();
				break;
			case 5:
				salvarAtorFavorito();
				break;
			case 6:
				exibeFilmesFavoritos();
				break;
			case 7:
				exibeAtoresFavoritos();
				break;

			default:
				break;
			}
		}

	}

}

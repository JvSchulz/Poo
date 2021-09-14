package apresentação;

import java.util.Scanner;

import dados.Viveiro;

public class apresentacao {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcao = -1;
		while (opcao != 0) {
			exibeMenu();
			opcao = Integer.parseInt(sc.nextLine());
			switch (opcao) {

			case 1:
				System.out.println("Cadastrar Viveiro");
				cadastrarViveiro();
				break;
			case 2:
				System.out.println("Cadastrar Animal");
				cadastrarAnimal();
				break;
			case 3:
				System.out.println("Mostrar Aquarios");
				mostrarAquarios();
			case 4:
				System.out.println("Mostrar Viveiros");
				mostrarViveiros();
				break;
			default:
				System.out.println("Numero invalido");
				break;
			}
		}
		sc.close();
	}
	public static void exibeMenu() {
		System.out.println("Escolha uma opção: ");
		System.out.println("0 - Encerrar");
		System.out.println("1 - Cadastrar Viveiro: ");
		System.out.println("2 - Cadastrar Animal: ");
		System.out.println("3 - Mostrar Aquarios: ");
		System.out.println("4 - Mostrar Viveiros: ");
	}
	public static Viveiro novoViveiro() {
		Viveiro v = new Viveiro();
		System.out.println("Informe o nome do viveiro: ");
		v.setNome(sc.nextLine());
		System.out.println("Informe o comprimento do viveiro: ");
		v.setComprimento(sc.nextFloat());
		System.out.println("Informe o valor da largura do viveiro: ");
		v.setLargura(sc.nextFloat());
		return v;
	}
}

import java.util.Scanner;
import entities.*;
import entities.Veterinarios;

public class SistemaPetShop {
	private static Veterinarios[] veterinario = new Veterinarios[3];
	private static int numeroVeterinarios = 0;
	private static Scanner sc = new Scanner(System.in);

	public static void imprimeMenu() {
		System.out.println("Escolha uma opcao:");
		System.out.println("0 - Sair");
		System.out.println("1 - Cadastrar Veterinário");
		System.out.println("2 - Exibir Veterinario");
		System.out.println("3 - Cadastrar endereco do Veterinario");
		System.out.println("4 - Cadastrar Animal");
		System.out.println("5 - Exibir Animais");
		System.out.println("6 -  Cadastrar Dono");
	}

	public static void main(String[] args) {
		int opcao = -1;
		while (opcao != 0) {
			imprimeMenu();
			opcao = sc.nextInt();
			switch (opcao) {
			case 0:
				break;
			case 1:
				cadastrarVeterinario();
				break;
			case 2:
				mostrarVeterinarios();
				break;
			case 3:
				cadastrarEnderecoVeterinario();
				break;
			case 4:
				cadastrarAnimal();
				break;
			case 5:
				mostrarAnimal();
				break;
			case 6:
				cadastrarDono();
				break;
			default:
				System.out.println("Valor incorreto!");
				break;

			}
		}
	}

	public static void cadastrarVeterinario() {
		if (numeroVeterinarios < 3) {
			Veterinarios v = new Veterinarios();
			System.out.println("Digite o nome do veterinario: ");

			String nome = sc.nextLine();
			nome = sc.nextLine();
			v.setNome(nome);

			System.out.println("Digite o salario do veterinario: ");
			float salario = sc.nextFloat();
			v.setSalario(salario);

			veterinario[numeroVeterinarios] = v;
			numeroVeterinarios++;
		}
	}

	public static void mostrarVeterinarios() {
		for (int i = 0; i < numeroVeterinarios; i++) {
			System.out.println("Codigo: " + i);
			System.out.println(veterinario[i].toString());
		}
	}

	public static Veterinarios escolherVeterinario() {
		System.out.println("Escolha um veterinario para cadastrar um animal: ");
		mostrarVeterinarios();

		int escolha = sc.nextInt();

		if (escolha > numeroVeterinarios) {
			System.out.println("Numero invalido");
			return null;
		} else {
			return veterinario[escolha];
		}
	}

	public static Endereço cadastrarEndereco() {
		Endereço e = new Endereço();

		System.out.println("Digite o nome da rua: ");

		String rua = sc.nextLine();
		rua = sc.nextLine();
		e.setRua(rua);

		System.out.println("Digite o numero da casa: ");

		rua = sc.nextLine();
		e.setNumero(sc.nextInt());
		
		System.out.println("Digite o nome da rua: ");

		String bairro = sc.nextLine();
		bairro = sc.nextLine();
		e.setBairro(bairro);
		
		System.out.println("Digite o nome da cidade: ");
		String cidade = sc.nextLine();
		e.setCidade(cidade);
		
		System.out.println("Digite o nome do estado: ");
		String estado = sc.nextLine();
		e.setEstado(estado);
		
		System.out.println("Digite o numero do cep: ");
		e.setCep(sc.nextInt());
		return e;
	}
}

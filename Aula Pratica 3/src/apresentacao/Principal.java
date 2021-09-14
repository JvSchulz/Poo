package apresentacao;

import dados.*;
import java.util.Scanner;
import negocio.ReservaPassagem;

public class Principal {
	public static Scanner sc = new Scanner(System.in);
	public static ReservaPassagem sistema = new ReservaPassagem();

	public static void exibeMenuPrincipal() {
		System.out.println("Escolha uma opção: ");
		System.out.println("0 - Encerrar");
		System.out.println("1 - Realizar reserva");
		System.out.println("2 - Cadastrar cliente");
		System.out.println("3 - Mostrar reservas");
		System.out.println("4 - Cadastras cidade");

	}

	public static void main(String args) {
		int opcao = -1;
		while (opcao != 0) {
			exibeMenuPrincipal();
			opcao = Integer.parseInt(sc.nextLine());
			switch (opcao) {

			case 1:
				System.out.println("Realizar reserva");
				realizarReserva();
				break;
			case 2:
				System.out.println("Cadastrar cliente");
				cadastrarCliente();
				break;
			case 3:
				System.out.println("Mostrar reserva");
				mostrarReservas();
			case 4:
				System.out.println("Cadastrar cidade");
				cadastrarCidade();
				break;
			default:
				System.out.println("Numero invalido");
				break;
			}
		}
	}

	public static Cliente novoCliente() {

		Cliente c = new Cliente();

		System.out.println("Informe seu nome: ");
		c.setNome(sc.nextLine());
		System.out.println("Digite seu CPF: ");
		c.setCpf(Long.parseLong(sc.nextLine()));
		System.out.println("Digite o seu endereco: ");
		c.setEndereco(sc.nextLine());
		System.out.println("Digite seu telefone: ");
		c.setTelefone(Integer.parseInt(sc.nextLine()));

		return c;
	}

	public static void cadastrarCliente() {
		sistema.cadastrarCliente(novoCliente());
	}

	public static void mostrarCliente() {
		Cliente listaDeClientes[] = sistema.mostrarClientes();
		for (int i = 0; i < sistema.getQuantClientes(); i++) {
			Cliente c = listaDeClientes[i];
			System.out.println("Cliente" + i + ": " + c);
		}
	}

	public static Cidade novaCidade() {
		System.out.println("Digite o nome da cidade: ");
		String nome = sc.nextLine();
		nome = sc.nextLine();

		System.out.println("Digite os estado da cidade: ");
		String estado = sc.nextLine();

		Cidade c = new Cidade();
		c.setNome(nome);
		c.setEstado(estado);
		
		return c;
	}
	public static void cadastrarCidade() {
		sistema.cadastrarCidade(novaCidade());
	}
	
	public static void mostrarCidades() {
		Cidade listaDeCidades[] = sistema.mostrarCidade();
		for(int i = 0;i<sistema.getquantCidades();i++) {
			Cidade c = listaDeCidades[i];
			System.out.println("Cidade"+i+": "+c);
		}
	}
	public static Cidade escolherCidade() {
		mostrarCidades();
		System.out.println("Escolher uma cidade: ");
		int codigo = sc.nextInt();
		
		if(codigo>sistema.getquantCidades()) {
			System.out.println("Cidade invalida");
			return null;
		}
		else {
			return sistema.mostrarCidade();
		}
	}
	public static Reserva novaReserva() {
		System.out.println("Digite a data do voo:");
		String data = sc.nextLine();
		data = sc.nextLine();
		
		System.out.println("Digite a hora do voo: ");
		String hora = sc.nextLine();
		
		System.out.println("Digite o preco do voo: ");
		float preco = sc.nextFloat();
		
		System.out.println("Digite a classe do voo: ");
		String classe =  sc.nextLine();
		classe = sc.nextLine();
		
		System.out.println("Digite a poltrona no voo: ");
		int poltrona = sc.nextInt();
		
		Cidade origem  = escolherCidade();
		Cidade destino = escolherCidade();
		
		Reserva r = new Reserva();
		r.setDataVoo(data);
		r.setHoraVoo(hora);
		r.setPreco(preco);
		r.setClasseVoo(classe);
		r.setPoltrona(poltrona);
		r.setOrigem(origem);
		r.setDestino(destino);
		
		return r;
	}
	public static void realizarReserva() {
		Cliente c = escolherCliente();
	}
}

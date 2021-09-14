package exercicio3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static List<Cliente> clientes =  new LinkedList<Cliente>();
	private static List<Servidor> servidores = new LinkedList<Servidor>();
	
	
	public static void main(String[] args) {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		Cliente cliente1 =  new Cliente();
		Cliente cliente2 =  new Cliente();
		Cliente cliente3 =  new Cliente();
		Cliente cliente4 =  new Cliente();
		Cliente cliente5 =  new Cliente();
		Servidor servidor1 =  new Servidor();
		Servidor servidor2 =  new Servidor();
		Servidor servidor3 =  new Servidor();
		servidor1.adicionar(cliente1);
		servidor1.adicionar(cliente2);
		servidor2.adicionar(cliente1);
		servidor2.adicionar(cliente3);
		servidor3.adicionar(cliente5);
		servidor3.adicionar(cliente4);
		servidor3.adicionar(cliente2);
		servidor2.adicionar(cliente4);
		servidor1.adicionar(cliente5);
		servidor3.adicionar(cliente3);
		servidores.add(servidor1);
		servidores.add(servidor2);
		servidores.add(servidor3);
		for(Servidor s : servidores) {
			System.out.println("Digite o ip do servidor"+i+": ");
			s.setIp(sc.nextLine());
			i++;
			s.enviarMensagem("HelloWorld");
		}
		clientes.add(cliente5);
		clientes.add(cliente4);
		clientes.add(cliente3);
		clientes.add(cliente2);
		clientes.add(cliente1);
		sc.close();
		for(Cliente c : clientes) {
			System.out.println(c.toString());
		}
	}

}

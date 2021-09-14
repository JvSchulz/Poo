package negocio;

import dados.Cidade;
import dados.Cliente;
import dados.Reserva;

public class ReservaPassagem {

	private Cidade[] listaDeCidades = new Cidade[5];
	private int quantCidades = 0;
	private Cliente[] listaDeClientes = new Cliente[5];
	private int quantClientes = 0;

	public Cliente[] getListaDeClientes() {
		return listaDeClientes;
	}

	public int getQuantClientes() {
		return quantClientes;
	}

	public Cidade[] getlistaDeCidades() {
		return listaDeCidades;
	}

	public int getquantCidades() {
		return quantCidades;
	}

	public void cadastrarCidade(Cidade cidade) {
		if (quantCidades < listaDeCidades.length) {
			listaDeCidades[quantCidades] = cidade;
			quantCidades++;
		} else {
			System.out.println("Lista Cheia!");
		}
	}

	public void cadastrarCliente(Cliente cliente) {
		if (quantClientes < listaDeClientes.length) {
			listaDeClientes[quantClientes] = cliente;
			quantClientes++;
		} else {
			System.out.println("Lista Cheia!");
		}
	}

	public void reservarIda(Cliente cliente, Reserva ida) {
		if (clienteCadastrado(cliente)) {
			cliente.reservarIda(ida);
		} else {
			System.out.println("Cliente não cadastrado");
		}
	}

	private void reservarVolta(Cliente cliente, Reserva ida, Reserva volta) {
		if (clienteCadastrado(cliente)) {
			cliente.reservaVolta(ida, volta);
		} else {
			System.out.println("Cliente não cadastrado");
		}
	}

	private boolean clienteCadastrado(Cliente cliente) {
		for (int i = 0; i < quantClientes; i++) {
			if (listaDeClientes[i].equals(cliente)) {
				return true;
			}
		}
		return false;
	}

	public Reserva[] mostrarReservas(long cpfCliente) {
		for (int i = 0; i < quantClientes; i++) {
			if (listaDeClientes[i].getCpf() == cpfCliente) {
				return listaDeClientes[i].getReservas();
			}

		}
		return null;
	}

	public Cliente[] mostrarClientes() {
		return listaDeClientes;
	}

	public Cidade[] mostrarCidade() {
		return listaDeCidades;
	}
}

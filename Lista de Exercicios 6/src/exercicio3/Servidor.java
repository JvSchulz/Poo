package exercicio3;

import java.util.LinkedList;
import java.util.List;

public class Servidor implements Sujeito {

	private String ip;
	private String ultimaMensagem;
	private List<Observador> observadores = new LinkedList<Observador>();

	
	
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public void enviarMensagem(String mensagem) {
		this.ultimaMensagem = mensagem;
		notificar();
	}
	
	public void adicionar(Observador observador) {
		observadores.add(observador);

	}

	public void remover(Observador observador) {
		observadores.remove(observador);

	}

	public void notificar() {
		for (Observador o : observadores) {
			o.atualizar("\n Ip: "+ip+ ", mensagem: "+ ultimaMensagem);
		}
	}

	public String toString() {
		return "Ip do servidor :"+ip;

	}
}

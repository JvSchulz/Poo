package exercicio3;

import java.util.LinkedList;
import java.util.List;

public class Cliente implements Observador {
	
	private List<String> mensagens =  new LinkedList<String>();
	
	public void atualizar(Object object) {
		mensagens.add((String) object);
	}

	
	public String toString() {
		return "\n Cliente \nMensagens:  " + mensagens;
	}
	
}

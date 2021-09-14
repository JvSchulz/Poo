package negocio;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import dados.Pessoa;

public class Sistema {

	private Map<Character, List<Pessoa>> pessoas = new HashMap<Character, List<Pessoa>>();

	public Sistema() {

		for (char i = 65; i < 91; i++) {
			List<Pessoa> lista = new LinkedList<Pessoa>();
			pessoas.put(i, lista);
		}
	}

	public void adicionaPessoa(Pessoa pessoa) {
		String nome = pessoa.getNome().toUpperCase();
		List<Pessoa> listaPessoa = pessoas.get(nome.charAt(0));
		listaPessoa.add(pessoa);
	}
	
	public Map<Character, List<Pessoa>> buscarPessoa(){
		return pessoas;
	}

}
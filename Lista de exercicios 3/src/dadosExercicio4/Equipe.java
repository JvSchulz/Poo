package dadosExercicio4;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
	private String nome;
	private List<Aluno> equipesAlunos =  new ArrayList<Aluno>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "Equipe [nome=" + nome + "]";
	}
	
}

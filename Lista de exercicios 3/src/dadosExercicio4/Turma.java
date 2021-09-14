package dadosExercicio4;


import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Turma {
	
	private List<Aluno> alunos = new LinkedList<Aluno>();
	
	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	private void ordenaAlunosPorMedia() {
		for(Aluno aluno : alunos) {
		Collections.sort(alunos, Comparator.comparing(Aluno::getMedia));
		}
	}
	public void separarEquipes() {
		
	}
}

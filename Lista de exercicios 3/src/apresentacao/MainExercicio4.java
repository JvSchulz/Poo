package apresentacao;

import java.util.Scanner;

import dadosExercicio4.Aluno;
import dadosExercicio4.Turma;

public class MainExercicio4 {

	private static Scanner sc = new Scanner(System.in);
	private static Turma turma = new Turma();

	private static Aluno cadastrarAluno() {
		Aluno a = new Aluno();
		double[] temp = new double[5];
		System.out.println("Digite o nome: ");
		a.setNome(sc.nextLine());
		System.out.println("Digite a idade: ");
		a.setIdade(Integer.parseInt(sc.nextLine()));
		System.out.println("Digite as notas do aluno: ");
		for (int i = 0; i < 5; i++) {
			System.out.println(i + "° nota: ");
			temp[i] = sc.nextDouble();
		}
		a.setNotas(temp);

		return a;
	}

	public static void main(String[] args) {
		int indice = 0;

		while (indice != -1) {
			System.out.println("Digite os dados de um novo aluno: ");
			Aluno aluno = cadastrarAluno();
			turma.adicionarAluno(aluno);
			System.out.println("Para parar digite '-1', caso queria acrescentar mais pessoas digite 1");
			indice = Integer.parseInt(sc.nextLine());
		}

	}
}
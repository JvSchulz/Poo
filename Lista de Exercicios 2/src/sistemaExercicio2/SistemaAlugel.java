package sistemaExercicio2;

import java.util.Scanner;

import dadosExercicio1.Carro;
import dadosExercicio1.Funcionario;

public class SistemaAlugel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Carro carro = new Carro();
		Funcionario funcionario =  new Funcionario();
		System.out.println("Digite a placa do carro: ");
		carro.setPlaca(sc.nextLine());
		System.out.println("Digite o modelo do carro: ");
		carro.setModelo(sc.nextLine());
		System.out.println("Digite o ano do carro: ");
		carro.setAno(sc.nextInt());
		System.out.println("Digite o nome do funcionario: ");
		funcionario.setNome(sc.nextLine());
		System.out.println("Digite o cargo do funcionario: ");
		funcionario.setCargo(sc.nextLine());
		System.out.println("Digite o salario do funcionario: ");
		funcionario.setSalario(sc.nextDouble());
		sc.close();
	}

}

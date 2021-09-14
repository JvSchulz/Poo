import entities.Grupo;
import entities.Pessoa;
public class Exercicios {

	public static void main(String[] args) {
		
		Grupo g = new Grupo ( ) ;


		Pessoa p1 = new Pessoa();
		p1.setNome("Joao");
		p1.setAltura(1.70f);
		p1.setIdade(19);
		p1.setMassa(70.0f);
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Marcos");
		p2.setAltura(1.60f);
		p2.setIdade(29);
		p2.setMassa(80.0f);

		g.setPessoa(p1);	
		g.setPessoa(p2);	
		g.ordena();
		
		for (int i=0; i<2; i++) {
			System.out.println("Nome " + g.getPessoas()[i].getNome());
			System.out.println("Altura " + g.getPessoas()[i].getAltura());
			System.out.println("Idade " + g.getPessoas()[i].getIdade());
			System.out.println("Massa " + g.getPessoas()[i].getMassa());
			System.out.println("Imc " + g.getPessoas()[i].calculoImc()+"\n");
		}
		
		
	}

}

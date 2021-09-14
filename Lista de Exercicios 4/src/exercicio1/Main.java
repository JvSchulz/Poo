package exercicio1;

public class Main {

	public static void main(String[] args) {
			Cachorro cachorro  =  new Cachorro();
			Cachorro cachorro1  =  new Cachorro();
			Hamster hamster = new Hamster();
			Hamster hamster1 = new Hamster();
			Galinha galinha =  new Galinha();
			Galinha galinha1 = new Galinha();
			cachorro.setNome("Frederick");
			cachorro1.setNome("Djones");
			hamster.setNome("Sasão");
			hamster1.setNome("Benjamin");
			galinha.setNome("Paloma");
			galinha1.setNome("Daniela");
			System.out.println(cachorro.emitirSom());
			System.out.println(cachorro1.emitirSom());
			System.out.println(hamster.emitirSom());
			System.out.println(hamster1.emitirSom());
			System.out.println(galinha.emitirSom());
			System.out.println(galinha1.emitirSom());
			
		}

}

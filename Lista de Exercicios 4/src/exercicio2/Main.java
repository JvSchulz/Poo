	package exercicio2;

public class Main {

	public static void main(String[] args) {
		Trap�zio t = new Trap�zio();
		t.setBaseMenor(4);
		t.setBaseMaior(6);
		t.setAltura(5);
		Trap�zio t2 = new Trap�zio();
		t2.setBaseMenor(3);
		t2.setBaseMaior(5);
		t2.setAltura(6);
		Losango l =  new Losango();
		l.setd(3);
		l.setD(5);
		Losango l2 =  new Losango();
		l2.setd(4);
		l2.setD(6);
		Circulo c = new Circulo();
		c.setRaio(4);
		Circulo c2 = new Circulo();
		c2.setRaio(6);
		
		System.out.println("Trap�zio 1: "+t+"\nTrap�zio 2: "+t2+"\nLosango 1: "+l+"\nLosango 2: "+l2+"\nCirculo 1: "+c+"\nCirculo 2: "+c2);
	}

}

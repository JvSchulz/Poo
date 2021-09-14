package exercicio2;

import exceptionsExercicio2.PilhaCheiaException;
import exceptionsExercicio2.ProcessoSemJuizException;

public class Main {

	public static void main(String[] args) {
		SistemaProcessos sistema = new SistemaProcessos();
		Juiz j1 = new Juiz(5);
		Juiz j2 = new Juiz(5);
		Juiz j3 = new Juiz(5);
		Processo p1 =  new Processo();
		Processo p2 =  new Processo();
		Processo p3 =  new Processo();
		Processo p4 =  new Processo();
		Processo p5 =  new Processo();
		Processo p6 =  new Processo();
		Processo p7 =  new Processo();
		Processo p8 =  new Processo();
		Processo p9 =  new Processo();
		Processo p10 =  new Processo();
		Processo p11 =  new Processo();
		Processo p12 =  new Processo();
		Processo p13 =  new Processo();
		Processo p14 =  new Processo();
		Processo p15 =  new Processo();
		Processo p16 =  new Processo();
		Processo p17 =  new Processo();
		Processo p18 =  new Processo();
		p1.setId(1);
		p1.setNome("A");
		p2.setId(2);
		p2.setNome("B");
		p3.setId(3);
		p3.setNome("C");
		p4.setId(4);
		p4.setNome("D");
		p5.setId(5);
		p5.setNome("E");
		p6.setId(6);
		p6.setNome("F");
		p7.setId(7);
		p7.setNome("G");
		p8.setId(8);
		p8.setNome("H");
		p9.setId(9);
		p9.setNome("I");
		p10.setId(10);
		p10.setNome("J");
		p11.setId(11);
		p11.setNome("K");
		p12.setId(12);
		p12.setNome("L");
		p13.setId(13);
		p13.setNome("M");
		p14.setId(14);
		p14.setNome("N");
		p15.setId(15);
		p15.setNome("O");
		p16.setId(16);
		p16.setNome("P");
		p17.setId(17);
		p17.setNome("Q");
		p18.setId(18);
		p18.setNome("R");
		sistema.cadastrarJuiz(j1);
		sistema.cadastrarJuiz(j2);
		sistema.cadastrarJuiz(j3);
		sistema.cadastrarProcesso(p1);
		sistema.cadastrarProcesso(p2);
		sistema.cadastrarProcesso(p3);
		sistema.cadastrarProcesso(p4);
		sistema.cadastrarProcesso(p5);
		sistema.cadastrarProcesso(p6);
		sistema.cadastrarProcesso(p7);
		sistema.cadastrarProcesso(p8);
		sistema.cadastrarProcesso(p9);
		sistema.cadastrarProcesso(p10);
		sistema.cadastrarProcesso(p11);
		sistema.cadastrarProcesso(p12);
		sistema.cadastrarProcesso(p13);
		sistema.cadastrarProcesso(p14);
		sistema.cadastrarProcesso(p15);
		sistema.cadastrarProcesso(p16);
		sistema.cadastrarProcesso(p17);
		sistema.cadastrarProcesso(p18);
		try {
			sistema.distribuirProcessos();
		} catch (ProcessoSemJuizException | PilhaCheiaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

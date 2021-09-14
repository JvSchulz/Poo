package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		  List<List<String>> lista = new ArrayList<List<String>>();
	        List<String> linha1 = new ArrayList<String>();
	        linha1.add("a00");
	        linha1.add("b01");
	        List<String> linha2 = new ArrayList<String>();
	        linha2.add("a10");
	        linha2.add("b11");
	        lista.add(linha1);
	        lista.add(linha2);

	        for(int i = 0; i < lista.size(); i++){
	            for(int j = 0; j < lista.get(i).size(); j++){
	                System.out.print(lista.get(i).get(j)+" ");
	            }
	            System.out.println("");
	        }
	        
	        private static boolean set()
}
}
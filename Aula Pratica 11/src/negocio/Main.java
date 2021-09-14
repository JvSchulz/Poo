package negocio;

import java.sql.SQLException;

import dados.Endereco;
import dados.Pessoa;
import exceptions.InsertException;
import exceptions.SelectException;
import exceptions.UpdateException;

public class Main {

	public static void main(String[] args)  {
		
			
	
				try {
					Sistema sistema = new Sistema("967252");
					 int i =0;
						Pessoa pessoa = new Pessoa();
						pessoa.setNome("joao");
						pessoa.setCpf(123125123);
						pessoa.setTelefone(4124213);
						Endereco endereco = new Endereco();
						endereco.setRua("abe");
						endereco.setNumero(123);
						endereco.setCidade("joi");
						pessoa.setEndereco(endereco);
						//sistema.inserirPessoa(pessoa);
						sistema.selectAll();
						System.out.println(sistema.selectAll());
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SelectException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
				
				} 
				
				
		
}
}

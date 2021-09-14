package entities;

public class Endereço {
	private String Rua;
	private int Numero;
	private String Bairro;
	private String Cidade;
	private String Estado;
	private int Cep;
	
	public Endereço() {
		
	}
	public int getCep() {
		return Cep;
	}
	public void setCep(int cep) {
		Cep = cep;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	public String getRua() {
		return Rua;
	}
	public void setRua(String rua) {
		Rua = rua;
	}
	public String toString() {
		return "Rua: " + Rua + ", "
				+ "N°: " + Numero + ", "+"\n"
				+ "Bairro: " + Bairro + ", " 
				+ "Cidade: " + Cidade + ","
				+ "Estado: " + Estado + ", "
				+ "Cep: " + Cep + ", ";
	}
}

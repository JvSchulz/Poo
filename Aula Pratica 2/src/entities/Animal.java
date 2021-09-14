package entities;

public class Animal {
	private String name;
	private Dono dono;
	private String especie;
	private String descriçao;
	
public Animal() {
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Dono getdono() {
	return dono;
}

public void setdono(Dono dono) {
	this.dono = dono;
}

public String getEspecie() {
	return especie;
}

public void setEspecie(String especie) {
	this.especie = especie;
}

public String getDescriçao() {
	return descriçao;
}

public void setDescriçao(String descriçao) {
	this.descriçao = descriçao;
}
public String toString() {
	return "Nome: "+ this.name + "\n"
			+"Especie: " + this.especie +"\n"
			+"Descrição: " + this.descriçao +"\n"
			+ this.dono;
}
}
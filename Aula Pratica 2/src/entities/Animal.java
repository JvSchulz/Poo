package entities;

public class Animal {
	private String name;
	private Dono dono;
	private String especie;
	private String descri�ao;
	
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

public String getDescri�ao() {
	return descri�ao;
}

public void setDescri�ao(String descri�ao) {
	this.descri�ao = descri�ao;
}
public String toString() {
	return "Nome: "+ this.name + "\n"
			+"Especie: " + this.especie +"\n"
			+"Descri��o: " + this.descri�ao +"\n"
			+ this.dono;
}
}
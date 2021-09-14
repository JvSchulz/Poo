package exercicio2;

public class AnimalFactory {
	
	public static AnimalFactory instance = null;
	
	private AnimalFactory() {
		
	}
	
	public static AnimalFactory getInstance() {
		
		if(instance == null) {
			instance = new AnimalFactory();
		}
		return instance;
	}
	
	public Animal createAnimal(TipoAnimal tipo) {
		switch (tipo) {
		case CAO: 
			return new CAO();
		case GATO:
			return new GATO();
		case SAPO:
			return new SAPO();
		case COBRA:
			return new COBRA();
		case RATO:
			return new RATO();
		default:
			throw new IllegalArgumentException("Tipo de animal nao existente");
		}
	}
}

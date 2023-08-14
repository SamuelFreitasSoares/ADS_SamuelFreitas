package esporte;

public class Ciclista extends Atleta{

	public Ciclista(String name, Integer idade, Integer peso, Boolean aposentado) {
		super(name, idade, peso, aposentado);
	
	}
	
	void pedalar() {
		System.out.println("Ciclista pedalando");
	}

}

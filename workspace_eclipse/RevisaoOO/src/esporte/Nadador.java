package esporte;

public class Nadador extends Atleta {

	public Nadador(String name, Integer idade, Integer peso, Boolean aposentado) {
		super(name, idade, peso, aposentado);
		
	}
	
	void nadar() {
		System.out.println("Nadador nadando");
	}

}

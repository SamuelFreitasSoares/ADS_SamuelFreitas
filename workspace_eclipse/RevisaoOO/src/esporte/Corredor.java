package esporte;

public class Corredor extends Atleta{

	public Corredor(String name, Integer idade, Integer peso, Boolean aposentado) {
		super(name, idade, peso, aposentado);
	}
	
	void correr() {
		System.out.println("Corredor correndo");
	}

}

package esporte;

public class Atleta extends Pessoa{
	Integer peso;
	Boolean aposentado;
	public Atleta(String name, Integer idade, Integer peso, Boolean aposentado) {
		super(name, idade);
		this.peso = peso;
		this.aposentado = aposentado;
	}
	
	void aquecer() {
		System.out.println("aquecendo");
	}
	
	void aposentar() {
		this.aposentado = true;
	}
		
}

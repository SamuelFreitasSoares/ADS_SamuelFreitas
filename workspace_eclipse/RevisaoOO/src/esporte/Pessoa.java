package esporte;

public class Pessoa extends Object {
	String name;
	
	Integer idade;

	public Pessoa(String name, Integer idade) {
		super();
		this.name = name;
		this.idade = idade;
	}	
	
	public void envelhecer() {
		this.idade++;
	}

}

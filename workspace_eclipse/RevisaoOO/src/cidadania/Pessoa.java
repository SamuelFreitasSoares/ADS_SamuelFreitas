package cidadania;

public class Pessoa extends Object {
	String name;
	String sex;
	Integer idade;

	public Pessoa(String name, String sex, Integer idade) {
		super();
		this.name = name;
		this.sex = sex;
		this.idade = idade;
	}	
	
	public void envelhecer() {
		this.idade++;
	}

}
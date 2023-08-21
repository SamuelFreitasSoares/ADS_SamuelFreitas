package cidadania;

public class Cidadao extends Pessoa {
		String cpf;
	
	public Cidadao(String name, String sex, Integer idade, String cpf) {
		super(name, sex, idade);
		this.cpf = cpf;
		
	}

}

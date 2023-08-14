package esporte;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AtletaTest {

	@Test
	void test() {
		Pessoa Edson = new Pessoa("Edson", 21);
		System.out.println(Edson.name);
		System.out.println(Edson.idade);
		
		Atleta atleta = new Atleta("Edson",21, 80, false);
		System.out.println(atleta.name);
		System.out.println(atleta.idade);
		System.out.println(atleta.peso);
		System.out.println(atleta.aposentado);
	}
	
	@Test
	void testarNadador() {
		Nadador nadador = new Nadador("Gustavo", 35, 90, false);
		nadador.nadar();
		
		nadador.envelhecer();
		System.out.println( nadador.idade);
		
		nadador.aposentar();
		System.out.println(nadador.aposentado);
		
	}
}

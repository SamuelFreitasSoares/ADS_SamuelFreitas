package avancado;

import java.util.*;

public class SobreCollection1 {
	
	public static void main(String[] args) {
		
		Collection<String> colecao = buldCollectionImplementation();
		colecao.add("Gato");
		colecao.add("Cachorro");
		colecao.add("Leao");
		colecao.add("Pantera");
		colecao.add("Avestruz");
		
		
		System.out.println(colecao);
	}

	private static Collection<String> buldCollectionImplementation() {
		return new TreeSet<String>();
	}
	
	

}

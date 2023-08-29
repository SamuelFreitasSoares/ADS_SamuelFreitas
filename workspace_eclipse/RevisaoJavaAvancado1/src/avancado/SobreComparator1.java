package avancado;

import java.util.*;

public class SobreComparator1 {
	public static void main(String[] args) {
List<Animal> listaDeAnimais = new ArrayList<>();
		
		listaDeAnimais.add(new Animal(1L, "Tartaruga"));
		listaDeAnimais.add(new Animal(2L, "Coelho"));
		listaDeAnimais.add(new Animal(3L, "Cachorro"));
		listaDeAnimais.add(new Animal(4L, "Gato"));
		listaDeAnimais.add(new Animal(5L, "Girafa"));
		listaDeAnimais.add(new Animal(6L, "Gato"));
		
		System.out.println("Pela ordem do nome: ");
		Collections.sort(listaDeAnimais, new CompararPorNome());
		System.out.println(listaDeAnimais);
		
		System.out.println("Pela ordem de ID: ");
		Collections.sort(listaDeAnimais, new CompararPorID());
		System.out.println(listaDeAnimais);
	}
}
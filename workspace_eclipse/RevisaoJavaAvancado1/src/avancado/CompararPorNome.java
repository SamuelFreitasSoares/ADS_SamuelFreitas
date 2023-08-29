package avancado;

import java.util.*;

public class CompararPorNome implements Comparator<Animal>{
	
	@Override
	public int compare(Animal a1, Animal a2) {
		return a1.getNome().compareTo(a2.getNome());
	}
}

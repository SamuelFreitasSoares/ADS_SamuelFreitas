package avancado;

import java.util.*;

public class SobreComparable1 {
	public static void main(String[] args) {
		List<String> listaDeAlimentos = new ArrayList<String>();
		listaDeAlimentos.add("Damasco");
		listaDeAlimentos.add("Batata");
		listaDeAlimentos.add("Arroz");
		listaDeAlimentos.add("Cenoura");
		
		System.out.println("Pela ordem de insercao: ");
		System.out.println(listaDeAlimentos);
		
		System.out.println(">> Pela Ordem Alfabetica:");
		Collections.sort(listaDeAlimentos);
		System.out.println(listaDeAlimentos);
	}
}

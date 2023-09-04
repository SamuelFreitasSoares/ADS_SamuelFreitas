package avancado;

import java.util.*;

/**
 * A classe SobreSet2 demonstra o uso da interface Set em Java para criar e manipular conjuntos de elementos,
 * onde os elementos são automaticamente ordenados em ordem crescente (neste caso, ordem alfabética) devido
 * ao uso do TreeSet.
 */
public class SobreSet2 {
    public static void main(String[] args) {
        Set<String> setDeFrutas = new TreeSet<>();
        setDeFrutas.add("Laranja");
        setDeFrutas.add("Pera");
        setDeFrutas.add("Manga");
        setDeFrutas.add("Limao");

        System.out.println(setDeFrutas);
    }
}

package avancado;

import java.util.*;

/**
 * A classe SobreSet1 demonstra o uso da interface Set em Java para criar e manipular conjuntos de elementos.
 */
public class SobreSet1 {
    public static void main(String[] args) {
        Set<String> setDeFrutas = new HashSet<>();
        setDeFrutas.add("Laranja");
        setDeFrutas.add("Pera");
        setDeFrutas.add("Manga");
        setDeFrutas.add("Limao");

        System.out.println(setDeFrutas);
    }
}

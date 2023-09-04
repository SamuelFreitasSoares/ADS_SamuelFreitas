package avancado;

import java.util.*;

/**
 * A classe SobreSet3 demonstra o uso da interface Set em Java para criar e manipular conjuntos de elementos,
 * onde os elementos são automaticamente ordenados em ordem crescente (neste caso, ordem natural dos objetos da classe Animal).
 */
public class SobreSet3 {
    public static void main(String[] args) {
        Set<Animal> setDeAnimais = new TreeSet<>();
        setDeAnimais.add(new Animal(1L, "Tartaruga"));
        setDeAnimais.add(new Animal(2L, "Coelho"));
        setDeAnimais.add(new Animal(3L, "Cachorro"));
        setDeAnimais.add(new Animal(4L, "Gato"));
        setDeAnimais.add(new Animal(2L, "Coelho")); // Este elemento será considerado duplicado e não será adicionado

        // Imprime os elementos do conjunto de animais
        setDeAnimais.forEach(System.out::println);
    }
}

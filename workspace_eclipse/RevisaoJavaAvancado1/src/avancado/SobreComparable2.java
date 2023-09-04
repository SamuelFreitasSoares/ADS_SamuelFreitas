package avancado;

import java.util.*;

/**
 * A classe SobreComparable2 demonstra o uso da interface Comparable em Java,
 * permitindo a ordenação de objetos de uma lista com base em critérios definidos.
 */
public class SobreComparable2 {

    /**
     * O método principal que inicia a execução do programa.
     *
     * @param args Os argumentos de linha de comando (não são usados neste exemplo).
     */
    public static void main(String[] args) {
        List<Animal> listaDeAnimais = new ArrayList<>();

        listaDeAnimais.add(new Animal(1L, "Tartaruga"));
        listaDeAnimais.add(new Animal(2L, "Coelho"));
        listaDeAnimais.add(new Animal(3L, "Cachorro"));
        listaDeAnimais.add(new Animal(4L, "Gato"));
        listaDeAnimais.add(new Animal(5L, "Girafa"));
        listaDeAnimais.add(new Animal(6L, "Gato"));

        System.out.println("Pela ordem de inserção");
        System.out.println(listaDeAnimais);

        System.out.println("Pela ordem alfabética do nome do animal: ");
        Collections.sort(listaDeAnimais);
        System.out.println(listaDeAnimais);
    }
}

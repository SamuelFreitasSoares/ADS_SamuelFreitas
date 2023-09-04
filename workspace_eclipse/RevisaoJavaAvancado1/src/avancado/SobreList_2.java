package avancado;

import java.util.*;

/**
 * A classe SobreList_2 demonstra o uso da interface List em Java,
 * que é uma subinterface de Collection, para manipulação de listas de objetos.
 */
public class SobreList_2 {

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

        System.out.println(listaDeAnimais);
    }
}

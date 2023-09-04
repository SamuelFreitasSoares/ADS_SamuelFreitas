package avancado;

import java.util.*;

/**
 * A classe CompararPorNome é uma implementação da interface Comparator
 * que permite comparar objetos da classe Animal com base em seus nomes.
 */
public class CompararPorNome implements Comparator<Animal> {

    /**
     * Compara dois objetos Animal com base em seus nomes.
     *
     * @param a1 O primeiro animal a ser comparado.
     * @param a2 O segundo animal a ser comparado.
     * @return Um valor negativo se a1 for "menor" que a2, um valor positivo se a1 for
     *         "maior" que a2 e 0 se forem iguais.
     */
    @Override
    public int compare(Animal a1, Animal a2) {
        return a1.getNome().compareTo(a2.getNome());
    }
}

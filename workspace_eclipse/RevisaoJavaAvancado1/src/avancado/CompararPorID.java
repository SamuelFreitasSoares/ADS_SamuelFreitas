package avancado;

import java.util.*;

/**
 * A classe CompararPorID é uma implementação da interface Comparator
 * que permite comparar objetos da classe Animal com base em seus IDs.
 */
public class CompararPorID implements Comparator<Animal> {

    /**
     * Compara dois objetos Animal com base em seus IDs.
     *
     * @param a1 O primeiro animal a ser comparado.
     * @param a2 O segundo animal a ser comparado.
     * @return Um valor negativo se a1 for "menor" que a2, um valor positivo se a1 for
     *         "maior" que a2 e 0 se forem iguais.
     */
    @Override
    public int compare(Animal a1, Animal a2) {
        return a1.getId().compareTo(a2.getId());
    }
}

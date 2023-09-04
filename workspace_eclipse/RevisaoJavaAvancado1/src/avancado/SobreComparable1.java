package avancado;

import java.util.*;

/**
 * A classe SobreComparable1 demonstra o uso da interface Comparable em Java
 * para permitir a ordenação de objetos de uma lista com base em critérios definidos.
 */
public class SobreComparable1 {

    /**
     * O método principal que inicia a execução do programa.
     *
     * @param args Os argumentos de linha de comando (não são usados neste exemplo).
     */
    public static void main(String[] args) {
        List<String> listaDeAlimentos = new ArrayList<String>();
        listaDeAlimentos.add("Damasco");
        listaDeAlimentos.add("Batata");
        listaDeAlimentos.add("Arroz");
        listaDeAlimentos.add("Cenoura");

        System.out.println("Pela ordem de inserção: ");
        System.out.println(listaDeAlimentos);

        System.out.println(">> Pela Ordem Alfabética:");
        Collections.sort(listaDeAlimentos);
        System.out.println(listaDeAlimentos);
    }
}

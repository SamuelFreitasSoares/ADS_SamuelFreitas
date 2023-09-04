package avancado;

import java.util.*;

/**
 * A classe SobreList demonstra o uso da interface List em Java,
 * que é uma subinterface de Collection, para manipulação de listas de objetos.
 */
public class SobreList {

    /**
     * O método principal que inicia a execução do programa.
     *
     * @param args Os argumentos de linha de comando (não são usados neste exemplo).
     */
    public static void main(String[] args) {
        List<String> listaDeAlimentos = new ArrayList<String>();

        // Adiciona elementos à lista de alimentos
        listaDeAlimentos.add("Damasco");
        listaDeAlimentos.add("Batata");
        listaDeAlimentos.add("Arroz");
        listaDeAlimentos.add("Cenoura");

        // Exibe a lista de alimentos
        System.out.println(listaDeAlimentos);
    }
}

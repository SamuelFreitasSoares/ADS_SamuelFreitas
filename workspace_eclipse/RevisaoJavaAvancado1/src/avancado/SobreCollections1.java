package avancado;

import java.util.*;

/**
 * A classe SobreCollections1 demonstra o uso da interface Collection em Java para manipular coleções de elementos.
 */
public class SobreCollections1 {
    
    public static void main(String[] args) {
        Collection<String> colecao = buildCollectionImplementation();
        colecao.add("Gato");
        colecao.add("Cachorro");
        colecao.add("Leão");
        colecao.add("Pantera");
        colecao.add("Avestruz");
        
        System.out.println(colecao);
    }
    
    /**
     * Cria e retorna uma implementação de Collection (neste caso, um TreeSet) para armazenar elementos.
     *
     * @return Uma implementação de Collection.
     */
    private static Collection<String> buildCollectionImplementation() {
        return new TreeSet<String>();
    }
}

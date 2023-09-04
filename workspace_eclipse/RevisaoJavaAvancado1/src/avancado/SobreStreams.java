package avancado;

import java.util.*;
import java.util.stream.Collectors;

/**
 * A classe SobreStreams demonstra o uso de Java Streams para filtrar, mapear e reduzir uma lista de produtos.
 */
public class SobreStreams {

    /**
     * O método main é o ponto de entrada para a aplicação de demonstração.
     *
     * @param args Os argumentos de linha de comando fornecidos ao executar o programa.
     */
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(1L, "Cadeira", 100.0));
        produtos.add(new Produto(2L, "Cama", 400.0));
        produtos.add(new Produto(3L, "Mesa", 200.0));
        produtos.add(new Produto(4L, "Sofa", 500.0));
        produtos.add(new Produto(5L, "Cadeira", 150.0));

        // 1. Filter()
        List<Produto> produtosFiltrados = produtos.stream()
                .filter(p -> p.getPreco() > 300.0)
                .collect(Collectors.toList());
        produtosFiltrados.forEach(System.out::println);

        // 2. map()
        List<String> descricoes = produtos.stream()
                .map(Produto::getDescricao)
                .collect(Collectors.toList());
        descricoes.forEach(System.out::println);

        // 3. map() e reduce()
        Double precoTotal = produtos.stream()
                .map(Produto::getPreco)
                .reduce(0.0, Double::sum);
        System.out.println(precoTotal);
    }
}

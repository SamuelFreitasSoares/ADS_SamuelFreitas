package avancado;
import java.util.*;

/**
 * A classe SobreCollections2 demonstra o uso de coleções (Collections) em Java,
 * incluindo manipulação de listas, verificação de vazias, obtenção de tamanho e
 * utilização do método clear().
 */
public class SobreCollections2 {

    /**
     * O método principal que inicia a execução do programa.
     *
     * @param args Os argumentos de linha de comando (não são usados neste exemplo).
     */
    public static void main(String[] args) {
        //1
        Collection<String> engenhariasAtuais = new ArrayList<String>();

        engenhariasAtuais.add("Telecomunicacao");
        engenhariasAtuais.add("Biomedica");
        engenhariasAtuais.add("Computacao");
        engenhariasAtuais.add("Software");
        engenhariasAtuais.add("Producao");

        System.out.println("Engenharias Atuais: " + engenhariasAtuais);

        //2
        Collection<String> engenhariasFuturas = new ArrayList<String>();
        engenhariasFuturas.add("Mecanica");
        engenhariasFuturas.add("Mecatronica");

        System.out.println("Engenharias futuras: " + engenhariasFuturas);

        //3
        Collection<String> todas = new ArrayList<String>();
        todas.addAll(engenhariasFuturas);
        todas.addAll(engenhariasAtuais);

        System.out.println("Todas as Engenharias: " + todas);

        System.out.println("");
        System.out.println(">> Entendendo isEmpty() e size()");

        // construtor sobrecarregado que recebe outra coleção...
        Collection<String> engenharias = new ArrayList<>(todas);

        System.out.println("Engenharias vazias? " + engenharias.isEmpty());
        System.out.println("Qtos elementos engenharias tem? " + engenharias.size());

        System.out.println("");
        System.out.println(">> entendendo Clear()");

        imprimirStatusDaColecao(engenharias);
        System.out.println("...invocando Clear()");
        engenharias.clear();
        imprimirStatusDaColecao(engenharias);
    }

    /**
     * Imprime o estado da coleção de engenharias, indicando se está vazia ou não.
     *
     * @param engenharias A coleção de engenharias a ser verificada.
     */
    private static void imprimirStatusDaColecao(Collection<String> engenharias) {

        // estes 2 testes são equivalentes:
        if(engenharias.isEmpty()) {
            System.out.println("Vazio");
        }else {
            System.out.println("tem elementos");
        }

        if(engenharias.size() == 0) {
            System.out.println("Vazio");
        }else {
            System.out.println("tem elementos");
        }
    }
}

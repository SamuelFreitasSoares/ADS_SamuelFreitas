package esporte;

/**
 * A classe Nadador representa um atleta nadador que estende a classe Atleta.
 */
public class Nadador extends Atleta {

    /**
     * Cria um novo objeto Nadador com o nome, idade, peso e status de aposentado fornecidos.
     *
     * @param name       O nome do nadador.
     * @param idade      A idade do nadador.
     * @param peso       O peso do nadador.
     * @param aposentado O status de aposentado do nadador.
     */
    public Nadador(String name, Integer idade, Integer peso, Boolean aposentado) {
        super(name, idade, peso, aposentado);
    }

    /**
     * Realiza a ação de nadar, característica de um nadador.
     */
    void nadar() {
        System.out.println("Nadador nadando");
    }
}

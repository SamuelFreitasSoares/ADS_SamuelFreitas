package esporte;

/**
 * A classe Corredor representa um atleta corredor que estende a classe Atleta.
 */
public class Corredor extends Atleta {

    /**
     * Cria um novo objeto Corredor com o nome, idade, peso e status de aposentado fornecidos.
     *
     * @param name       O nome do corredor.
     * @param idade      A idade do corredor.
     * @param peso       O peso do corredor.
     * @param aposentado O status de aposentado do corredor.
     */
    public Corredor(String name, Integer idade, Integer peso, Boolean aposentado) {
        super(name, idade, peso, aposentado);
    }

    /**
     * Realiza a ação de correr, característica de um corredor.
     */
    void correr() {
        System.out.println("Corredor correndo");
    }
}

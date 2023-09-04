package esporte;

/**
 * A classe Ciclista representa um atleta ciclista que estende a classe Atleta.
 */
public class Ciclista extends Atleta {

    /**
     * Cria um novo objeto Ciclista com o nome, idade, peso e status de aposentado fornecidos.
     *
     * @param name       O nome do ciclista.
     * @param idade      A idade do ciclista.
     * @param peso       O peso do ciclista.
     * @param aposentado O status de aposentado do ciclista.
     */
    public Ciclista(String name, Integer idade, Integer peso, Boolean aposentado) {
        super(name, idade, peso, aposentado);
    }

    /**
     * Realiza a ação de pedalar, característica de um ciclista.
     */
    void pedalar() {
        System.out.println("Ciclista pedalando");
    }
}

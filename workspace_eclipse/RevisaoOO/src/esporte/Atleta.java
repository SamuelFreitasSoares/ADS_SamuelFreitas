package esporte;

/**
 * A classe Atleta representa um atleta que estende a classe Pessoa e inclui informações como peso e status de aposentado.
 */
public class Atleta extends Pessoa {
    /**
     * O peso do atleta.
     */
    Integer peso;

    /**
     * Indica se o atleta está aposentado.
     */
    Boolean aposentado;

    /**
     * Cria um novo objeto Atleta com o nome, idade, peso e status de aposentado fornecidos.
     *
     * @param name       O nome do atleta.
     * @param idade      A idade do atleta.
     * @param peso       O peso do atleta.
     * @param aposentado O status de aposentado do atleta.
     */
    public Atleta(String name, Integer idade, Integer peso, Boolean aposentado) {
        super(name, idade);
        this.peso = peso;
        this.aposentado = aposentado;
    }

    /**
     * Realiza o aquecimento do atleta.
     */
    void aquecer() {
        System.out.println("Aquecendo");
    }

    /**
     * Define o status de aposentado do atleta como verdadeiro.
     */
    void aposentar() {
        this.aposentado = true;
    }
}

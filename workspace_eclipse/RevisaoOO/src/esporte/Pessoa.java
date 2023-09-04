package esporte;

/**
 * A classe Pessoa representa uma pessoa com nome e idade.
 */
public class Pessoa extends Object {
    /**
     * O nome da pessoa.
     */
    String name;
    
    /**
     * A idade da pessoa.
     */
    Integer idade;

    /**
     * Cria um novo objeto Pessoa com o nome e a idade fornecidos.
     *
     * @param name  O nome da pessoa.
     * @param idade A idade da pessoa.
     */
    public Pessoa(String name, Integer idade) {
        super();
        this.name = name;
        this.idade = idade;
    }

    /**
     * Incrementa a idade da pessoa em um ano, simulando o processo de envelhecimento.
     */
    public void envelhecer() {
        this.idade++;
    }
}

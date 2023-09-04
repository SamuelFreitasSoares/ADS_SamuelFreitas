package cidadania;

/**
 * A classe Pessoa representa uma pessoa com atributos como nome, sexo e idade.
 */
public class Pessoa extends Object {
    /**
     * O nome da pessoa.
     */
    String name;
    
    /**
     * O sexo da pessoa.
     */
    String sex;
    
    /**
     * A idade da pessoa.
     */
    Integer idade;

    /**
     * Cria um novo objeto Pessoa com o nome, sexo e idade fornecidos.
     *
     * @param name  O nome da pessoa.
     * @param sex   O sexo da pessoa.
     * @param idade A idade da pessoa.
     */
    public Pessoa(String name, String sex, Integer idade) {
        super();
        this.name = name;
        this.sex = sex;
        this.idade = idade;
    }

    /**
     * Aumenta a idade da pessoa em um ano.
     */
    public void envelhecer() {
        this.idade++;
    }
}

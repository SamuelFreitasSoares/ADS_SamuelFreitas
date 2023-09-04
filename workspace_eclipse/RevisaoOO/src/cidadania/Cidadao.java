package cidadania;

/**
 * A classe Cidadao representa um cidadão que estende a classe Pessoa e inclui um CPF.
 */
public class Cidadao extends Pessoa {
    /**
     * O CPF do cidadão.
     */
    String cpf;

    /**
     * Cria um novo objeto Cidadao com o nome, sexo, idade e CPF fornecidos.
     *
     * @param name  O nome do cidadão.
     * @param sex   O sexo do cidadão.
     * @param idade A idade do cidadão.
     * @param cpf   O CPF do cidadão.
     */
    public Cidadao(String name, String sex, Integer idade, String cpf) {
        super(name, sex, idade);
        this.cpf = cpf;
    }
}

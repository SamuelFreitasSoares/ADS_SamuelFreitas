package avancado;

import java.util.Objects;

/**
 * A classe Animal representa um animal com um ID e um nome. Ela implementa a interface
 * Comparable para permitir a comparação e ordenação de animais com base em seus nomes.
 */
public class Animal implements Comparable<Animal> {

    private Long id;

    private String nome;

    /**
     * Construtor da classe Animal.
     *
     * @param id   O ID do animal.
     * @param nome O nome do animal.
     */
    public Animal(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    /**
     * Obtém o ID do animal.
     *
     * @return O ID do animal.
     */
    public Long getId() {
        return id;
    }

    /**
     * Obtém o nome do animal.
     *
     * @return O nome do animal.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Compara este animal com outro animal com base em seus nomes.
     *
     * @param that O outro animal a ser comparado.
     * @return Um valor negativo se este animal for "menor" que o outro, um valor positivo se
     *         este animal for "maior" que o outro e 0 se forem iguais.
     */
    @Override
    public int compareTo(Animal that) {
        return this.nome.compareTo(that.nome);
    }

    /**
     * Gera o código hash para o animal com base em seu ID e nome.
     *
     * @return O código hash do animal.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    /**
     * Verifica se este animal é igual a outro objeto com base em seu ID e nome.
     *
     * @param obj O objeto a ser comparado com este animal.
     * @return true se o objeto for igual a este animal, false caso contrário.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Animal other = (Animal) obj;
        return Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
    }
}

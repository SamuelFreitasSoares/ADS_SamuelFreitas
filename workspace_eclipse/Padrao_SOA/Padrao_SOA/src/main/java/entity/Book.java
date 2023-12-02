/**
 * Entidade que representa um livro.
 */
package entity;

import java.util.Objects;

public class Book {

    private Long id;
    private String title;
    private String category;

    /**
     * Construtor para criar uma instância de Book com os parâmetros especificados.
     *
     * @param id       O identificador único do livro.
     * @param title    O título do livro.
     * @param category A categoria à qual o livro pertence.
     */
    public Book(Long id, String title, String category) {
        super();
        this.id = id;
        this.title = title;
        this.category = category;
    }

    /**
     * Obtém o identificador único do livro.
     *
     * @return O identificador único do livro.
     */
    public Long getId() {
        return id;
    }

    /**
     * Define o identificador único do livro.
     *
     * @param id O identificador único a ser definido.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtém o título do livro.
     *
     * @return O título do livro.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define o título do livro.
     *
     * @param title O título a ser definido.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Obtém a categoria à qual o livro pertence.
     *
     * @return A categoria do livro.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Define a categoria à qual o livro pertence.
     *
     * @param category A categoria a ser definida.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Calcula e retorna o código de hash para a entidade Book.
     *
     * @return O código de hash calculado.
     */
    @Override
    public int hashCode() {
        return Objects.hash(category, id, title);
    }

    /**
     * Verifica se esta entidade Book é igual a outra.
     *
     * @param obj O objeto a ser comparado com esta entidade Book.
     * @return true se os objetos são iguais, false caso contrário.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        return Objects.equals(category, other.category) && Objects.equals(id, other.id)
                && Objects.equals(title, other.title);
    }
}

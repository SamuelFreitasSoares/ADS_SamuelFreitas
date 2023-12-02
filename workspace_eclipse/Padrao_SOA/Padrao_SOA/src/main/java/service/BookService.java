/**
 * Serviço responsável por operações relacionadas à entidade Book.
 */
package service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private List<Book> bookList = new ArrayList<>();

    /**
     * Retorna uma lista contendo todos os livros disponíveis.
     *
     * @return Lista de todos os livros.
     */
    public List<Book> findAll() {
        return this.bookList;
    }

    /**
     * Inicializa o serviço adicionando alguns livros à lista durante a construção.
     */
    @PostConstruct
    private void setup() {
        Book b1 = new Book(1L, "Delphin Blanco", "Contos");
        Book b2 = new Book(2L, "Python com Matemática", "Programação");
        Book b3 = new Book(3L, "Cozinha Mineira", "Gastronomia");

        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
    }
}

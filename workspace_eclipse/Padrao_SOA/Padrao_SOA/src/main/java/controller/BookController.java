/**
 * Controlador que manipula solicitações relacionadas ao recurso "book".
 */
package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.BookService;
import model.Book;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService service;

    /**
     * Manipula solicitações HTTP GET para recuperar todos os livros.
     *
     * @return Uma lista contendo todos os livros disponíveis.
     */
    @GetMapping
    public List<Book> getAllBooks() {
        // Obtém todos os livros utilizando o serviço BookService.
        List<Book> allBooks = service.findAll();
        return allBooks;
    }

}

/**
 * Classe principal que inicia a aplicação Spring Boot para o padrão MVC.
 */
package br.inatel.labs.padraomvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PadraoMvcApplication {

    /**
     * Método principal que inicia a aplicação Spring Boot.
     *
     * @param args Argumentos da linha de comando fornecidos durante a inicialização.
     */
    public static void main(String[] args) {
        // Inicia a aplicação Spring Boot com a classe PadraoMvcApplication e os argumentos fornecidos.
        SpringApplication.run(PadraoMvcApplication.class, args);
    }

}

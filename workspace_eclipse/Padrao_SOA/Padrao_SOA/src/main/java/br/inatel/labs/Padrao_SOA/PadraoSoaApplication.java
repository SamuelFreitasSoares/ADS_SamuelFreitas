/**
 * Classe principal que inicia a aplicação Spring Boot para o padrão SOA.
 */
package br.inatel.labs.Padrao_SOA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PadraoSoaApplication {

    /**
     * Método principal que inicia a aplicação Spring Boot.
     *
     * @param args Argumentos da linha de comando fornecidos durante a inicialização.
     */
    public static void main(String[] args) {
        // Inicia a aplicação Spring Boot com a classe PadraoSoaApplication e os argumentos fornecidos.
        SpringApplication.run(PadraoSoaApplication.class, args);
    }

}

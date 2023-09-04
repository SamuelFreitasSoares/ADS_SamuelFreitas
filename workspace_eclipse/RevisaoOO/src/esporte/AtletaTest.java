package esporte;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Testes unitários para as classes Pessoa, Atleta e Nadador no contexto esportivo.
 */
class AtletaTest {

    @Test
    void test() {
        // Cria uma instância da classe Pessoa
        Pessoa Edson = new Pessoa("Edson", 21);
        System.out.println(Edson.name);
        System.out.println(Edson.idade);

        // Cria uma instância da classe Atleta
        Atleta atleta = new Atleta("Edson", 21, 80, false);
        System.out.println(atleta.name);
        System.out.println(atleta.idade);
        System.out.println(atleta.peso);
        System.out.println(atleta.aposentado);
    }

    @Test
    void testarNadador() {
        // Cria uma instância da classe Nadador
        Nadador nadador = new Nadador("Gustavo", 35, 90, false);
        
        // Testa o método nadar da classe Nadador
        nadador.nadar();

        // Testa o método envelhecer da classe Nadador
        nadador.envelhecer();
        System.out.println(nadador.idade);

        // Testa o método aposentar da classe Nadador
        nadador.aposentar();
        System.out.println(nadador.aposentado);
    }
}

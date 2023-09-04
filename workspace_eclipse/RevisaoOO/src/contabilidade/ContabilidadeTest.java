package contabilidade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * Testes unitários para as classes EmpresaMEI e EmpresaSimples no contexto da contabilidade.
 */
public class ContabilidadeTest {

    @Test
    public void testEmpresaMEI() {
        // Cria uma instância da EmpresaMEI com um valor de faturamento
        EmpresaMEI e1 = new EmpresaMEI(1000.00);
        
        // Valores esperados de impostos calculados
        double valorEsperado1 = 275.00;
        double valorEsperado2 = 0.00;
        
        // Verifica se os valores calculados coincidem com os valores esperados
        assertEquals(valorEsperado1, e1.getValorIR(), 2);  // Usar delta para comparar valores de ponto flutuante.
        assertEquals(valorEsperado2, e1.getValorISS(), 2); // Usar delta para comparar valores de ponto flutuante.
    }

    @Test
    public void testEmpresaSimples() {
        // Cria uma instância da EmpresaSimples com um valor de faturamento
        EmpresaSimples e2 = new EmpresaSimples(1000.00);
        
        // Valores esperados de impostos calculados
        double valorEsperado1 = 150.00;
        double valorEsperado2 = 80.00;
        
        // Verifica se os valores calculados coincidem com os valores esperados
        assertEquals(valorEsperado1, e2.getValorIR(), 2);  // Usar delta para comparar valores de ponto flutuante.
        assertEquals(valorEsperado2, e2.getValorISS(), 2); // Usar delta para comparar valores de ponto flutuante.
    }
}

package contabilidade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ContabilidadeTest {
	@Test
	public void testEmpresaMEI() {
		EmpresaMEI e1 = new EmpresaMEI(1000.00);
		double valorEsperado1 = 275.00;
		double valorEsperado2 = 0.00;
		
		assertEquals(valorEsperado1, e1.getValorIR(), 2);
		assertEquals(valorEsperado2, e1.getValorISS(), 2);
	}
	
	@Test
	public void testEmpresaSimples() {
		EmpresaSimples e2 = new EmpresaSimples(1000.00);
		double valorEsperado1 = 150.00;
		double valorEsperado2 = 80.00;
		
		assertEquals(valorEsperado1, e2.getValorIR(), 2);
		assertEquals(valorEsperado2, e2.getValorISS(), 2);
	}
}

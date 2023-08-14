package banco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ContaTest {
	@Test
	public void testeContaCorrente() {
		
		Conta cc = new ContaCorrente();
		cc.depositar(110.00);
		cc.sacar(10.00);
		cc.rentabilizar();
		
		double SaldoAtual = cc.saldo;
		double SaldoEsperado = 101.00;
		
		assertEquals(SaldoAtual, SaldoEsperado);
	}

}

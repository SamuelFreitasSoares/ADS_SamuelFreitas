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
	
	@Test
	public void testPolimorfismo() {
		//Este flag define qual será a instância da Conta
		boolean flagContaCorrenteComoDefault = true;
		
		Conta conta = null;
		if(flagContaCorrenteComoDefault) {
			conta = new ContaCorrente();
		}else {
			conta = new ContaPoupanca();
		}
		
		conta.depositar(1000.00); //Sempre é invocado de Conta
		
		conta.rentabilizar();// Isso pode ser Invocado de ContaCorrente ou ContaPoupanca
		// isso é polimorfismo
		
		System.out.println(conta.getClass().getName());// qual a distancia
		System.out.println(conta.saldo);
	}

}

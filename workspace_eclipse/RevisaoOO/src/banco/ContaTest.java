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

        assertEquals(SaldoEsperado, SaldoAtual, 0.001); // Usar delta para comparar valores de ponto flutuante.
    }

    @Test
    public void testPolimorfismo() {
        // Este flag define qual será a instância da Conta
        boolean flagContaCorrenteComoDefault = true;

        Conta conta = null;
        if (flagContaCorrenteComoDefault) {
            conta = new ContaCorrente();
        } else {
            conta = new ContaPoupanca();
        }

        conta.depositar(1000.00); // Sempre é invocado de Conta

        conta.rentabilizar(); // Isso pode ser invocado de ContaCorrente ou ContaPoupanca
        // Isso é polimorfismo

        System.out.println(conta.getClass().getName()); // qual a classe
        System.out.println(conta.saldo);
    }

    @Test
    public void testContaToString() {
        Conta conta = new ContaCorrente();
        conta.depositar(1000.00);
        conta.sacar(10.00);

        String str = conta.toString();
        System.out.println(str);

        // Aqui você pode adicionar um teste para verificar a string resultante.
        // Por exemplo:
        // assertEquals("Conta: [saldo = 990.0]", str);
    }
}

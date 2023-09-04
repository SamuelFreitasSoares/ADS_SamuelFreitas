package banco;

/**
 * A classe ContaCorrente representa uma conta corrente bancária.
 */
public class ContaCorrente extends Conta {

    /**
     * Calcula a rentabilidade da conta corrente, aumentando o saldo em 1%.
     */
    @Override
    public void rentabilizar() {
        this.saldo *= 1.01;
    }
}

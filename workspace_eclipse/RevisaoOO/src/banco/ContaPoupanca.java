package banco;

/**
 * A classe ContaPoupança representa uma conta poupança bancária.
 */
public class ContaPoupanca extends Conta {

    /**
     * Calcula a rentabilidade da conta poupança, aumentando o saldo em 2%.
     */
    @Override
    public void rentabilizar() {
        this.saldo *= 1.02;
    }
}

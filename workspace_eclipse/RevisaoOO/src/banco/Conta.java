package banco;

/**
 * A classe Conta é uma classe abstrata que representa uma conta bancária genérica.
 */
public abstract class Conta {

    /**
     * Saldo da conta.
     */
    double saldo = 0.00;

    /**
     * Obtém uma representação de string da conta, incluindo o saldo.
     *
     * @return Uma string que representa a conta, incluindo o saldo.
     */
    @Override
    public String toString() {
        return "Conta: [saldo = " + saldo + "]";
    }

    /**
     * Método abstrato para rentabilizar a conta.
     * A implementação deve ser fornecida nas subclasses concretas.
     */
    public abstract void rentabilizar();

    /**
     * Realiza um depósito na conta.
     *
     * @param valor O valor a ser depositado.
     */
    public void depositar(double valor) {
        this.saldo += valor;
    }

    /**
     * Realiza um saque na conta.
     *
     * @param valor O valor a ser sacado.
     */
    public void sacar(double valor) {
        this.saldo -= valor;
    }
}

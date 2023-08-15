package banco;

public abstract class Conta {
	
	double saldo = 0.00;
	
	@Override
	public String toString() {
		return "Conta: [saldo = " + saldo + "]";
	}
	
	public void rentabilizar() {}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	
	

}

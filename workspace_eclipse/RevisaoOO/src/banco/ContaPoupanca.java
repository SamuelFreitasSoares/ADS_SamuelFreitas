package banco;

public class ContaPoupanca extends Conta{
	@Override
	public void rentabilizar() {
		this.saldo *= 1.02;
	}
	

}

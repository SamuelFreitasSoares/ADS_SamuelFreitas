package banco;

public class ContaPoupanca extends Conta{
	@Override
	public void rentabilizar() {
		this.saldo =+ saldo*0.02;
	}
	

}

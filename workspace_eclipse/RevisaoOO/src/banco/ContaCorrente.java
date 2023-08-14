package banco;

public class ContaCorrente extends Conta{
	@Override
	public void rentabilizar() {
		this.saldo += saldo*0.01;	
	}
	
	

}

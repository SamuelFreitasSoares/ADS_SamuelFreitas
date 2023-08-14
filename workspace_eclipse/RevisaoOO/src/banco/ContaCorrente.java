package banco;

public class ContaCorrente extends Conta{
	@Override
	public void rentabilizar() {
		this.saldo *= 1.01;	
	}
	
	

}

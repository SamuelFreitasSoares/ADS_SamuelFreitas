package Builder;

public class Carro {
	private Porta[] portas;
	private Motor motor;
	private ComputadorDeBordo compBordo;
	private FreioABS freio;
	
	
	public Porta[] getPortas() {
		return portas;
	}
	public void setPortas(Porta[] portas) {
		this.portas = portas;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public ComputadorDeBordo getCompBordo() {
		return compBordo;
	}
	public void setCompBordo(ComputadorDeBordo compBordo) {
		this.compBordo = compBordo;
	}
	public FreioABS getFreio() {
		return freio;
	}
	public void setFreio(FreioABS freio) {
		this.freio = freio;
	}
	
	
}

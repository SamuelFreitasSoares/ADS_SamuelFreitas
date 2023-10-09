package Builder;

public class CarroBuilder {
	private Carro carro = new Carro();
	
	public void buildPortas(Porta[] portas) {
		carro.setPortas(portas);
	}
	
	public void buildMotor(Motor m)
	{
		carro.setMotor(m);
	}
	
	public void buildFreioABS(FreioABS freio) {
		carro.setFreio(freio);
	}
	
	public void buildComputadorBordo(ComputadorDeBordo compBordo) {
		carro.setCompBordo(compBordo);
	}
	
	private void validarMotor() {
		if(carro.getMotor() == null) {
			throw new IllegalStateException("Tem motor n fellas");
		}
		
	}

	private void validarPortas() {
		int numP = carro.getPortas().length;
		if(numP != 2 && numP != 4) {
			throw new IllegalStateException("Numero de portas inválido!");
		}
		
	}
	
	public Carro getCarro() {
		validarPortas();
		validarMotor();
		return carro;
	}
	

	
}

package Builder;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CarroBuilderTest {
	@Test
	public void dadosPartesValidas_quandoGetCarro_entaoCarroEhConstruido() {
		// partes validas
		Motor motorVTEC = new Motor();
		Porta portaMotorista = new Porta();
		Porta portaPassageiro = new Porta();
		Porta[] portas = {portaMotorista, portaPassageiro};
		ComputadorDeBordo computadorBordoSiemens = new ComputadorDeBordo();
		FreioABS freio = new FreioABS();
		
		// invocando Builder
		CarroBuilder carroBuilder = new CarroBuilder();
		carroBuilder.buildComputadorBordo(computadorBordoSiemens);
		carroBuilder.buildFreioABS(freio);
		carroBuilder.buildMotor(motorVTEC);
		carroBuilder.buildPortas(portas);
		
		Carro carroPronto = carroBuilder.getCarro();
		
		//asserts...
		assertNotNull(carroPronto);
		assertNotNull(carroPronto.getCompBordo());
		assertNotNull(carroPronto.getFreio());
		assertNotNull(carroPronto.getMotor());
		assertTrue(carroPronto.getPortas().length == 2);
		
	}
}

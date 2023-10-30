package strategy.frete;
import static org.junit.jupiter.api.Assertions.*;
 
import org.junit.jupiter.api.Test;
 
class CalculadoraFreteTest {
 
	@Test
	void deveCalcularFreteParaDHL() {
		CalculadoraFrete calculadoraFrete = new CalculadoraFrete();
		Fretavel fretavel = new ServicoFreteDHL();
		double valorAtual = calculadoraFrete.calcularValor(fretavel, 5.0);
		assertEquals(100, valorAtual);
	}
	@Test
	void deveCalcularFreteParaSedex() {
		CalculadoraFrete calculadoraFrete = new CalculadoraFrete();
		Fretavel fretavel = new ServicoFreteSedex();
		double valorAtual = calculadoraFrete.calcularValor(fretavel, 5.0);
		assertEquals(50, valorAtual);
	}
	@Test
	void deveCalcularFreteParaJadlog() {
		CalculadoraFrete calculadoraFrete = new CalculadoraFrete();
		Fretavel fretavel = new ServicoFreteJadLog();
		double valorAtual = calculadoraFrete.calcularValor(fretavel, 5.0);
		assertEquals(0, valorAtual);
	}
	@Test
	void deveCalcularFreteParaFedEx() {
		CalculadoraFrete calculadoraFrete = new CalculadoraFrete();
		Fretavel fretavel = new ServicoFreteFedEx();
		double valorAtual = calculadoraFrete.calcularValor(fretavel, 5.0);
		assertEquals(0, valorAtual);
	}

//	@Test
//	void deveLancarExceptionParaServicoDesconhecido() {
//		CalculadoraFrete calculadora = new CalculadoraFrete();
//		
//		try {
//		calculadora.calcularValor("zedex", 0);
//		fail ("Devia ter lançado exeption");
//		}
//		catch (RuntimeException e) {
//			
//		}
//		

	}
 
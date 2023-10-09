package Singleton;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class LogManagerTest {
	@Test
	public void dada2Instancias_quandoGetInstance_entaoSeraAMesmaReferencia() {
		
		
		LogManager instance1 = LogManager.getInstance();
		assertNotNull(instance1);
		
		LogManager instance2 = LogManager.getInstance();
		assertNotNull(instance2);
		
		assertEquals(instance1,instance2);
	}
}

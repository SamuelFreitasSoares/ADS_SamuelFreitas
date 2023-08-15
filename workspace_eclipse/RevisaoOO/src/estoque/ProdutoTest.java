package estoque;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class ProdutoTest {
	@Test
	public void testProdutoComoJavaBean() {
		
		Produto p = new Produto();
		p.setDescricao("Queijo Minas 1kg");
		p.setValorCompra(50.00);
		p.setDataValidade( LocalDate.of(2022, Month.DECEMBER, 30));
		
		System.out.println("Dados do produto");
		System.out.println(p.getDescricao());
		System.out.println(p.getValorCompra());
		System.out.println(p.getDataValidade());
	}

}

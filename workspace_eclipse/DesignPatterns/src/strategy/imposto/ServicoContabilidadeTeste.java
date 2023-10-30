package strategy.imposto;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.junit.jupiter.api.Test;
public class ServicoContabilidadeTeste {
	
	@Test
	void deveTotalizarImpostosDaNotaFiscal() {
		NotaFiscal nf = new NotaFiscal(1L,LocalDate.of(2023, Month.OCTOBER, 24),1000.0);
		ReceitaFederal receita = new ReceitaFederal();
		List<Tributavel> impostosVigentes = receita.buscarListaImpostosVigentes();
		ServicoContabilidade servico = new ServicoContabilidade();
		servico.totalizarImpostos(nf, impostosVigentes);
		
	}
}

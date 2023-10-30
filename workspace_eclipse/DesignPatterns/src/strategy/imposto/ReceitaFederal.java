package strategy.imposto;

import java.util.List;

public class ReceitaFederal {
	public List<Tributavel> buscarListaImpostosVigentes(){
		return List.of(
				new ImpostoISS(),
				new ImpostoICMS()
				);
	}
}

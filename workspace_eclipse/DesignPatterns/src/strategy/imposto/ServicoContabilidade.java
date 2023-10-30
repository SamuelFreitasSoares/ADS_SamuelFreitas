package strategy.imposto;

public class ServicoContabilidade {
//	public double totalizarImpostos(NotaFiscal nf, List<Tributavel> ListaImpostosVigentes) {
//		double valorTotalNF = nf.getValorTotal();
//		double impostosTotalizados = 0.0;
//		
//		for(Tributavel tributavel : listaImpostosVigentes) {
//			double impostoCalculado = tributavel.calcularImposto(valorTotalNF);
//			impostosTotalizados += impostoCalculado;
//		}
//		return listaImpostosVigentes.stream().map(t -> t.calcularImposto(valorTotalINF)).reduce(0.00, Double::sum);
//	}
	
	public double totalizarImpostos(NotaFiscal nf, List<Tributavel> ListaImpostosVigentes) {
		double valorTotalNF = nf.getValorTotal();
		double impostosTotalizados = 0.0;
		
		for(Tributavel tributavel : listaImpostosVigentes) {
			double impostoCalculado = tributavel.calcularImposto(valorTotalNF);
			impostosTotalizados += impostoCalculado;
		}
		return impostosTotalizados;
	}
}

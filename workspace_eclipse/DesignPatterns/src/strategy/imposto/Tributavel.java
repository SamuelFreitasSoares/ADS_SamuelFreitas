package strategy.imposto;

public interface Tributavel {
	public double calcularImposto(double calcularValorINF) {
		NotaFiscal nf = new NotaFiscal();
		ImpostoISS iss = new ImpostoISS();
		ImpostoICMS icms = new ImpostoICMS();
		double valorNota = nf.getValorTotal();
		
		
	}
}

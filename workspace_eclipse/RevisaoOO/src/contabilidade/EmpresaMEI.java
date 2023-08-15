package contabilidade;

public class EmpresaMEI implements Tributavel {
	Double faturamentoMensal;
	
	public EmpresaMEI(Double faturamentoMensal) {
		super();
		this.faturamentoMensal = faturamentoMensal;	
	}

	@Override
	public Double getValorIR() {

		return faturamentoMensal*0.275;
	}
	
	@Override
	public Double getValorISS() {

		return faturamentoMensal*0.00;
	}
	
}

package contabilidade;

/**
 * A classe EmpresaMEI representa uma empresa que atua como Microempreendedor Individual (MEI).
 * Implementa a interface Tributavel para calcular impostos.
 */
public class EmpresaMEI implements Tributavel {
    /**
     * O faturamento mensal da empresa MEI.
     */
    Double faturamentoMensal;

    /**
     * Cria uma nova instância da EmpresaMEI com o faturamento mensal fornecido.
     *
     * @param faturamentoMensal O faturamento mensal da empresa MEI.
     */
    public EmpresaMEI(Double faturamentoMensal) {
        super();
        this.faturamentoMensal = faturamentoMensal;
    }

    /**
     * Calcula o valor do Imposto de Renda (IR) para a empresa MEI.
     *
     * @return O valor do Imposto de Renda (IR) calculado.
     */
    @Override
    public Double getValorIR() {
        return faturamentoMensal * 0.275;
    }

    /**
     * Calcula o valor do Imposto sobre Serviços (ISS) para a empresa MEI.
     *
     * @return O valor do Imposto sobre Serviços (ISS) calculado.
     */
    @Override
    public Double getValorISS() {
        return faturamentoMensal * 0.00;
    }
}

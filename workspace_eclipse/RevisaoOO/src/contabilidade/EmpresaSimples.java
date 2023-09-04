package contabilidade;

/**
 * A classe EmpresaSimples representa uma empresa que está no regime tributário Simples.
 * Implementa a interface Tributavel para calcular impostos.
 */
public class EmpresaSimples implements Tributavel {
    /**
     * O faturamento mensal da empresa no regime tributário Simples.
     */
    Double faturamentoMensal;

    /**
     * Cria uma nova instância da EmpresaSimples com o faturamento mensal fornecido.
     *
     * @param faturamentoMensal O faturamento mensal da empresa no regime tributário Simples.
     */
    public EmpresaSimples(Double faturamentoMensal) {
        super();
        this.faturamentoMensal = faturamentoMensal;
    }

    /**
     * Calcula o valor do Imposto de Renda (IR) para a empresa no regime tributário Simples.
     *
     * @return O valor do Imposto de Renda (IR) calculado.
     */
    @Override
    public Double getValorIR() {
        return faturamentoMensal * 0.15;
    }

    /**
     * Calcula o valor do Imposto sobre Serviços (ISS) para a empresa no regime tributário Simples.
     *
     * @return O valor do Imposto sobre Serviços (ISS) calculado.
     */
    @Override
    public Double getValorISS() {
        return faturamentoMensal * 0.08;
    }
}

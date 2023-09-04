package estoque;

import java.time.LocalDate;

/**
 * A classe Produto representa um produto em um sistema de estoque.
 */
public class Produto {
    /**
     * A descrição do produto.
     */
    private String descricao;
    
    /**
     * O valor de compra do produto.
     */
    private double valorCompra;
    
    /**
     * A data de validade do produto.
     */
    private LocalDate dataValidade;

    /**
     * Obtém a descrição do produto.
     *
     * @return A descrição do produto.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do produto.
     *
     * @param descricao A nova descrição do produto.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obtém o valor de compra do produto.
     *
     * @return O valor de compra do produto.
     */
    public double getValorCompra() {
        return valorCompra;
    }

    /**
     * Define o valor de compra do produto.
     *
     * @param valorCompra O novo valor de compra do produto.
     */
    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    /**
     * Obtém a data de validade do produto.
     *
     * @return A data de validade do produto.
     */
    public LocalDate getDataValidade() {
        return dataValidade;
    }

    /**
     * Define a data de validade do produto.
     *
     * @param dataValidade A nova data de validade do produto.
     */
    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    /**
     * Verifica se o produto está na data de validade.
     *
     * @return true se o produto estiver na data de validade, false caso contrário.
     */
    public boolean estaNaValidade() {
        return false;
    }
}

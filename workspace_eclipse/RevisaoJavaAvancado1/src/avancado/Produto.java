package avancado;

/**
 * A classe Produto representa um produto com um ID, descrição e preço.
 */
public class Produto {
    
    private Long id;
    private String descricao;
    private double preco;
    
    /**
     * Construtor da classe Produto.
     *
     * @param id        O ID do produto.
     * @param descricao A descrição do produto.
     * @param preco     O preço do produto.
     */
    public Produto(Long id, String descricao, double preco) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    /**
     * Obtém o ID do produto.
     *
     * @return O ID do produto.
     */
    public Long getId() {
        return id;
    }
    
    /**
     * Define o ID do produto.
     *
     * @param id O novo ID do produto.
     */
    public void setId(Long id) {
        this.id = id;
    }
    
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
     * Obtém o preço do produto.
     *
     * @return O preço do produto.
     */
    public double getPreco() {
        return preco;
    }
    
    /**
     * Define o preço do produto.
     *
     * @param preco O novo preço do produto.
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    /**
     * Retorna uma representação de string do objeto Produto.
     *
     * @return Uma string que contém os atributos do produto.
     */
    @Override
    public String toString() {
        return "Produto [id=" + id + ", descricao=" + descricao + ", preco=" + preco + "]";
    }
}

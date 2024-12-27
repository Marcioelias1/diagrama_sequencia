package descentralizado;

public class LinhadePedido {
     
    private Integer quantidade;
    private Produto produto;

    public LinhadePedido(Produto produto, Integer quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double obterPreco() {
        return produto.getDetalhePreco() * quantidade; 
    }
}

package centralizado;

public class Produto {

    private Double preco;

    public Double obterDetalhesPreco() {
        return preco;
    }

    public Produto(Double preco) {
        this.preco = preco;
    }

}
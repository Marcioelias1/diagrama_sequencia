package centralizado;

public class Cliente {

    private Double percentualDesconto;

    public Double obterInformacaoDeDesconto() {
        return percentualDesconto;
    }

    public Cliente(Double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    
}
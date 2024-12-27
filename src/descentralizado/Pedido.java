package descentralizado;

import java.util.List;

public class Pedido {

    private Cliente cliente;
    private List<LinhadePedido> linhasdePedido;


    public Pedido(Cliente cliente,List<LinhadePedido> linhasdePedido) {
        this.cliente = cliente;
        this.linhasdePedido = linhasdePedido;
        
    }

    public Double calcularPreco(){
        Double precoFinal = 0.0;
        for (LinhadePedido linha : linhasdePedido) {
           precoFinal += linha.obterPreco();
        }
        return cliente.calcularDesconto(precoFinal);
    }
}
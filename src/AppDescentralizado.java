import java.util.*;

import descentralizado.*;

public class AppDescentralizado{

    public static void main(String[] args) {

        Produto produto1 = new Produto(2500.0);
        Produto produto2 = new Produto(7000.0);

        Cliente cliente = new Cliente(50.0);

        LinhadePedido linha1 = new LinhadePedido(produto1, 4);
        LinhadePedido linha2 = new LinhadePedido(produto2, 2);

        Pedido pedido = new Pedido(cliente, Arrays.asList(linha1, linha2));
     

        System.out.println(pedido.calcularPreco());

    }
}

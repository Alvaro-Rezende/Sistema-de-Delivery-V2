import java.util.ArrayList;
import java.util.List;

public class SistemaDelivery {
    private List<Pedido> pedidos = new ArrayList<>();

    public void criarPedido(Cliente c, Restaurante r, double valor) {
        Pedido novoPedido = new Pedido(c, r, valor);
        pedidos.add(novoPedido);
    }

    public void listarPedidos() {
        System.out.println("--- Lista de Pedidos Cadastrados ---");
        for (Pedido p : pedidos) {
            p.exibirPedido();
        }
    }
}
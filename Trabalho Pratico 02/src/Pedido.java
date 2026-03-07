public class Pedido {
    private Cliente cliente;
    private Restaurante restaurante;
    private double valorTotal;

    public Pedido(Cliente cliente, Restaurante restaurante, double valorTotal) {
        this.cliente = cliente;
        this.restaurante = restaurante;
        this.valorTotal = valorTotal;
    }

    public void exibirPedido() {
        System.out.println("Pedido -> Cliente: " + cliente.getNome() +
                " | Restaurante: " + restaurante.getNome() +
                " | Valor: R$ " + valorTotal);
    }
}
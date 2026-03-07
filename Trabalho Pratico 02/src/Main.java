public class Main {
    public static void main(String[] args) {
        SistemaDelivery sistema = new SistemaDelivery();

        // 1. Instanciar Clientes e Restaurantes
        Restaurante r1 = new Restaurante("Pizzaria Dev");
        Restaurante r2 = new Restaurante("Burger Tech");

        Cliente c1 = new Cliente("João Silva", "1199999-8888");
        Cliente c2 = new Cliente("Maria Souza", "1197777-6666");

        // 2. Processar Pedidos
        sistema.criarPedido(c1, r1, 85.50);
        sistema.criarPedido(c2, r2, 42.00);

        // 3. Relatório
        sistema.listarPedidos();
    }
}
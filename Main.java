public class Main {
    public static void main(String[] args) {
        // 1. Criar objetos via construtores
        Cliente c1 = new Cliente("Joao Silva", "35 9999-0001");
        Restaurante r1 = new Restaurante("Burguer King");
        
        // 2. Criar pedidos (ID sera gerado automaticamente via static)
        Pedido p1 = new Pedido(c1, r1, 45.90);
        Pedido p2 = new Pedido(new Cliente("Maria Souza", "35 9999-0002"), r1, 30.00);

        // 3. Teste de validação
        Pedido p3 = new Pedido(c1, r1, -10.0); 

        // 4. Exibir dados
        System.out.println("--- RELATORIO DE PEDIDOS ---");
        exibirPedido(p1);
        exibirPedido(p2);
        exibirPedido(p3);
    }

    public static void exibirPedido(Pedido p) {
        System.out.println("ID: " + p.getId() + 
                           " | Cliente: " + p.getCliente().getNome() + 
                           " | Restaurante: " + p.getRestaurante().getNome() + 
                           " | Total: R$ " + p.getValorTotal());
    }
}
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Criar pelo menos dois Clientes e dois Entregadores
        Cliente c1 = new Cliente("Joao Silva", "35 9999-0001");
        Cliente c2 = new Cliente("Maria Souza", "35 9999-0002");
        
        Entregador e1 = new Entregador("Carlos Motoca", "35 9888-1111", "Moto Honda");
        Entregador e2 = new Entregador("Ana Bike", "35 9888-2222", "Bicicleta");

        // 2. Armazenar em uma lista do tipo genérico Usuario (Polimorfismo)
        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(c1);
        listaUsuarios.add(c2);
        listaUsuarios.add(e1);
        listaUsuarios.add(e2);

        // 3. Chamar o método de descrição a partir das variáveis genéricas
        System.out.println("--- RELATORIO DE USUARIOS (POLIMORFISMO) ---");
        
        for (Usuario u : listaUsuarios) {
            // 4. Executa o método correto automaticamente sem usar IF/ELSE
            u.exibirPerfil(); 
        }

        // --- Mantendo a demonstração de Pedidos da entrega anterior ---
        System.out.println("\n--- RELATORIO DE PEDIDOS ---");
        Restaurante r1 = new Restaurante("Burguer King");
        Pedido p1 = new Pedido(c1, r1, 45.90);
        exibirPedido(p1);
    }

    public static void exibirPedido(Pedido p) {
        System.out.println("ID: " + p.getId() + 
                           " | Cliente: " + p.getCliente().getNome() + 
                           " | Restaurante: " + p.getRestaurante().getNome() + 
                           " | Total: R$ " + p.getValorTotal());
    }
}
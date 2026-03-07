public class Pedido {
    private static int contadorGlobal = 0; // Controle global
    private int id; // ID específico da instância
    private Cliente cliente;
    private Restaurante restaurante;
    private double valorTotal;

    // Construtor: Pedido nasce associado a Cliente e Restaurante
    public Pedido(Cliente cliente, Restaurante restaurante, double valorTotal) {
        // Geração automática de ID
        contadorGlobal++;
        this.id = contadorGlobal;
        
        // Validação de objetos obrigatórios
        if (cliente == null || restaurante == null) {
            throw new IllegalArgumentException("Cliente e Restaurante são obrigatórios.");
        }
        
        this.cliente = cliente;
        this.restaurante = restaurante;
        setValorTotal(valorTotal);
    }

    public int getId() { return id; }
    public Cliente getCliente() { return cliente; }
    public Restaurante getRestaurante() { return restaurante; }
    public double getValorTotal() { return valorTotal; }

    public void setValorTotal(double valorTotal) {
        // Impede valor negativo
        if (valorTotal < 0) {
            System.out.println("Erro: Valor do pedido não pode ser negativo.");
            this.valorTotal = 0.0;
        } else {
            this.valorTotal = valorTotal;
        }
    }
}
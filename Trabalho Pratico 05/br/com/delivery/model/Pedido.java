package br.com.delivery.model;

public class Pedido {
    private static int contador = 0;
    private int id;
    private Cliente cliente;
    private Restaurante restaurante;
    private double valorTotal;

    public Pedido(Cliente cliente, Restaurante restaurante, double valorTotal) {
        this.id = ++contador;
        this.cliente = cliente;
        this.restaurante = restaurante;
        this.valorTotal = valorTotal;
    }

    public int getId() { return id; }
    public Cliente getCliente() { return cliente; }
    public Restaurante getRestaurante() { return restaurante; }
    public double getValorTotal() { return valorTotal; }
}
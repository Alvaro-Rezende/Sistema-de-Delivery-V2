package br.com.delivery.service;

import br.com.delivery.model.Pedido;
import java.util.ArrayList;
import java.util.List;

public class SistemaDelivery {
    private List<Pedido> pedidos = new ArrayList<>();

    public void cadastrarPedido(Pedido p) {
        pedidos.add(p);
    }

    public void listarPedidos() {
        for (Pedido p : pedidos) {
            System.out.println("ID: " + p.getId() + " | Cliente: " + p.getCliente().getNome());
        }
    }
}
package br.com.delivery.service;
public class EntregaMoto implements Entregavel {
    @Override
    public void realizarEntrega() {
        System.out.println("Entrega rapida motorizada.");
    }
}
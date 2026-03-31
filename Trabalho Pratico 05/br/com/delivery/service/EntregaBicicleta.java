package br.com.delivery.service;

public class EntregaBicicleta implements Entregavel { 
    @Override
    public void realizarEntrega() {
        System.out.println(">> Realizando entrega ecologica de bicicleta."); 
    }
}
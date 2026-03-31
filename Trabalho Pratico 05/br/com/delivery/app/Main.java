package br.com.delivery.app;

import br.com.delivery.model.*;
import br.com.delivery.service.*;

public class Main {
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("Carlão", "35 98760-1234");
        
        
        Entregavel entrega = new EntregaMoto(); 

        System.out.println("--- SISTEMA V5 ---");
        System.out.println("Cliente: " + c1.getNome()); 
        
        
        acionarEntrega(entrega);
    }

    
    public static void acionarEntrega(Entregavel estrategia) {
        estrategia.realizarEntrega(); 
    }
}
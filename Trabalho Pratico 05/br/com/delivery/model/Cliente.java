package br.com.delivery.model;
public class Cliente extends Usuario {
    public Cliente(String nome, String telefone) {
        super(nome, telefone);
    }
    @Override
    public void exibirPerfil() {
        System.out.println("Cliente: " + getNome());
    }
}
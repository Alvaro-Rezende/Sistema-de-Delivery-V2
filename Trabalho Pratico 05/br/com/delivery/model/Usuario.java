package br.com.delivery.model;

public abstract class Usuario { 
    private String nome;
    private String telefone;

    public Usuario(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public abstract void exibirPerfil(); 

    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }
}
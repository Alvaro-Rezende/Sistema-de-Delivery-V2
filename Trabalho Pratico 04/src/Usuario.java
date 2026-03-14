public class Usuario {
    private String nome;
    private String telefone;

    public Usuario(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Método que será sobrescrito pelas subclasses (Polimorfismo)
    public void exibirPerfil() {
        System.out.println("Nome: " + nome + " | Tel: " + telefone);
    }

    // Getters para que as classes filhas possam acessar os dados privados
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}
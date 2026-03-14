public class Cliente extends Usuario {

    public Cliente(String nome, String telefone) {
        super(nome, telefone); // Envia os dados para o construtor de Usuario
    }

    @Override
    public void exibirPerfil() {
        // Agora o gets funciona porque existe na classe Usuario
        System.out.println("[PERFIL CLIENTE] Nome: " + getNome() + " | Contato: " + getTelefone());
    }
}
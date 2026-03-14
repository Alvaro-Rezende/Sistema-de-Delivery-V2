public class Entregador extends Usuario {
    private String veiculo;

    public Entregador(String nome, String telefone, String veiculo) {
        super(nome, telefone);
        this.veiculo = veiculo;
    }

    @Override
    public void exibirPerfil() {
        System.out.println("[PERFIL ENTREGADOR] Nome: " + getNome() + " | Veiculo: " + veiculo);
    }
}
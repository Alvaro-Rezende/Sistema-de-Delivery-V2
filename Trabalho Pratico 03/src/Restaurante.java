public class Restaurante {
    private String nome;

    public Restaurante(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Erro: Nome do restaurante inválido.");
            this.nome = "Restaurante Padrão";
        } else {
            this.nome = nome;
        }
    }
}
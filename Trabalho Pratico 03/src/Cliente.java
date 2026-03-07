public class Cliente {
    private String nome;
    private String telefone;

    public Cliente(String nome, String telefone) {
        setNome(nome); // Validação de dados
        setTelefone(telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        // Validação: Nome não pode ser vazio
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Erro: Nome do cliente nao pode ser vazio.");
            this.nome = "Cliente Indefinido";
        } else {
            this.nome = nome;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = (telefone == null) ? "Sem Telefone" : telefone;
    }

    public void exibirInformacoes() {
        System.out.println("Cliente: " + nome + " | Telefone: " + telefone);
    }
}
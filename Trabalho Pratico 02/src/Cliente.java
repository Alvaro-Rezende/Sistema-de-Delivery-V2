public class Cliente {
    private String nome;
    private String telefone;

    public Cliente(String nome, String telefone) {
        setNome(nome);
        setTelefone(telefone);
    }

    public void exibirInformacoes() {
        System.out.println("Cliente: " + nome + " | Telefone: " + telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        // O nome do cliente não pode ser vazio [cite: 20]
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Erro: Nome do cliente não pode ser vazio.");
            this.nome = "Nome Inválido";
        } else {
            this.nome = nome;
        }
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        if(telefone == null || telefone.trim().isEmpty()){
            this.telefone = "Sem Telefone";
        }else {
            this.telefone = telefone;
        }

    }

    public void exibirInformacoes() {
        System.out.println("Cliente: " + nome + " | Telefone: " + telefone);
    }
}
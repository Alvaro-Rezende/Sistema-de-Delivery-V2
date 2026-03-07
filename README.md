📝 Sistema de Gerenciamento de Delivery Local - Entrega 3
Este repositório contém a terceira etapa do trabalho prático de Análise e Desenvolvimento de Sistemas.  
O projeto foi migrado para este novo repositório devido a ajustes de ambiente (migração do IntelliJ para o VS Code).

🚀 O que mudou nesta entrega?
Diferente das etapas anteriores onde o foco era apenas funcionalidade, esta fase foca na qualidade, segurança e robustez do código.
As principais implementações foram baseadas nos 4 pilares solicitados:
Encapsulamento: Todos os atributos (como nome, telefone e preço) foram definidos como private. O acesso agora é exclusivo via Getters e Setters.
Construtores: Os objetos agora são instanciados com dados obrigatórios, garantindo que nenhum objeto nasça em estado inválido (ex: um Restaurante sem nome).
Validação de Dados (Invariantes): Implementamos regras para impedir nomes vazios e valores de pedidos negativos.
Membros Estáticos (static): A classe Pedido agora gera um ID único e automático para cada nova instância, utilizando um contador global de classe.

📂 Estrutura de Arquivos
Cliente.java: Gerencia os dados do cliente com validação de nome.
Restaurante.java: Gerencia os dados do restaurante.
Pedido.java: Gerencia o pedido, ID automático e associações.
Main.java: Ponto de entrada que demonstra a criação de objetos e as validações.

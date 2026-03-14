SISTEMA DE GERENCIAMENTO DE DELIVERY LOCAL - ENTREGA 4
RELATÓRIO DE HIERARQUIA E POLIMORFISMO

Esta entrega foca na evolução da arquitetura do sistema através da 
orientação a objetos avançada, eliminando a duplicação de código e 
tornando o software mais flexível.

1. CLASSE BASE: USUÁRIO
-----------------------
* Criamos a classe genérica 'Usuario' para centralizar atributos comuns 
  como Nome e Telefone
* Definimos o método base 'exibirPerfil()' que serve como contrato para 
  a sobrescrita polimórfica

2. HIERARQUIA DE CLASSES
----------------------------------
* As classes 'Cliente' e 'Entregador' foram refatoradas para herdar de 
  'Usuario' utilizando a palavra-chave 'extends'
* 'Cliente': Representa o ator que realiza os pedidos
* 'Entregador': Novo ator adicionado para representar quem realiza as 
  entregas, contendo o atributo específico de 'veiculo'

3. SOBRESCRITA DE MÉTODOS (@OVERRIDE)
-------------------------------------
* Ambas as subclasses sobrescreveram o método 'exibirPerfil()', 
  proporcionando comportamentos distintos e personalizados para cada 
  tipo de usuário

4. POLIMORFISMO
---------------------------------------
* O sistema agora manipula objetos de forma genérica. Na classe Main, 
  clientes e entregadores são armazenados em uma lista do tipo 'Usuario'
* Implementamos a chamada do método de descrição sem o uso de estruturas 
  condicionais (IF/ELSE)
* O Java identifica automaticamente qual versão do método executar em 
  tempo de execução, garantindo a flexibilidade do sistema

5. RESULTADOS ALCANÇADOS
------------------------
* Redução de código redundante.
* Cumprimento total dos requisitos de modelagem de tipos.
* Sistema preparado para receber novos tipos de usuários sem alteração 
  na lógica principal de exibição.

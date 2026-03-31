SISTEMA DE DELIVERY - ENTREGA 5: ABSTRAÇÃO E DESACOPLAMENTO

1. PACOTES: Código organizado em 'model' (entidades), 
   'service' (lógica/interfaces) e 'app' (execução).

2. ABSTRAÇÃO: Classe Usuario definida como abstract, servindo 
   apenas como base para Cliente e Entregador.

3. INTERFACE: Implementação da interface 'Entregavel' para 
   padronizar o comportamento de entrega do sistema.

4. POLIMORFISMO: O método 'acionarEntrega' na Main utiliza 
   referências genéricas da interface, permitindo trocar o 
   meio de transporte (Moto/Bike) sem alterar a lógica principal.

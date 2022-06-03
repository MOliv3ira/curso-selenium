# language: pt
# charset: UTF-8

Funcionalidade: Testar a plataforma de testes Bora Testar

  @001
  Cenario: Digite um texto e clique em enviar mensagem
    Dado que o usuario esta no sistema Bora Testar
    Quando o usuario escolhe o menu Iniciante
    E o usuario clica em Iniciar
    E o usuario preenche o campo "texto" com "Bora testar pessoal"
    E o usuario clica em enviar mensagem
    E o usuário deveria ver a mensagem "Mensagem enviada com Sucesso."
    Entao o usuario clica em validar

  @002
  Cenario: Realizar login no website preenchendo dados válidos
    Dado que o usuario esta no sistema Bora Testar
    Quando o usuario escolhe o menu Iniciante
    E o usuario clica em Iniciar
    E o usuario preenche o campo "texto" com "Bora testar pessoal"
    E o usuario clica em enviar mensagem
    E o usuario clica em validar
    E o usuario clica em Iniciar
    E o usuario preenche o campo "email" com "iniciante@boratestarqa.com.br" no teste dois
    E o usuario preenche o campo "senha" com "Teste@02" no teste dois
    E o usuario clica em Entrar
    E o usuário deveria ver a mensagem "Login Realizado." no teste dois
    Entao o usuario clica em validar

  @003
  Cenario: Marcar todos os items da lista
    Dado que o usuario esta no sistema Bora Testar
    Quando o usuario escolhe o menu Iniciante
    E o usuario clica em Iniciar
    E o usuario preenche o campo "texto" com "Bora testar pessoal"
    E o usuario clica em enviar mensagem
    E o usuario clica em validar
    E o usuario clica em Iniciar
    E o usuario preenche o campo "email" com "iniciante@boratestarqa.com.br" no teste dois
    E o usuario preenche o campo "senha" com "Teste@02" no teste dois
    E o usuario clica em Entrar
    E o usuario clica em validar
    E o usuario clica em Iniciar
    E o usuario deve marcar todos os items da lista
    E o usuario clica em Comprar
    E o usuário deveria ver a mensagem "Compra realizada com Sucesso." no teste três
    Entao o usuario clica em validar

  @004
  Cenario: Selecione qualquer ferramenta disponivel no menu
    Dado que o usuario esta no sistema Bora Testar
    Quando o usuario escolhe o menu Iniciante
    E o usuario clica em Iniciar
    E o usuario preenche o campo "texto" com "Bora testar pessoal"
    E o usuario clica em enviar mensagem
    E o usuario clica em validar
    E o usuario clica em Iniciar
    E o usuario preenche o campo "email" com "iniciante@boratestarqa.com.br" no teste dois
    E o usuario preenche o campo "senha" com "Teste@02" no teste dois
    E o usuario clica em Entrar
    E o usuario clica em validar
    E o usuario clica em Iniciar
    E o usuario deve marcar todos os items da lista
    E o usuario clica em Comprar
    E o usuário deveria ver a mensagem "Compra realizada com Sucesso." no teste três
    E o usuario clica em validar
    E o usuario clica em Iniciar
    E seleciona uma ferramenta disponivel no menu
    E o usuário deveria ver a mensagem "FERRAMENTA SELECIONADA!" no teste quatro
    Entao o usuario clica em validar

  @005
  Cenario: Gerar e validar número aleatório gerado
    Dado que o usuario esta no sistema Bora Testar
    Quando o usuario escolhe o menu Iniciante
    E o usuario clica em Iniciar
    E o usuario preenche o campo "texto" com "Bora testar pessoal"
    E o usuario clica em enviar mensagem
    E o usuario clica em validar
    E o usuario clica em Iniciar
    E o usuario preenche o campo "email" com "iniciante@boratestarqa.com.br" no teste dois
    E o usuario preenche o campo "senha" com "Teste@02" no teste dois
    E o usuario clica em Entrar
    E o usuario clica em validar
    E o usuario clica em Iniciar
    E o usuario deve marcar todos os items da lista
    E o usuario clica em Comprar
    E o usuário deveria ver a mensagem "Compra realizada com Sucesso." no teste três
    E o usuario clica em validar
    E o usuario clica em Iniciar
    E seleciona uma ferramenta disponivel no menu
    E o usuario clica em validar
    E o usuario clica em Iniciar
    E o usuario clica em gerar numero
    E usuario confirma se numero é par
    E o usuário deveria ver a mensagem "NUMERO PAR!" no teste cinco
    Entao o usuario clica em validar











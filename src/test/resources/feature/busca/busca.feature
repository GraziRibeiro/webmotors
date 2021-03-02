#language: pt
# author: Graziela Sousa

Funcionalidade: Load

  @BuscaWebMotor
  Cenario: Validar o campo de busca
    Dado que estou na tela inicial do sistema
    Quando preencho o campo <Busca>
    E clico na <Opcao>
    Entao volto para home

  Cenario: Validar o campo de busca no resultado
    Dado que estou na tela inicial do sistema
    Quando clico no botao <Ver Ofertas>
    E clico no Botão <Honda>
    E clico no botao <Todos os modelos>
    E clico no modelo <CITY>
    E clico no botao <Todas as versoes>
    E seleciono uma versao
    Então volto para home





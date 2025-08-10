Feature: Obter informações gerais ou específicas de raças de cachorros
  Como usuário, desejo obter informações disponíveis sobre as raças de cachorros da The Dog API

  Background:
    Given que a API está disponível

  @regressão @positivo
  Scenario: Solicitar todas as raças de cachorros
    When eu faço uma consulta de todas as raças de cachorros
    Then devem ser exibidas as informações dos cachorros por raça
Feature: Criar, consultar ou deletar favoritos, podendo listar ou votar em seus favoritos
  Como usuário, desejo criar um favorito, podendo excluir ou consultá-lo.
  Também desejo consultar e votar em meus ou outros favoritos existentes.

  Background:
    Given que a API está disponível

  @regressão @positivo
  Scenario: Listar favoritos existentes
    When eu faço uma consulta de favoritos
    Then uma lista de imagens favoritas deve ser retornada com sucesso
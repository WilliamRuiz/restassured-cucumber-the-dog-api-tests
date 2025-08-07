Feature: Obter imagens aleatórias de cachorros
  Como usuário, desejo obter imagens aleatória através da consulta disponibilizada via API

  Background:
    Given que a API está disponível

  @regressão @positivo
  Scenario: Solicitar uma imagem aleatória de cachorro
    When eu faço uma consulta de imagem aleatória
    Then uma imagem aleatória deve ser retornada com sucesso
# 🐾 API Testing com Rest Assured + Cucumber | The Dog API

Este repositório contém testes automatizados da [The Dog API](https://thedogapi.com/) usando Java, Rest Assured e Cucumber, seguindo boas práticas de automação e BDD.

## 📌 Objetivo

Validar os principais endpoints da The Dog API utilizando uma abordagem BDD com testes legíveis e estruturados.

## ⚙️ Tecnologias e Ferramentas

- 💻 Java 17+
- ☕ Maven
- 🧪 [Rest Assured](https://rest-assured.io/) — para testes HTTP RESTful
- 🌿 [Cucumber](https://cucumber.io/) — para escrita dos cenários de teste em Gherkin
- 🧰 JUnit — como test runner
- 📦 [The Dog API](https://thedogapi.com/) — API pública para dados de raças de cães

## Grupos
Se você executar `mvn test`, todos os testes serão executados como padrão.

Para executar diferentes grupos ou suítes de testes, você pode usar a propriedade `-D`, incluindo o nome do grupo. Veja alguns exemplos:

| run | command |
|-----|---------|
| login tests | ```mvn -Dgroups="login" test``` |
| user tests | ```mvn -Dgroups="user" test``` |
| all tests | ```mvn test``` |

Recomendo executar inicialmente ```mvn clean install``` para preparar o ambiente.

## Grupos + Reports

Para gerar reports de testes automaticamente você pode usar o Allure, via linha de comando:

* `mvn allure:serve`: Irá abrir HTML reports no browser
* `mvn allure:report`: Irá abrir uma porta HTML a partir da pasta target/site/allure-maven-plugin

## 📂 Estrutura do Projeto

```bash
src
└── test
    └── java
        ├── steps/              # Definição dos steps do Cucumber
        ├── runners/            # Classe de execução dos testes
        └── utils/              # Utilitários para suporte aos testes
    └── resources
        └── features/           # Arquivos .feature com os cenários BDD
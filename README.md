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
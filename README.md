<h1 align='center'> API de Citações </h1>

<p align='center'>Esta é uma API que gerencia citações de autores entregando ao usuário o nome do autor e a sua respectiva citação.</p>

<div align='center'>
  <a href="https://docs.oracle.com/en/java/" target="_blank">
      <img src="./img/java-logo.png" width="150" height="150" />
  </a>

  <a href="https://maven.apache.org/" target="_blank">
      <img src="./img/Apache_Maven_logo.svg" width="150" height="150" />
  </a>

  <a href="https://spring.io/projects/spring-boot" target="_blank">
      <img src="./img/Spring_Boot.svg" width="150" height="150" />
  </a>
</div>

## 🔧 Ferramentas

-   Java: é uma linguagem de programação de propósito geral, orientada a objetos, conhecida por sua portabilidade e robustez. É amplamente usada para desenvolvimento web, aplicações corporativas e aplicativos móveis.
-   Maven: é uma ferramenta de gerenciamento de projetos para Java. Ela facilita a construção, dependências e organização de projetos, permitindo automatizar compilação, testes e empacotamento de aplicações.
-   SpringBoot Rest Framework: é um framework baseado em Spring que simplifica a criação de aplicações Java. Ele fornece configuração automática, servidores embutidos e estrutura pronta para desenvolvimento rápido de APIs e microserviços.

## 📍 Endpoints

- `GET /api/v1/quotes`: Retorna a lista de todos as citações.
- `POST /api/v1/quote/`: Cria uma nova citação com nome do autor e o texto.
- `PATCH /api/v1/quote/{id}/`: Altera especificamente o nome do autor ou texto.
- `DELETE /api/v1/quote/{id}/`: Exclui os dados de uma citação específica.

## 📄 Modelos de Dados

- `Livro`:
  - `id` (campo automático): O identificador único do livro.
  - `authorName` (string): Nome do autor do livro.
  - `quoteText` (string): Texto da citação do autor.

## ⚙️ Uso da API

A API pode ser usada para:

- Listar todas as citações no catálogo.
- Adicionar um novo autor e citação ao catálogo.
- Atualizar informações específicas `authorName` ou `quoteText` de um autor existente.
- Excluir os dados de um autor com base no seu ID.

## 💻 Como Executar o Projeto

Siga estas etapas para configurar e executar a API em seu ambiente:

1. Clone este repositório:

  ```shell
  git clone https://seurepositorio.git
  ```
2. Navegue até o diretório do projeto:

  ```shell
  cd nomedoprojeto/
  ```
3. Instale as depêndencias com o Maven:

  ```shell
    mvn package
  ```
4. Rode a API:

  ```shell
  mvn spring-boot:run
  ```

A API estará acessível em http://localhost:8080/.

## 🙏 Contribuição:

Contribuições são bem-vindas! Você pode:
- Abrir issues para relatar problemas ou melhorias.
- Enviar pull requests com novas funcionalidades ou correções.
- Dar feedback sobre a aplicação.
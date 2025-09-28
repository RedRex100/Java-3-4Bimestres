# Java-3-4Bimestres
📖 Sobre
Aplicação de gerenciamento de tarefas (To-Do List) projetada para ajudar usuários a organizar suas atividades diárias, aumentar a produtividade e nunca mais perder um prazo.

Este projeto está sendo desenvolvido como requisito de avaliação para a disciplina de Laboratório de Programação 2 (LBP2) do IFSP. O objetivo é aplicar os conceitos de desenvolvimento back-end com Java e Spring Boot e front-end com um framework SPA, criando uma aplicação completa e funcional.

## 👥 Equipe

| Nome Completo | Prontuário |
| :--- | :--- | 
| Bruno Timóteo Silva             | SP3116042| 
| Fernando Pereira Felipe Duarte  | SP311872X|  
| João Pedro de Almeida Martins   | SP3115933|
| Kaio Damasceno de Oliveira      | SP3124517|
| Matheus Barbosa Silva           | SP311659X|

Funcionalidades Entregues (3º Bimestre)
🔐 Sistema de Autenticação: Implementação de um sistema seguro de cadastro e login de usuários.

🛡️ Segurança de Rotas: Páginas da aplicação são protegidas, exigindo que o usuário esteja autenticado para acessá-las.

🔑 Criptografia de Senhas: As senhas dos usuários são armazenadas no banco de dados de forma segura utilizando o algoritmo BCrypt.

🚀 Configuração e Execução
Siga as instruções abaixo para configurar e executar o projeto em seu ambiente de desenvolvimento.

Pré-requisitos
Antes de começar, certifique-se de que você tem os seguintes softwares instalados:

Java JDK 17: A aplicação foi desenvolvida utilizando a versão 17 do Java.

Maven: Para gerenciamento das dependências do projeto.

Git: Para clonar o repositório.

Uma IDE de sua preferência: IntelliJ IDEA, VS Code com o pacote de extensões para Java, ou Eclipse.

Passos para Instalação
Clone o repositório:

git clone [https://github.com/seu-usuario/seu-repositorio.git](https://github.com/seu-usuario/seu-repositorio.git)
cd seu-repositorio

Abra o projeto na sua IDE:

Abra a sua IDE e importe o projeto que você acabou de clonar.

A IDE deve reconhecer o arquivo pom.xml e baixar automaticamente todas as dependências do Maven. Caso isso не aconteça, procure a opção "Reload Maven Project" na sua IDE.

Configure o JDK do Projeto:

Certifique-se de que a IDE está configurada para usar o JDK 17 para este projeto. Geralmente, isso pode ser ajustado em File > Project Structure... > Project SDK.

Executando a Aplicação
Encontre a classe principal: Navegue até src/main/java/com/Projeto_3_4bim/todolist/JavaTodolistApplication.java.

Execute o projeto: Clique com o botão direito do mouse sobre o arquivo JavaTodolistApplication.java e selecione a opção "Run".

Acesse no navegador: Após o servidor iniciar (você verá uma mensagem no console indicando "Tomcat started on port 8080"), abra seu navegador e acesse a URL:

http://localhost:8080

Banco de Dados
A aplicação utiliza um banco de dados SQLite.

O arquivo do banco, chamado todolist.db, será criado automaticamente na pasta raiz do projeto (ou no diretório de trabalho da IDE) na primeira vez que você executar a aplicação e registrar um usuário.

Para visualizar os dados (e confirmar que os usuários estão sendo salvos), você pode utilizar uma ferramenta gratuita como o DB Browser for SQLite.

🛠️ Tecnologias Utilizadas (3º Bimestre)
Back-end: Java 17, Spring Boot, Spring Security, Spring Data JPA/Hibernate

Front-end: Thymeleaf, HTML 5, CSS 3 (Bootstrap 5)

Banco de Dados: SQLite

Ferramentas: Git, GitHub, Maven

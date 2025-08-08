### Registro de Estudos
Aplicação web para registrar, gerenciar e editar anotações de estudos com editor de texto rico e autenticação de usuários.

## Tecnologias Utilizadas
- Java 17+

- Spring Boot

- Spring Web

- Spring Security

- Spring Data JPA

- Thymeleaf – Motor de templates para renderizar HTML no backend

- Tailwind CSS – Estilização responsiva e moderna

- Banco de dados – H2 (ou outro configurado no application.properties)]

  

## Funcionalidades
- Cadastro de estudos com título e anotações ricas

- Listagem e edição dos registros existentes

- Exclusão de registros

- Interface estilizada e responsiva com Tailwind CSS

- Autenticação de usuários com Spring Security

- Proteção de rotas para que apenas usuários logados acessem a aplicação

- Logout seguro com redirecionamento para tela de login

## Fluxo da Aplicação
- Usuário acessa a aplicação → é redirecionado para /login

- Faz login com email e senha

- Após autenticação, é levado para a tela de Registro de Estudos

- Pode criar, listar, editar e excluir estudos

- Pode fazer logout a qualquer momento

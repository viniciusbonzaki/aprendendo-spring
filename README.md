# aprendendo-spring

Uma API REST desenvolvida com Java 17 e Spring Boot com o objetivo de explorar os principais conceitos fundamentais do desenvolvimento Backend como por exemplo operações HTTP, persistência de dados com PostgreSQL, organização em camadas e autenticação utilizando Spring Security e JSON Web Token (JWT).

O projeto possui a finalidade de buscar consolidar os conhecimentos iniciais do ecossistema Spring por meio da implementação de funcionalidades de gerenciamento de usuários.

## 🎯 Objetivos

- Compreender os fundamentos do Spring Boot.
- Desenvolver uma API REST utilizando Java.
- Aplicar a separação de responsabilidades em camadas.
- Implementar operações de gerenciamento de usuários.
- Integrar a aplicação a um banco de dados PostgreSQL.
- Explorar os mecanismos de autenticação e segurança do Spring Security.
- Conhecer o funcionamento da autenticação baseada em JWT.

## 🛠️ Tecnologias utilizadas

- **Java 17** — linguagem de programação.
- **Spring Boot** — desenvolvimento da aplicação backend.
- **Maven** — gerenciamento de dependências e build.
- **PostgreSQL** — banco de dados relacional.
- **Spring Security** — configuração dos mecanismos de segurança.
- **JWT (JSON Web Token)** — autenticação baseada em tokens.

## 📂 Arquitetura e organização do projeto

O projeto está organizado em camadas, buscando separar as responsabilidades relacionadas às requisições HTTP, às regras de negócio, à persistência de dados e à segurança da aplicação.

### Business

Camada destinada à implementação das regras de negócio e dos serviços da aplicação.

- `UsuarioService` — serviço responsável pelas operações relacionadas aos usuários.

### Infrastructure

Camada que reúne componentes de infraestrutura, persistência de dados, tratamento de exceções e segurança.

**Entidades**

- `Usuario`
- `Telefone`
- `Endereco`

**Repositórios**

- `UsuarioRepository`
- `TelefoneRepository`
- `EnderecoRepository`

**Segurança**

- `SecurityConfig`
- `JwtUtil`
- `JwtRequestFilter`
- `UserDetailsServiceImpl`

**Exceções**
- `ConflictException`
- `ResourceNotFoundException`

### Controller

Camada responsável por disponibilizar os endpoints REST e receber as requisições HTTP.

- `UsuarioController` — controlador das operações relacionadas aos usuários.
- **DTOs** — objetos utilizados para transportar dados entre as requisições e a aplicação.

## 🗃️ Modelagem de dados

A aplicação possui três entidades principais:

- **Usuario:** representa o usuário gerenciado pela API.
- **Telefone:** representa as informações de telefone associadas ao usuário.
- **Endereco:** representa as informações de endereço associadas ao usuário.

## 🔐 Autenticação e segurança

A aplicação utiliza Spring Security e JWT para implementar autenticação baseada em tokens.

Os componentes de segurança incluem:

- **`SecurityConfig`:** configuração das regras de segurança da aplicação.
- **`JwtUtil`:** utilitário relacionado às operações com tokens JWT.
- **`JwtRequestFilter`:** filtro utilizado no fluxo de autenticação das requisições.
- **`UserDetailsServiceImpl`:** implementação do serviço de recuperação dos dados do usuário para o Spring Security.

## 🌐 Endpoints da API

A API disponibiliza operações para cadastro, autenticação, consulta e exclusão de usuários.

| Método HTTP | Operação | Descrição |
|---|---|---|
| `POST` | Cadastro de usuário | Adiciona um usuário. |
| `POST` | Login | Realiza a autenticação de um usuário e retorna o Token de acesso. |
| `GET` | Consulta de usuário | Recupera os dados de um usuário. |
| `DELETE` | Exclusão de usuário | Remove um usuário. |

## ⚙️ Configuração do ambiente

### Pré-requisitos

- Java Development Kit (JDK) 17.
- Maven.
- PostgreSQL.
- Configuração das propriedades de conexão com o banco de dados.

### Banco de dados

A aplicação utiliza PostgreSQL para persistência dos dados.

Configure as propriedades de conexão no arquivo `application.properties`, conforme utilizado no projeto.

## 🚀 Como executar o projeto

As instruções definitivas serão adicionadas após a verificação da configuração do Maven, das propriedades da aplicação e da inicialização do banco de dados.

De forma geral, a execução envolve:

1. Clonar o repositório.
2. Configurar o PostgreSQL.
3. Configurar as propriedades da aplicação.
4. Compilar e executar a aplicação com Maven.

## 📚 Aprendizados

O projeto permite explorar conceitos fundamentais do desenvolvimento backend com Java e Spring Boot, incluindo:

- Construção de APIs REST.
- Separação de responsabilidades em camadas.
- Persistência de dados com PostgreSQL.
- Organização de entidades e repositórios.
- Implementação de operações de gerenciamento de usuários.
- Fundamentos de autenticação e segurança com Spring Security e JWT.

## 📌 Contexto do projeto

Projeto de caráter educacional desenvolvido para consolidar conhecimentos iniciais em Java, Spring Boot e desenvolvimento de APIs REST.

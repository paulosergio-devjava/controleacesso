# Sistema de Gerenciamento de Usuários e Perfis - Backend

Este é o backend do sistema de gerenciamento de usuários e perfis, desenvolvido com **Spring Boot**. Ele fornece APIs para criar, editar, listar e deletar usuários e perfis, além de atribuir perfis aos usuários.

## Funcionalidades

- **Gerenciamento de Usuários**: CRUD (Criar, Ler, Atualizar, Deletar) de usuários.
- **Gerenciamento de Perfis**: CRUD de perfis.
- **Atribuição de Perfis a Usuários**: Relaciona um perfil a um usuário.
- **Autenticação Simples**: Acesso com base em nome de usuário e senha (simples, sem autenticação OAuth ou JWT).

## Tecnologias Utilizadas

- **Java** (versão 17 ou superior)
- **Spring Boot** (versão 2.7.x ou superior)
- **Spring Data JPA** para integração com banco de dados.
- **Hibernate** para ORM.
- **Spring Web** para a criação de APIs RESTful.
- **Maven** como gerenciador de dependências.

## Requisitos

- **Java 17+**
- **Maven 3.6+**

## Instalação

1. Clone este repositório na sua máquina local:

   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio-backend.git

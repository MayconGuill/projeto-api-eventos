# Projeto Spring Boot - API REST de Eventos
[![NPM](https://img.shields.io/npm/l/react)]

# 📋 Sobre o projeto
Este projeto é uma aplicação back-end construída com Spring Boot, que disponibiliza uma API REST para gerenciamento de eventos.
O objetivo principal é o aprendizado e prática de:
- Versionamento de banco de dados com Flyway
- Deploy de arquivos em AWS S3 Bucket
- Utilização do banco de dados PostgreSQL
- Princípios fundamentais do Java, Spring Boot, JPA
- Aplicação de boas práticas de desenvolvimento de software

## 🚀 Tecnologias Utilizadas
- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Maven
- PostgreSQL
- Flyway
- AWS S3

## ⚙️ Funcionalidades da API
### 📁 Eventos
- Listar todos os eventos
`GET /api/event?page={númeroDaPágina}&size={quantidadePorPágina}`
- Buscar evento por ID
`GET /api/event/{eventId}`
- Criar um novo evento
`POST /api/event`
Envio via `multipart/form-data`, com os seguintes campos:
`title` (obrigatório)
`description` (opcional)
`eventUrl` (obrigatório)
`image` (opcional - arquivo de imagem)
`date` (obrigatório - formato Long)
`remote` (booleano - obrigatório)
`city` (obrigatório)
`state` (obrigatório)
### 🎟️ Cupons
- Criar cupom para um evento
`POST /api/coupon/event/{eventId}`
Envio via `application/json`, com os campos:
`code` (obrigatório)
`discount` (obrigatório - percentual ou valor)
`valid` (data de validade - obrigatório)
- Buscar cupom por ID
`GET /api/coupon/{couponId}`

### 🧪 Testes Manuais

Você pode testar a API utilizando ferramentas como:
- [Postman](https://www.postman.com/)
- [Insomnia](https://insomnia.rest/)

# Autor

Maycon Vieira Guill Rodrigues

https://www.linkedin.com/in/maycon-vieira-350b19304/

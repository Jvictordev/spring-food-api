# 🥗 Food API - Spring Boot + MySQL

Este é um projeto simples de uma API REST construída com **Java**, **Spring Boot** e **MySQL**, utilizando a arquitetura **MVC** (sem camada de view), com foco em praticar o desenvolvimento backend moderno com Java.

O projeto expõe rotas relacionadas a alimentos (`/food`) e permite operações básicas de CRUD.

---

## 📚 Tecnologias Utilizadas

- Java 24+
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Lombok (opcional)

---

## 📂 Arquitetura

- **Model:** Representa as entidades do banco de dados (`Food`)
- **Repository:** Interface que estende `JpaRepository`
- **Service:** Camada de regras de negócio
- **Controller:** Endpoints REST

---

## 🚀 Como Executar

### Pré-requisitos

- Java instalado (JDK 17 ou superior)
- MySQL rodando com um banco criado
- IDE como IntelliJ ou VSCode com extensão Java
- Maven configurado

### Passos

1. Clone o projeto:

```bash
git clone https://github.com/Jvictordev/spring-food-api.git
cd spring-food-api
```

2. Configure o application.properties com suas credenciais do MySQL:
   spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha
   spring.jpa.hibernate.ddl-auto=update
3. Compile e execute:
   ./mvnw spring-boot:run

| Método | Rota         | Descrição                 |
| ------ | ------------ | ------------------------- |
| GET    | `/food`      | Lista todos os alimentos  |
| POST   | `/food`      | Cria um novo alimento     |
| DELETE | `/food/{id}` | Remove um alimento por ID |

Exemplo de payload POST /food:

{
    "name": "Banana",
    "calories": 89
}

Objetivos do Projeto:
Praticar Java moderno com Spring Boot

Aplicar conhecimentos de Node.js e Python ao ecossistema Java

Reforçar a lógica de APIs RESTful e integração com banco de dados

Evoluir como desenvolvedor backend com foco em Java

🧠 Futuras Melhorias
Adicionar validações com Bean Validation

Criar testes unitários com JUnit

Usar Swagger/OpenAPI para documentação automática

Containerizar com Docker

Habilitar CORS e segurança básica com Spring Security

🧑‍💻 Autor
Feito com dedicação por João Vitor Alves. Em aprendizado contínuo e com foco no backend Java 💻
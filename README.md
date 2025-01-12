# Animeux Application

## Sobre a Aplicação

A aplicação **Animeux** foi desenvolvida seguindo os padrões **MVC (Model-View-Controller)** e **RESTful**. Ela tem como objetivo gerenciar informações de filmes e um carrossel de destaques. Este projeto foi implementado utilizando **Spring Boot** com integração ao banco de dados para persistência das informações.

## Estrutura do Projeto

### 1. **Modelo MVC**
- **Model**: Representa as entidades do domínio da aplicação.
- **View**: Front-end (será integrado posteriormente).
- **Controller**: Gerencia as requisições HTTP e direciona para os serviços correspondentes.
- **Service**: Contém a lógica de negócios.

### 2. **Endereçamento RESTful**
Os endpoints seguem as boas práticas de REST, permitindo fácil integração e manutenção.

---

## Entidades

### 1. **Movie**
Representa os filmes cadastrados.

- **Atributos**:
  - `id`
  - `title`
  - `description`
  - `release_year`
  - `genre`
  - `director`
  - `rating`
  - `duration`
  - `backgroundImage`
  - `thumbnailImage`
  - `logo`

- **Endpoints**:
  - `GET /movies/{id}`: Retorna um filme pelo ID.
  - `POST /movies/create`: Cria um novo filme.
  - `DELETE /movies/{id}`: Remove um filme pelo ID.

### 2. **MovieCarousel**
Gerencia os itens do carrossel de filmes na aplicação.

- **Atributos**:
  - `id`
  - `title`
  - `description`
  - `thumbnail`
  - `backgroundImage`
  - `logo`

- **Endpoints**:
  - `POST /movies/carousel/create`: Adiciona um novo item ao carrossel.
  - `DELETE /movies/carousel/delete/{id}`: Remove um item do carrossel pelo ID.

---

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot** (Web, JPA)
- **Banco de Dados**: MySQL
- **Ferramentas de Build**: Maven

---

## Organização do Código

- **Model**: Contém as classes `Movie` e `MovieCarousel`.
- **Repository**: Interfaces que estendem o `JpaRepository` para persistência.
- **Service**: Classes com regras de negócio para `Movie` e `MovieCarousel`.
- **Controller**: Define os endpoints RESTful.

---

## Como Executar

1. Clone o repositório:
   ```bash
   git clone <URL_DO_REPOSITORIO>
   ```

2. Configure o banco de dados MySQL:
   - Crie um banco de dados chamado `animeux_db`.
   - Configure as credenciais no arquivo `application.properties`.

3. Execute o projeto:
   ```bash
   mvn spring-boot:run
   ```

4. Acesse os endpoints RESTful para interagir com o sistema.

---

## Estrutura do Banco de Dados

### Tabela: `movies`
- `id` (PK, Auto Increment)
- `title`
- `description`
- `release_year`
- `genre`
- `director`
- `rating`
- `duration`
- `backgroundImage`
- `thumbnailImage`
- `logo`

### Tabela: `movie_carousel`
- `id` (PK, Auto Increment)
- `title`
- `description`
- `thumbnail`
- `backgroundImage`
- `logo`

---

## Futuras Implementações

- **Integração com Front-end**: Exibição dos dados em uma interface gráfica.
- **Spring Security**: Adicionar autenticação e autorização.
- **Testes Unitários e de Integração**: Garantir a qualidade do código.

---

## Captura de Tela

Adicione aqui uma captura de tela do código ou da aplicação:

![Screenshot](https://github.com/user-attachments/assets/5a02fada-3bb3-4381-b926-58358a340fdc)


---

## Contribuição

Sinta-se à vontade para contribuir com melhorias, novas funcionalidades ou correções. Faça um fork do repositório e envie um pull request.

---

## Contato/autor

Wallace Araujo  
E-mail: wallacewwc2015wwk@gmail.com
LinkedIn:https://www.linkedin.com/in/wallace-d-araujo/

---

Obrigado por visitar o projeto Animeux! 💻

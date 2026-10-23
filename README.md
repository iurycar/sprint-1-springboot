# Sprint 4 — Backend | API de Gerenciamento de Equipamentos

## Sobre o projeto

Este projeto consiste em uma API REST desenvolvida em Java com Spring Boot para o gerenciamento de equipamentos.

A API permite cadastrar, consultar, atualizar e excluir equipamentos. Ela também é utilizada pelo aplicativo frontend desenvolvido com React Native e Expo, possibilitando a integração entre a interface e a camada de dados.

## Tecnologias utilizadas

- Java
- Spring Boot
- Maven
- API REST
- Banco de dados H2

## Funcionalidades

- Cadastrar equipamentos.
- Listar os equipamentos cadastrados.
- Consultar um equipamento pelo ID.
- Atualizar informações de um equipamento.
- Excluir equipamentos.
- Persistir os dados utilizando o banco H2 configurado no projeto.
- Permitir a comunicação com o frontend.

## Arquitetura do projeto

O backend está organizado em camadas para separar as responsabilidades:

- **Model:** representa as entidades utilizadas pela aplicação.
- **Repository:** responsável pelo acesso aos dados.
- **Service:** concentra a lógica de negócio.
- **Controller:** recebe as requisições HTTP e disponibiliza os endpoints da API.

## Requisitos

Antes de executar o projeto, instale:

- JDK Java 17 ou versão compatível com a configuração do projeto.
- Git.
- Maven, caso não utilize o Maven Wrapper incluído no repositório.

## Como executar o projeto

### 1. Clonar o repositório

```bash
git clone https://github.com/iurycar/sprint-1-springboot.git
```

### 2. Entrar na pasta

```bash
cd sprint-1-springboot
```

### 3. Iniciar a aplicação

No Windows, utilizando o PowerShell:

```powershell
.\mvnw.cmd spring-boot:run
```

Outra opção é abrir o projeto em uma IDE, localizar a classe principal Java que possui a anotação `@SpringBootApplication` e executá-la.

Após a inicialização, a API estará disponível em:

```text
http://localhost:8080
```

## Endpoints da API

| Método HTTP | Endpoint | Descrição |
|---|---|---|
| GET | `/equipamentos` | Retorna a lista de equipamentos |
| GET | `/equipamentos/{id}` | Retorna um equipamento específico |
| POST | `/equipamentos` | Cadastra um equipamento |
| PUT | `/equipamentos/{id}` | Atualiza um equipamento |
| DELETE | `/equipamentos/{id}` | Exclui um equipamento |

Substitua `{id}` pelo identificador do equipamento desejado.

## Testando a API com o Postman

### Consultar equipamentos — GET

```http
GET http://localhost:8080/equipamentos
```

Retorna os equipamentos cadastrados.

### Cadastrar equipamento — POST

```http
POST http://localhost:8080/equipamentos
```

No Postman, selecione `Body`, depois `raw` e `JSON`. Utilize um corpo compatível com os campos definidos na entidade `Equipamento`. Por exemplo, caso ela utilize os campos `nome` e `descricao`:

```json
{
  "nome": "Notebook Dell",
  "descricao": "Notebook utilizado para atividades de desenvolvimento e testes"
}
```

### Atualizar equipamento — PUT

```http
PUT http://localhost:8080/equipamentos/1
```

Envie no corpo da requisição os dados atualizados do equipamento identificado pelo ID informado.

### Excluir equipamento — DELETE

```http
DELETE http://localhost:8080/equipamentos/1
```

Essa requisição solicita a exclusão do equipamento com o ID informado.

## Banco de dados

O projeto utiliza o banco de dados H2, configurado para persistência em arquivo, conforme as configurações da aplicação.

O arquivo do banco está configurado no caminho:

```text
./data/sprint1-mobile-db
```

A aplicação também disponibiliza o console H2 em:

```text
http://localhost:8080/h2-console
```

O acesso depende das configurações de conexão definidas no projeto.

## Integração com o frontend

O backend fornece os endpoints consumidos pelo aplicativo frontend, permitindo que as operações realizadas pela interface sejam processadas pela API.

Para que a integração funcione, o backend precisa estar em execução e o frontend deve estar configurado para acessar o endereço correto da API.

## Repositórios

- **Backend:** https://github.com/iurycar/sprint-1-springboot
- **Frontend:** https://github.com/iurycar/sprint-2-frontend

## Execução completa

1. Inicie o backend.
2. Confirme que a API está disponível na porta 8080.
3. Execute o frontend em outro terminal.
4. Utilize o aplicativo ou o Postman para testar as operações de cadastro, consulta, atualização e exclusão.

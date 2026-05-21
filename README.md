# Sprint 1 Backend - Equipamentos

API REST desenvolvida em Spring Boot para a Sprint 1, seguindo a arquitetura em camadas com `model`, `repository`, `service` e `controller`.

## Entidade principal

- `Equipamento`

## Endpoints

- `POST /equipamentos` - cria um equipamento
- `GET /equipamentos` - lista todos os equipamentos
- `GET /equipamentos/{id}` - busca um equipamento por ID
- `PUT /equipamentos/{id}` - atualiza um equipamento existente
- `DELETE /equipamentos/{id}` - remove um equipamento

## Como executar

1. Execute a aplicação com Maven:
	- `./mvnw spring-boot:run`
2. A API sobe com persistência em H2 file mode.
3. O console do H2 fica disponível em `/h2-console`.

## Persistência

- Banco: H2
- Modo: file
- Arquivo gerado em `./data/sprint1-mobile-db`

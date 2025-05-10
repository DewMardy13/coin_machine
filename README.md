## 🚀 Instalação e Execução

1. Pré-requisitos:
    - Java 17
    - Maven
    - Docker
    - Docker Compose

2. Passos:
    Abrir o terminal na raiz do projeto (onde está o `docker-compose.yml`) e executar:
    docker-compose up

3. Acesso à API:

    A aplicação ficará disponível em:

    http://localhost:8080/coins

    Envia um pedido POST com um body, ex:
    curl -X POST http://localhost:8080/coins -H "Content-Type: application/json" -d "{\"leftPerson\":[\"P\",\"R\",\"R\"],\"rightPerson\":[\"P\",\"P\",\"R\"]}"

-----------------------------------------------------------------------------

CI/CD

Este projeto tem uma pipeline de GitHub Actions que:

- Compila e testa a aplicação com Maven
- Gera uma imagem Docker

-----------------------------------------------------------------------------

Testes

Os testes unitários são executados automaticamente durante o build (`mvn clean package`).

-----------------------------------------------------------------------------

Notas

- As credenciais de Docker não são necessárias neste projeto, dado que não é feito deploy para nenhum registry remoto.

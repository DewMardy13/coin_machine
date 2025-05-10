# desafio
notas:
docker run -p 8080:8080 coin-machine 
exemplo de comando a enviar:
curl -X POST http://localhost:8080/coins -H "Content-Type: application/json" -d "{\"leftPerson\":[\"P\",\"R\",\"R\"],\"rightPerson\":[\"P\",\"P\",\"R\"]}"
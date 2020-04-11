# springboot-multithreading
Subir a aplicação que irá abrir na porta 9191

Entrar no Post
POST http://localhost:9191/users
Adicionar body form-data e colocar o arquivo que esta no src\main\resources\file.test\MOCK_DATA.csv e executar
Entrar no POST http://localhost:9191/h2-console
Driver Class:org.h2.Driver
JDBC URL:jdbc:h2:mem:testdb
Dar um select na tabela USER
No postman GET http://localhost:9191/getUserByThread
Visualizar os logs com as threads

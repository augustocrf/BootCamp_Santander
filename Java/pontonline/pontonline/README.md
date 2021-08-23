# Projeto DIO - API REST - PontonLine
Construindo um sistema de controle de ponto e acesso com Spring Boot:


* Atualizado as versões de algumas dependencias
* Implementado as controladores, repositórios e serviços para todos os modelos
* H2
  * Parametros adicionados no arquivo application.properties
  > ```http://localhost:8081/h2```
* Swagger
  > ```http://localhost:8080/swagger-ui.html ```

  ![Image Swagger](https://github.com/augustocrf/BootCamp_Santander/blob/master/Java/pontonline/pontonline/swaggerPontonLine.png)

Java | Gradle |Spring boot | Spring Data Jpa | Hibernate | Lombok | swagger | h2 | PostMan

* [Java | Oracle](https://www.java.com/pt-BR/)
* [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/)
* [Spring Framework](https://spring.io/)
* [Official Gradle documentation](https://docs.gradle.org)
* [Swagger: API Documentation & Design Tools for Teams](https://swagger.io/)
* [Project Lombok](https://projectlombok.org/)
* [Hibernate](https://hibernate.org/)
* [String Initializr](https://start.spring.io/)

### Links Adicionais

* [Digital Innovation One](https://digitalinnovation.one/)
* [ Maven Repository - Artifact](https://mvnrepository.com)

### Proximos passos
* Verificar a possibilidade de criar uma class Repository
* Verificar a possibilidade de criar uma class Service

#### Pontos de Atenção
* O EndPoint "Put" das controladoras, está adicionando novos efetuar o tratmento para atualizar existente.
* Adicinar nas controladoras as chaves compostas nos EndPoint "getById", "deleteByID".
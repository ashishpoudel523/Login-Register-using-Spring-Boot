# Login Register Example For Spring Boot,

### Thymeleaf, Maven or Gradle, PostgreSQL or MySQL, JPA, Spring Security, SecurityFilterChain

In this project, we are using 2 types of roles - ADMIN and USER, for adding more roles check `Role.java`

Taken ref: studygyaan
application.properties (change database settings)
```
#-------------------- server properties ---------------
server.port=8080
server.error.include-message=always

#--------------------- Logging ------------------
logging.level.org.hibernate.SQL=DEBUG
logging.level.org.hibernate.type=TRACE
logging.level.org.springframework.web=DEBUG
logging.level.org.hibernate=ERROR

#--------------------- DB Connection ------------------
spring.datasource.url=jdbc:postgresql://localhost:5432/demo
spring.datasource.username=demo
spring.datasource.password=password


OR, if you use MySQL use the followlig:


#--------------------- DB Connection ------------------
spring.datasource.url=jdbc:mysql://localhost:3306/logindb
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=root

#--------------------JPA-ORM Properties-----------------
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.properties.hibernate.format_sql=true
```




spring.profiles.active=dev



Spring Security *SecurityFilterChain* : How to Fix WebSecurityConfigurerAdapter Deprecated studygyaan

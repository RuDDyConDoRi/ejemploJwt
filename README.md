# Servicio RESTcon JWT

[![](https://travis-ci.org/joemccann/dillinger.svg?dev=dev)]()

Para este ejemplo de Servicio REST con JWT se uso:

  - Spring Boot
  - Netbeans
  - JDK 8

### Installation

Abrir el proyecto con Netbeans y luego ejecutarlo (RUN).
Los endponits disponibles son:  
```sh
- http://localhost:8080/auth      POST  {"username":"admin","password":"admin"}     endpoint para obtener token de usuario registrado

- http://localhost:8080/user      GET  endponit para verficar token
```

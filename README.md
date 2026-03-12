# Spring Boot OAuth2 JWT Demo

A minimal demo project showing how to secure a REST API using OAuth2 and JWT in Spring Boot 4.

## Overview
This project configures both an Authorization Server and a Resource Server in the same Spring Boot project — for learning purposes only. In a production environment they should be separate projects.

## Tech Stack
- Java 21
- Spring Boot 4.0.3
- Spring Security 7
- Spring OAuth2 Authorization Server

## Getting Started

### Prerequisites
- Java 21
- Maven

### Run the project
```bash
mvn spring-boot:run
```

## Testing

### 1. Hit the API without a token (expect 401)
```bash
curl -v "http://localhost:8080/api/basic/hello?name=World"
```

### 2. Get an access token
```bash
curl -X POST "http://localhost:8080/oauth2/token" \
  -u "demo-client:demo-secret" \
  -d "grant_type=client_credentials&scope=read"
```

### 3. Hit the API with the token (expect 200)
```bash
curl -v "http://localhost:8080/api/basic/hello?name=World" \
  -H "Authorization: Bearer <access_token>"
```

## Related Blog Post
[Securing a REST API with OAuth2 and JWT in Spring Boot 4](https://emenaa.medium.com/securing-a-rest-api-with-oauth2-and-jwt-in-spring-boot-4-416e68b45a69) — Medium
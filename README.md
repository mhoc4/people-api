# Rest API for User Management



# About the project

This is an API built with Spring Boot that performs the basic CRUD operations (create, read, update and delete) users.

### API deployment link

https://people-api-acmjr.herokuapp.com/api/v1/people

Obs.: Due to the deployment being done using the free Heroku plan, the API may take a few seconds to respond to requests.

## Data Model

[![Modelo de dados](https://raw.githubusercontent.com/valsonpereira/my-assets/main/person-api/modelo_dados.png)](https://raw.githubusercontent.com/valsonpereira/my-assets/main/person-api/modelo_dados.png)

# Technologies stacks used

- Java 11
- Spring Boot
- Spring Data JPA
- Maven
- H2 Database

# How to run the project

## Prerequisites

- Java 11
- Postman (HTTP client to make requests)

```
# clone repository
git clone https://github.com/mhoc4/people-api.git

# go to the backend project folder
cd PersonManagerAPI

# run the project
./mvnw spring-boot:run

# local address to perform REST requests
http://localhost:8082/api/v1/people
```

Exemple of how to use the API

```
# Register users
POST https://people-api-acmjr.herokuapp.com/api/v1/people

# Message Body (JSON Object Structure)

{
    "firstName": "John",
    "lastName": "Luke",
    "birthDate": "10-02-1955",
    "cpf": "115.337.418-83",
    "phones": [
        {
            "type": "MOBILE",
            "number": "(11)999999999"
        }
    ]
}

# List all users

GET https://people-api-acmjr.herokuapp.com/api/v1/people

# List user by ID

GET https://people-api-acmjr.herokuapp.com/api/v1/people/{id}

# Update User

PUT https://people-api-acmjr.herokuapp.com/api/v1/people/{id}

# Delete user

DELETE GET https://people-api-acmjr.herokuapp.com/api/v1/people/{id}
```

# Author

Arnaldo Junior

https://www.linkedin.com/in/arnaldocmjr/
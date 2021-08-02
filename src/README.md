# Rest API for user management

[![NPM](https://camo.githubusercontent.com/a581cd1e13be14972f2eca7065fa686ab5718b9c233570190f92be36ed39664e/68747470733a2f2f696d672e736869656c64732e696f2f6e706d2f6c2f7265616374)](https://github.com/valsonpereira/person-api/blob/main/LICENSE)

# About the project



API built with Spring Boot that performs the basic CRUD operations (create, read, update and delete) of users.



### Link of the deployed API

https://people-api-acmjr.herokuapp.com/api/v1/people

Obs.: Due to deployment done using Heroku's free plan, the API may take a few seconds to respond to requests.

## Data model

[![Modelo de dados](https://raw.githubusercontent.com/valsonpereira/my-assets/main/person-api/modelo_dados.png)](https://raw.githubusercontent.com/valsonpereira/my-assets/main/person-api/modelo_dados.png)

# Stacks

- Java 11
- Spring Boot
- Spring Data JPA
- Maven
- H2 Database

# How to run the project

## Requirements

- Java 11
- Postman (HTTP client to make requests to the api)

```
# clone
git clone https://github.com/valsonpereira/person-api.git

# go to the folder
cd person-api

# run the command
./mvnw spring-boot:run

# local address to make requests
http://localhost:8082/api/v1/people
```

Example of how to use the API

```
# Save users 
POST https://peopleapi-valson.herokuapp.com/api/v1/people

# JSON body(Estrutura do objeto JSON)

{
    "firstName": "Joao",
    "lastName": "Luis",
    "birthDate": "23-04-1980",
    "cpf": "115.337.418-83",
    "phones": [
        {
            "type": "MOBILE",
            "number": "(11)9999-9999"
        }
    ]
}

# List all users

GET https://peopleapi-valson.herokuapp.com/api/v1/people

# List user by id

GET https://peopleapi-valson.herokuapp.com/api/v1/people/{id}

# Update user

PUT https://peopleapi-valson.herokuapp.com/api/v1/people/{id}

# Delete user

DELETE GET https://peopleapi-valson.herokuapp.com/api/v1/people/{id}
```

## Author

Arnaldo Junior

https://www.linkedin.com/in/arnaldocmjr/
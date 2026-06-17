# Banking System REST API

A simple Banking System REST API built using Java and Spring Boot. This project demonstrates the implementation of RESTful web services for basic banking operations such as account creation, account retrieval, deposits, and withdrawals.

## Features

* Create a new bank account
* Retrieve account details by ID
* Retrieve all accounts
* Deposit money into an account
* Withdraw money from an account
* Layered architecture (Controller, Service, DTO, Repository)
* RESTful API design

## Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven

## API Endpoints

### Create Account

POST /api/banking

### Get Account By ID

GET /api/banking/{id}

### Get All Accounts

GET /api/banking

### Deposit Money

PUT /api/banking/{id}/deposit

Request Body:
{
"amount": 1000
}

### Withdraw Money

PUT /api/banking/{id}/withdraw

Request Body:
{
"amount": 500
}

## Project Structure

src
├── Controller
├── Service
├── Repository
├── DTO
├── Entity
└── Exception

## Learning Outcomes

Through this project, I gained hands-on experience with:

* Spring Boot REST APIs
* Request Mapping and Path Variables
* DTO Pattern
* Dependency Injection
* Exception Handling
* Database Integration using JPA and Hibernate
* CRUD Operations
* API Testing using Postman

## Future Enhancements

* Account Transfer Functionality
* Transaction History
* Authentication and Authorization using Spring Security
* Swagger API Documentation
* Docker Deployment

## Author

Isha Nath

Aspiring Java Backend Developer | Spring Boot Enthusiast

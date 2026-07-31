# Smart Expense Tracker API

## Overview

The Smart Expense Tracker API is a RESTful web service developed using **Java** and **Spring Boot**. It helps users manage their personal expenses by allowing them to add, view, filter, calculate, and delete expense records. The application uses **in-memory storage (ArrayList)**, so no database setup is required.

---

## Features

- Add a new expense
- View all expenses
- Filter expenses by category
- Calculate the total of all expenses
- Calculate the total expenses for a specific category
- Delete an expense
- Input validation using Spring Validation
- Unit testing using JUnit 5

---

## Technologies Used

- Java 17
- Spring Boot
- Maven
- Spring Web
- Spring Validation
- JUnit 5
- Postman

---

## Prerequisites

Before running the application, ensure you have:

- Java 17 or later
- Maven 3.8 or later
- Eclipse IDE / IntelliJ IDEA
- Postman (for API testing)

---

## Project Structure

```
expense-tracker
│
├── src
│   ├── main
│   │   ├── java
│   │   └── resources
│   └── test
│       └── java
│
├── README.md
├── AI_NOTES.md
├── pom.xml
└── mvnw
```

---

## Installation

Clone the repository:

```bash
git clone https://github.com/your-username/expense-tracker-api.git
```

Move to the project directory:

```bash
cd expense-tracker-api
```

---

## Running the Application

Run the Spring Boot application:

```bash
mvn spring-boot:run
```

The application starts at:

```
http://localhost:8083
```

---

## Running Unit Tests

Execute:

```bash
mvn test
```

---

# REST API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | `/expenses` | Add a new expense |
| GET | `/expenses` | View all expenses |
| GET | `/expenses/category/{category}` | View expenses by category |
| GET | `/expenses/total` | Get total expenses |
| GET | `/expenses/total/{category}` | Get total expenses for a category |
| DELETE | `/expenses/{id}` | Delete an expense |

---

# Sample Request

### POST `/expenses`

```json
{
    "title": "Grocery Shopping",
    "amount": 1850,
    "category": "Groceries",
    "date": "2026-07-31"
}
```

---

# Sample Response

```json
{
    "id": 1,
    "title": "Grocery Shopping",
    "amount": 1850.0,
    "category": "Groceries",
    "date": "2026-07-31"
}
```

---

# Testing

The application was tested using:

- Postman
- JUnit 5

All endpoints were verified successfully.

---

# Future Improvements

- Store data in MySQL or PostgreSQL
- User authentication with Spring Security
- Expense update functionality
- Monthly expense reports
- Docker support

---

# Author

**Lavanya G S**

Software Engineering Apprenticeship Assignment – Diligent Corporation
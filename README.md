# Smart Expense Tracker API

## Overview

The Smart Expense Tracker API is a RESTful web service built using **Java** and **Spring Boot** to manage personal expenses. The application stores data in memory using an `ArrayList`, so no database setup is required.

## Features

- Add a new expense
- View all expenses
- Filter expenses by category
- Calculate total expenses
- Calculate total expenses by category
- Delete an expense
- Input validation using Spring Validation
- Unit tests using JUnit 5
- In-memory data storage (no database required)

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

Before running the project, make sure you have:

- Java 17 or later
- Maven 3.8 or later
- Git
- Eclipse IDE or IntelliJ IDEA

---

## Project Structure

```text
expense-tracker-api
│
├── README.md
├── AI_NOTES.md
├── pom.xml
├── src
│   ├── main
│   └── test
```

---

## Installation

Clone the repository:

```bash
git clone https://github.com/LavanyaGS2/expense-tracker-api.git
```

Move to the project directory:

```bash
cd expense-tracker-api
```

Install all dependencies:

```bash
mvn clean install
```

---

## Run the Application

Start the Spring Boot application:

```bash
mvn spring-boot:run
```

The application will start at:

```text
http://localhost:8083
```

---

## Run the Tests

Execute the unit tests:

```bash
mvn test
```

---

## REST API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | `/expenses` | Add a new expense |
| GET | `/expenses` | View all expenses |
| GET | `/expenses/category/{category}` | Filter expenses by category |
| GET | `/expenses/total` | Calculate total expenses |
| GET | `/expenses/total/{category}` | Calculate total expenses by category |
| DELETE | `/expenses/{id}` | Delete an expense |

---

## Sample Request

**POST** `/expenses`

```json
{
  "title": "Grocery Shopping",
  "amount": 1850,
  "category": "Groceries",
  "date": "2026-07-31"
}
```

---

## Sample Response

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

## Testing

The application was tested using:

- Postman
- JUnit 5

All REST API endpoints and unit tests were verified successfully.

---

## Future Improvements

- Store expenses in a database (MySQL/PostgreSQL)
- Add update expense functionality
- Add user authentication
- Generate monthly expense reports
- Docker support

---

## Author

**Lavanya G S**

BE – Computer Science and Engineering

Software Engineering Apprenticeship Assignment – Diligent Corporation
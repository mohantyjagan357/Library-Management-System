<div align="center">

```
██╗     ██╗██████╗ ██████╗  █████╗ ██████╗ ██╗   ██╗
██║     ██║██╔══██╗██╔══██╗██╔══██╗██╔══██╗╚██╗ ██╔╝
██║     ██║██████╔╝██████╔╝███████║██████╔╝ ╚████╔╝ 
██║     ██║██╔══██╗██╔══██╗██╔══██║██╔══██╗  ╚██╔╝  
███████╗██║██████╔╝██║  ██║██║  ██║██║  ██║   ██║   
╚══════╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝   
    ███╗   ███╗ █████╗ ███╗   ██╗ █████╗  ██████╗ ███████╗███╗   ███╗███████╗███╗   ██╗████████╗
    ████╗ ████║██╔══██╗████╗  ██║██╔══██╗██╔════╝ ██╔════╝████╗ ████║██╔════╝████╗  ██║╚══██╔══╝
    ██╔████╔██║███████║██╔██╗ ██║███████║██║  ███╗█████╗  ██╔████╔██║█████╗  ██╔██╗ ██║   ██║   
    ██║╚██╔╝██║██╔══██║██║╚██╗██║██╔══██║██║   ██║██╔══╝  ██║╚██╔╝██║██╔══╝  ██║╚██╗██║   ██║   
    ██║ ╚═╝ ██║██║  ██║██║ ╚████║██║  ██║╚██████╔╝███████╗██║ ╚═╝ ██║███████╗██║ ╚████║   ██║   
    ╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝ ╚═════╝ ╚══════╝╚═╝     ╚═╝╚══════╝╚═╝  ╚═══╝   ╚═╝   
              ███████╗██╗   ██╗███████╗████████╗███████╗███╗   ███╗
              ██╔════╝╚██╗ ██╔╝██╔════╝╚══██╔══╝██╔════╝████╗ ████║
              ███████╗ ╚████╔╝ ███████╗   ██║   █████╗  ██╔████╔██║
              ╚════██║  ╚██╔╝  ╚════██║   ██║   ██╔══╝  ██║╚██╔╝██║
              ███████║   ██║   ███████║   ██║   ███████╗██║ ╚═╝ ██║
              ╚══════╝   ╚═╝   ╚══════╝   ╚═╝   ╚══════╝╚═╝     ╚═╝
```

### ⬡ Spring Boot · MySQL · REST API · Java · Maven

[![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://adoptium.net/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?style=for-the-badge&logo=mysql&logoColor=white)](https://www.mysql.com/)
[![Maven](https://img.shields.io/badge/Maven-Build-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)](https://maven.apache.org/)
[![REST API](https://img.shields.io/badge/API-REST-00C7B7?style=for-the-badge)](https://restfulapi.net/)
[![Postman](https://img.shields.io/badge/Tested_with-Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)](https://www.postman.com/)

<br/>

> **A full-featured Library Management System built with Spring Boot.**
> **Manage books, members, borrowing, and returns — all through clean REST APIs.**

```
  ┌──────────┐    REST     ┌───────────────────┐    JPA    ┌──────────┐
  │  Postman │ ──────────► │  Spring Boot App  │ ────────► │  MySQL   │
  │  /Client │ ◄────────── │  :8080            │ ◄──────── │   DB     │
  └──────────┘    JSON     └───────────────────┘           └──────────┘
```

</div>

---

## 📖 What Is This?

The **Library Management System** is a Spring Boot REST API backend that digitises the core operations of a library — from cataloguing books and registering members to tracking borrow/return cycles. Every feature is exposed through clean HTTP endpoints, testable directly via Postman.

Built with **100% Java**, it demonstrates solid backend engineering with Spring Data JPA, Hibernate ORM, and MySQL persistence.

---

## ✨ Features

| Module | Capabilities |
|---|---|
| 📚 **Book Management** | Add, update, delete, search books by title/author/ISBN |
| 👤 **Member Management** | Register library members, manage profiles |
| 📤 **Borrow Books** | Issue books to members with borrow date tracking |
| 📥 **Return Books** | Process returns, calculate overdue fines |
| 🔍 **Search & Filter** | Find available books, search by genre/author/title |
| 📊 **Inventory Tracking** | Track total copies, available copies per book |

---

## 🏗️ System Architecture

```
┌───────────────────────────────────────────────────────┐
│                  CLIENT (Postman / Browser)            │
└────────────────────────┬──────────────────────────────┘
                         │  HTTP / REST
                         ▼
┌───────────────────────────────────────────────────────┐
│                   SPRING BOOT APP                      │
│                                                       │
│  ┌─────────────┐   ┌─────────────┐  ┌─────────────┐  │
│  │  Controller │──►│   Service   │─►│ Repository  │  │
│  │  (REST API) │   │  (Business  │  │ (Spring JPA)│  │
│  │  @RestCtrl  │◄──│   Logic)    │◄─│  @Repo      │  │
│  └─────────────┘   └─────────────┘  └──────┬──────┘  │
│                                             │         │
│  ┌─────────────┐                    ┌───────▼──────┐  │
│  │    Model    │                    │  Hibernate   │  │
│  │  (Entities) │                    │     ORM      │  │
│  │  @Entity    │                    └──────┬───────┘  │
│  └─────────────┘                           │          │
└───────────────────────────────────────────-┼──────────┘
                                             │
                         ┌───────────────────▼───────────┐
                         │           MySQL Database        │
                         │   books | members | borrowings  │
                         └───────────────────────────────┘
```

---

## 🛠️ Tech Stack

```
Language      │  Java 17+
Framework     │  Spring Boot 3.x
Database      │  MySQL 8.0
ORM           │  Hibernate / Spring Data JPA
Build Tool    │  Maven (mvnw wrapper included)
API Testing   │  Postman
IDE           │  IntelliJ IDEA (recommended)
```

---

## 📁 Project Structure

```
Library-Management-System/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/library/management/
│       │       ├── controller/         # REST Controllers — all HTTP endpoints
│       │       │   ├── BookController.java
│       │       │   ├── MemberController.java
│       │       │   └── BorrowController.java
│       │       ├── service/            # Business logic layer
│       │       │   ├── BookService.java
│       │       │   ├── MemberService.java
│       │       │   └── BorrowService.java
│       │       ├── repository/         # Spring Data JPA interfaces
│       │       │   ├── BookRepository.java
│       │       │   ├── MemberRepository.java
│       │       │   └── BorrowRepository.java
│       │       ├── model/              # JPA Entity classes
│       │       │   ├── Book.java
│       │       │   ├── Member.java
│       │       │   └── Borrowing.java
│       │       └── LibraryManagementApplication.java
│       └── resources/
│           └── application.properties  # DB config
│
├── .mvn/wrapper/                       # Maven wrapper
├── mvnw / mvnw.cmd                     # Run without installing Maven
├── pom.xml                             # Dependencies
└── README.md
```

---

## ⚙️ Prerequisites

| Tool | Version | Install |
|---|---|---|
| ☕ Java JDK | 17+ | [adoptium.net](https://adoptium.net/) |
| 🐬 MySQL | 8.0+ | [mysql.com](https://dev.mysql.com/downloads/) |
| 📦 Maven | 3.8+ | [maven.apache.org](https://maven.apache.org/) *(or use mvnw)* |
| 🔧 Postman | Latest | [postman.com](https://www.postman.com/) |
| 💡 IntelliJ IDEA | Any | [jetbrains.com](https://www.jetbrains.com/idea/) |

---

## 🚀 Getting Started

### Step 1 — Clone the Repository
```bash
git clone https://github.com/mohantyjagan357/Library-Management-System.git
cd Library-Management-System
```

### Step 2 — Set Up MySQL Database
```sql
CREATE DATABASE library_db;
```

### Step 3 — Configure `application.properties`
Open `src/main/resources/application.properties` and set your credentials:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/library_db
spring.datasource.username=YOUR_MYSQL_USERNAME
spring.datasource.password=YOUR_MYSQL_PASSWORD
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.port=8080
```

### Step 4 — Run the Application

**Option A — Using Maven Wrapper (no Maven install needed):**
```bash
./mvnw spring-boot:run          # Linux / Mac
mvnw.cmd spring-boot:run        # Windows
```

**Option B — Using IntelliJ IDEA:**
- Open the project → Run `LibraryManagementApplication.java`

**Option C — Build & Run JAR:**
```bash
./mvnw clean package -DskipTests
java -jar target/library-management-*.jar
```

The app starts at: **`http://localhost:8080`**

---

## 🔌 REST API Endpoints

> Test all endpoints using **Postman**. Base URL: `http://localhost:8080`

### 📚 Books

| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET` | `/api/books` | Get all books |
| `GET` | `/api/books/{id}` | Get book by ID |
| `GET` | `/api/books/search?title={title}` | Search books by title |
| `POST` | `/api/books` | Add a new book |
| `PUT` | `/api/books/{id}` | Update book details |
| `DELETE` | `/api/books/{id}` | Delete a book |

### 👤 Members

| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET` | `/api/members` | Get all members |
| `GET` | `/api/members/{id}` | Get member by ID |
| `POST` | `/api/members` | Register a new member |
| `PUT` | `/api/members/{id}` | Update member info |
| `DELETE` | `/api/members/{id}` | Remove a member |

### 📋 Borrowing

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/api/borrow` | Borrow a book |
| `PUT` | `/api/borrow/return/{id}` | Return a borrowed book |
| `GET` | `/api/borrow/member/{memberId}` | Get borrow history for member |
| `GET` | `/api/borrow/active` | Get all currently borrowed books |

---

## 🧪 Sample Postman Requests

### Add a New Book
```json
POST http://localhost:8080/api/books
Content-Type: application/json

{
  "title": "Clean Code",
  "author": "Robert C. Martin",
  "isbn": "9780132350884",
  "genre": "Software Engineering",
  "totalCopies": 5
}
```

### Register a Member
```json
POST http://localhost:8080/api/members
Content-Type: application/json

{
  "name": "Soumya Mohanty",
  "email": "soumya@example.com",
  "phone": "9999999999",
  "membershipType": "ANNUAL"
}
```

### Borrow a Book
```json
POST http://localhost:8080/api/borrow
Content-Type: application/json

{
  "memberId": 1,
  "bookId": 3,
  "borrowDate": "2025-01-01",
  "dueDate": "2025-01-15"
}
```

---

## 🗺️ Roadmap

- [x] Book CRUD REST API
- [x] Member management
- [x] Borrow & return tracking
- [x] MySQL persistence with JPA
- [ ] Fine calculation for overdue returns
- [ ] Search by genre, author, availability
- [ ] JWT-based authentication & role management
- [ ] Admin dashboard (React frontend)
- [ ] Docker containerisation
- [ ] Swagger / OpenAPI documentation

---

## 🤝 Contributing

1. Fork the repository
2. Create your branch: `git checkout -b feature/fine-calculator`
3. Commit changes: `git commit -m 'feat: add overdue fine calculator'`
4. Push: `git push origin feature/fine-calculator`
5. Open a Pull Request

---

## 👨‍💻 Author

<div align="center">

**Soumya Mohanty**

[![GitHub](https://img.shields.io/badge/GitHub-mohantyjagan357-1fffa0?style=for-the-badge&logo=github&logoColor=white)](https://github.com/mohantyjagan357)

*DevOps Engineer · Java Developer · Cloud Native*

</div>

---

<div align="center">

```
// BUILT WITH JAVA · SPRING BOOT · MYSQL · REST API //
// READ IT. CODE IT. MANAGE IT. //
```

⭐ **Star this repo if you found it useful!**

</div>

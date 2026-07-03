# 🚀 Secure Job Portal Application

A secure and scalable **Job Portal REST API** built with **Spring Boot**, **Spring Data JPA**, **Hibernate**, and **MySQL**. This application enables job seekers to create professional profiles, companies to publish job openings, and candidates to apply for jobs through RESTful APIs.

The project follows a layered architecture using DTOs, Services, Repositories, and Controllers to ensure maintainability and clean code practices.

---

## 📌 Features

### 👤 User Management
- User Registration
- User Login
- Password Encryption using BCrypt
- User Profile Management
- Role-Based User Types

### 👨‍💼 Candidate Module
- Create Candidate Profile
- Update Candidate Information
- Add Skills
- Add Experience
- Add Education Details
- View Candidate Profile

### 🏢 Company Module
- Register Company
- Update Company Profile
- Company Information Management
- View Company Details

### 💼 Job Management
- Create Job Post
- Update Job Post
- Delete Job Post
- View All Jobs
- Search Jobs
- Manage Job Status

### 📄 Job Applications
- Apply for Jobs
- View Applied Jobs
- Company Reviews Applications
- Track Application Status

### 📊 Status Management

#### Job Status
- Open
- Closed
- Active

#### Application Status
- Applied
- Under Review
- Shortlisted
- Accepted
- Rejected

#### Job Types
- Full Time
- Part Time
- Internship
- Contract
- Remote

---

# 🏗️ Project Architecture

```
Controller
      │
      ▼
Service
      │
      ▼
Repository
      │
      ▼
MySQL Database
```

The project follows a layered architecture that separates business logic, persistence, and API endpoints.

---

# 📁 Project Structure

```
src
└── main
    ├── java
    │   └── com.job
    │       ├── configuration
    │       ├── controller
    │       ├── dto
    │       ├── model
    │       ├── payload
    │       ├── repository
    │       ├── service
    │       │      └── impl
    │       └── SecureJobPortalApplication.java
    │
    └── resources
        └── application.properties
```

---

# 🛠 Technologies Used

- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate ORM
- Spring Security
- BCrypt Password Encoder
- MySQL
- Maven
- REST APIs

---

# 📦 Modules

## User
- Register User
- Login
- Update User
- Delete User
- View User

## Candidate Profile
- Create Profile
- Update Profile
- View Candidate Information
- Skills
- Experience
- Education

## Company Profile
- Register Company
- Update Company
- View Company Information

## Job Posts
- Create Job
- Update Job
- Delete Job
- View Jobs
- Search Jobs

## Job Applications
- Apply Job
- View Applications
- Candidate Application History
- Company Review Applications
- Update Application Status

---

# 🗄 Database Entities

- Users
- CandidateProfile
- CompanyProfile
- JobPost
- JobApplication

---

# 🔗 Entity Relationships

```
Users
 ├── CandidateProfile (One-to-One)

Users
 ├── CompanyProfile (One-to-One)

CompanyProfile
 ├── JobPost (One-to-Many)

CandidateProfile
 ├── JobApplication (One-to-Many)

JobPost
 ├── JobApplication (One-to-Many)
```

---

# ⚙️ Exception Handling

Global exception handling is implemented for:

- Resource Not Found
- Invalid Request
- Validation Errors
- Duplicate Records
- Internal Server Errors

---

# 📂 Repository Layer

- UserRepository
- CandidateRepository
- CompanyRepository
- JobPostRepository
- JobApplicationRepo

---

# 📑 DTO Classes

- UserDto
- CandidateProfileDTO
- CompanyProfileDTO
- JobPostDto
- JobApplicationDTO

---

# 🧠 Service Layer

- UserService
- UserServiceImpl
- UserDetailServiceImpl

---

# 📡 REST APIs

The application exposes RESTful APIs using:

- GET
- POST
- PUT
- DELETE

---

# 🗃 Database Configuration

Example configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/job_portal
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# ▶️ Getting Started

## Clone Repository

```bash
git clone https://github.com/yourusername/SecureJobPortalApplication.git
```

## Navigate to Project

```bash
cd SecureJobPortalApplication
```

## Configure Database

Update the following file:

```
src/main/resources/application.properties
```

Add your MySQL username and password.

## Run the Application

Using Maven:

```bash
mvn spring-boot:run
```

Or run:

```
SecureJobPortalApplication.java
```

from your IDE.

---

# 🚀 Future Improvements

- JWT Authentication
- Role-Based Authorization
- Resume Upload
- Company Logo Upload
- Email Verification
- Forgot Password
- Pagination
- Sorting
- Advanced Job Search
- Swagger Documentation
- Docker Support
- Unit Testing
- Integration Testing

---

# 📚 Learning Outcomes

This project demonstrates:

- Spring Boot
- REST API Development
- Layered Architecture
- DTO Pattern
- Repository Pattern
- Service Layer
- Spring Security
- BCrypt Password Encryption
- Hibernate ORM
- Spring Data JPA
- MySQL Integration
- Exception Handling
- Clean Code Practices

---

# 👨‍💻 Author

**Muhammad Bux Baloch**

Backend Java Developer

### Tech Stack

- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- MySQL
- REST APIs
- Maven
- Git
- GitHub

---

⭐ If you found this project useful, consider giving it a Star on GitHub!


# FinSight – Expense & Budget Management System

## Overview

FinSight is a backend-driven expense and budget management system inspired by Splitwise.
The application is designed to manage personal and group expenses, track monthly budgets, and support settlement workflows with strong data integrity and secure authentication.

The project primarily focuses on **backend architecture**, including API design, authentication, database modeling, and business logic.
A frontend client is provided to demonstrate backend functionality.

---

## Demo Video (Primary Reference)

The application is hosted on free-tier services which may go idle.
For uninterrupted evaluation, please refer to the complete demo video:

**Demo Video:**
[https://drive.google.com/file/d/1r9Pek1uRdbOBdXlk7gqFilPEuk9qZbyg/view](https://drive.google.com/file/d/1r9Pek1uRdbOBdXlk7gqFilPEuk9qZbyg/view)

The demo video covers:

* User registration and OTP verification
* Login flow
* Budget creation and summaries
* Expense and group workflows
* Swagger API documentation

---

## Deployment Notes

The application is deployed using **Render (free tier)**.

### Deployed URLs

* **Frontend:**
  [https://flitwisefrontend1.onrender.com](https://flitwisefrontend1.onrender.com)

* **Backend API:**
  [https://flitwise-backend.onrender.com](https://flitwise-backend.onrender.com)

* **Swagger API Documentation:**
  [https://flitwise-backend.onrender.com/swagger-ui/index.html](https://flitwise-backend.onrender.com/swagger-ui/index.html)

### Deployment Limitations

* Services are hosted on Render free tier
* Instances may sleep after inactivity
* Initial requests may have cold-start delays
* Live links may occasionally be unavailable

The demo video should be considered the authoritative reference.

---

## Project Focus (Backend-First)

This project is primarily a **backend engineering project**.
Key areas of focus include:

* Secure authentication and authorization
* OTP-based email verification
* RESTful API design
* Relational database modeling
* Financial data integrity
* Swagger-based API documentation

The frontend acts as a consumer of backend APIs.

---

## Features

* User registration with OTP-based email verification
* Secure login using JWT authentication
* Personal and group expense tracking
* Monthly budget creation and monitoring
* Budget summaries (total, spent, remaining, usage percentage)
* Group creation and member management
* Settlement and balance resolution support
* Fully documented REST APIs using Swagger

---

## Tech Stack

### Backend

* Java
* Spring Boot
* Spring Security (JWT)
* Hibernate / JPA

### Database

* PostgreSQL

### Frontend

* React (Vite)
* Axios

### Email Service

* Resend API (used for OTP delivery)

---

## Authentication & Email Flow

1. User registers with email and password
2. Password is securely hashed using BCrypt
3. OTP is generated, stored with expiry, and sent via email
4. User verifies OTP to activate the account
5. Login issues a JWT token for secured API access
6. Resend OTP is supported; old OTPs are invalidated

### Email Delivery Note

* Email delivery uses **Resend API in test mode**
* OTP emails are delivered only to verified sender email addresses
* In production, domain verification enables delivery to all users

---

## Budget Management

* Users can create monthly budgets
* Backend computes:

  * Total budget
  * Total spending
  * Remaining balance
  * Usage percentage
* Budgets are categorized as on-track, nearing limit, or exceeded

---

## Expense Management

* Supports individual and group expenses
* Each expense records:

  * Paying user
  * Split details per participant
* Expense data is normalized across multiple tables to ensure accuracy

---

## Groups & Settlement

* Users can create groups and add members
* Group expenses are tracked per user
* Settlement APIs compute net balances without deleting historical data
* Foreign key constraints ensure financial consistency

---

## API Documentation (Swagger)

Interactive API documentation is available via Swagger UI:

[https://flitwise-backend.onrender.com/swagger-ui/index.html](https://flitwise-backend.onrender.com/swagger-ui/index.html)

Swagger includes:

* Authentication APIs
* User management APIs
* Group APIs
* Expense APIs
* Budget APIs
* Settlement APIs

Swagger serves as the contract between frontend and backend.

---

## Database Design

* Fully normalized relational schema
* Strong foreign key constraints
* Prevents unsafe deletes and data corruption
* Designed to preserve financial history and integrity

---

## Development & Demo Notes

* In development/demo mode, OTPs can be read directly from the database
* User deletion is intentionally restricted due to dependent financial records
* Manual cleanup is required for demo resets

---

## Future Improvements

* Soft delete for users
* Domain-verified email setup
* Optimized settle-up algorithm
* Notifications and reminders
* Analytics and reporting dashboard

---

## Author

**Harshita Srivastava**
Backend Developer
Java | Spring Boot | PostgreSQL

---

## License

This project is intended for academic and learning purposes.


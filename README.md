# 🏥 Hospital Management System

A **console-based Hospital Management System** built using **Java, JDBC, and PostgreSQL**. This application allows users to manage patient records by performing **CRUD (Create, Read, Update, Delete)** operations through a simple command-line interface.

---

## 📌 Features

* ➕ Add a new patient
* ✏️ Update existing patient details
* ❌ Delete a patient record
* 📋 View all patient records
* 🔗 PostgreSQL database connectivity using JDBC
* 🖥️ Menu-driven console interface
* ⚡ Simple and beginner-friendly project structure

---

## 🛠️ Tech Stack

* **Programming Language:** Java
* **Database:** PostgreSQL
* **Database Connectivity:** JDBC
* **IDE:** Eclipse IDE
* **JDK Version:** Java 8 or above

---

## 📂 Project Structure

```
Hospital-Management-System
│
├── src
│   └── com
│       └── jsp
│           ├── driver
│           │   └── HospitalDriver.java
│           │
│           └── repo
│               └── HospitalRepo.java
│
├── README.md
└── .gitignore
```

---

## 🗄️ Database Setup

### Step 1: Create the Database

```sql
CREATE DATABASE hospital;
```

### Step 2: Connect to the Database

```sql
\c hospital
```

### Step 3: Create the Table

```sql
CREATE TABLE hospital (
    patient_id INT PRIMARY KEY,
    first_name VARCHAR(30),
    last_name VARCHAR(30),
    age INT,
    admit_date DATE,
    illness VARCHAR(50)
);
```

---

## ⚙️ Configure Database Connection

Update the database credentials in `HospitalRepo.java`.

```java
String url = "jdbc:postgresql://localhost:5432/hospital";
String username = "postgres";
String password = "your_password";
```

Replace `your_password` with your PostgreSQL password.

---

## ▶️ How to Run

1. Clone the repository.

```bash
git clone https://github.com/your-username/Hospital-Management-System.git
```

2. Open the project in **Eclipse IDE**.

3. Add the PostgreSQL JDBC Driver to the project.

4. Create the database and table using the SQL scripts above.

5. Update your database credentials.

6. Run:

```
HospitalDriver.java
```

---

## 📸 Sample Menu

```
======================================
   HOSPITAL MANAGEMENT SYSTEM
======================================

Choose an Option

1. Add New Patient
2. Update Patient Details
3. Delete Patient
4. View All Patients
5. Exit
```

---

## 💻 Sample Output

```
Enter Patient ID:
101

Enter First Name:
Pankaj

Enter Last Name:
Aher

Enter Age:
23

Enter Admit Date (yyyy-mm-dd):
2025-12-31

Enter Illness:
Cough

Patient Added Successfully.
```

---

## 📚 CRUD Operations

| Operation | Description                     |
| --------- | ------------------------------- |
| Create    | Insert a new patient record     |
| Read      | Display all patient records     |
| Update    | Modify existing patient details |
| Delete    | Remove a patient record         |

---

## 🚀 Future Enhancements

* Doctor Management
* Appointment Scheduling
* Patient Search by ID
* Billing Module
* Login & Authentication
* Admin Dashboard
* Exception Handling Improvements
* Input Validation
* Maven Project Support
* GUI using Java Swing or JavaFX
* REST API using Spring Boot

---

## 🎯 Learning Outcomes

This project demonstrates:

* Java Programming
* JDBC API
* PreparedStatement
* Statement
* ResultSet
* CRUD Operations
* PostgreSQL Integration
* Exception Handling
* Console-Based Application Development

---

## 👨‍💻 Author

**Pankaj Aher**
---

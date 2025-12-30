📦 Inventory Management System (Java + PostgreSQL)
📌 Overview

The Inventory Management System is a Java-based console application designed to manage products, stock levels, and inventory operations efficiently.
It helps users add, update, delete, and view products, ensuring accurate inventory tracking using a PostgreSQL database.

This project demonstrates my understanding of core Java, JDBC, and database-driven applications.

✨ Features

➕ Add new products to inventory

✏️ Update existing product details

❌ Delete products

📋 View all products

📦 Stock quantity management

🔒 Data persistence using PostgreSQL

🛠️ Tech Stack

Language: Java

Database: PostgreSQL

Concepts Used:

JDBC

OOP (Encapsulation, Abstraction)

Exception Handling

SQL (CRUD operations)

⚙️ How to Run the Project
1️⃣ Prerequisites

Java JDK 8 or above

PostgreSQL installed

Any IDE (IntelliJ / Eclipse / VS Code)

2️⃣ Database Setup

Create a database in PostgreSQL:

CREATE DATABASE inventory_db;


Create a table:

CREATE TABLE products (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    quantity INT,
    price DOUBLE PRECISION
);

3️⃣ Configure Database Connection

Update database credentials in your Java DB connection file:

String url = "jdbc:postgresql://localhost:5432/inventory_db";
String user = "your_username";
String password = "your_password";

4️⃣ Run the Application

Compile and run the main Java file

Use the console menu to perform inventory operations

📸 Sample Output
1. Add Product
2. Update Product
3. Delete Product
4. View Products
5. Exit
Enter your choice:

🚀 Future Enhancements

User login & role-based access

JavaFX / Web-based UI

Low-stock alerts

Export inventory reports

REST API version using Spring Boot

👨‍💻 Author

Akash J
Aspiring Java Backend / Full Stack Developer

GitHub: https://github.com/akasharjun2004-prog

⭐ Why This Project Matters

This project proves my ability to:

Build real database-connected applications

Write clean Java code

Work with SQL + JDBC

Design basic backend systems

# Lin Library Management
This project is a Library Management System built using Spring Framework with Spring Boot and Maven as the build tool. The application allows librarians to perform CRUD operations on two entities: Book and Borrower, which have a many-to-many relationship. The Book entity has fields like id, title, author, publisher, and ISBN. The Borrower entity has fields like id, name, email, and phone number. The application uses Thymeleaf as the view template engine, Spring Data JPA to interact with the database, and Hibernate as the ORM tool. The database used is either MySQL or PostgreSQL.
# Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

# Prerequisites
To run the application, you need to have the following installed on your machine:

* Java 17 or later
* Maven
* MySQL or PostgreSQL database
# Installing
1.Clone the repository to your local machine
2.Import the project as a Maven project in your preferred IDE
3.Open the application.properties file and edit the database configurations to match your local database configuration.
4.Run the application using the command `mvn spring-boot:run` or by running the main method in the LibraryManagementSystemApplication class.

# Features
# CRUD Operations
* The application allows librarians to perform CRUD operations on both Book and Borrower entities. They can create new books or borrowers, view details of existing ones, update their information or delete them from the system.

# Thymeleaf Template Engine
*Thymeleaf is used as the view template engine in the application. It provides a clean and concise syntax for writing HTML templates and allows for easy integration with Spring.

# Spring Data JPA
*Spring Data JPA is used to interact with the database. It provides a high-level abstraction over the underlying database and makes it easy to perform CRUD operations.

# Hibernate
* Hibernate is used as the ORM tool in the application. It provides a powerful and flexible framework for mapping Java objects to database tables.

# MySQL or PostgreSQL
* The application can be configured to use either MySQL or PostgreSQL as the database. The choice of database can be made by editing the application.properties file.
# User Interface
* The user interface is designed to be easy to use and responsive. It provides librarians with a simple and intuitive way to manage books and borrowers in the system.

# Built With
* Spring Framework
* Spring Boot
* Maven
* Thymeleaf
* Spring Data JPA
* Hibernate
MySQL or PostgreSQL

# Authors
* Alina Bakytbek kyzy -  GitHub anemone2002

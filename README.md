Spring Boot Book´s Repository With REST
==============

Spring Boot application that implements a book's repository using 
CRUD (Create, Read, Update, Delete) operations to create and recover
objects (books) stored in a H2 data base using Spring Data JPA.
The CRUD operations are made via RESTful.

Modules:
========
- Spring Boot
- Spring Data JPA
- Spring Boot - HATEOAS for RESTful Services
- Spring Boot Web 
- H2 In-Memory Database

Build the jar:
-------------------------
./gradlew build

Run the jar:
-------------------------
java -jar build/libs/jap-h2-with-rest-0.0.1-SNAPSHOT.jar

Test the application:
-------------------------
Connect to the server via http://localhost:8080/books using
for example a Restful API tester, like Postman, and check the 
CRUD operations.
Note: the json input for PUT or POST should be like:

{
	"author" : "book´s author",
	"title" : "book´s title"
}

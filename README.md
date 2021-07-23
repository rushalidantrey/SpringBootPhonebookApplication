# SpringBootPhonebookApplication

In this Spring Boot App , I have implemented RESTful web services APIs for CRUD operations on a MySQL database. The CRUD operations include Create, Retrieve, Update and Delete.

used:
Java Development Kit (JDK 1.8 or newer)
MySQL Database server (including MySQL Workbench and MySQL Command Line Client to manage database)
A Java IDE (Eclipse IDE)
curl (to test RESTful APIs)


LEVEL 1 AND EXCEPTION HANDLING IS COMPLETED.


CURL COMAMNDS

To see the server response
curl http://localhost:8080/phonebook

Type the following curl command to test for the given ID:

curl http://localhost:8080/phonebook/1

Using @PostMapping annotation, this method handles only HTTP POST request. And type the following command to test:

curl -X POST -H "Content-Type: application/json" -d "{\"name\":\"Anjali\",\"contact\":2999}" http://localhost:8080/phonebook

Using curl, type the following command to test updating the db with ID 1:

curl -X PUT -H "Content-Type: application/json" -d "{\"id\":1,\"name\":\"Rushali\",\"contact\":887808}" http://localhost:8080/phonebook/1

And type the following command to test deleting the db with ID 1:
1
curl -X DELETE http://localhost:8080/phonebook/1


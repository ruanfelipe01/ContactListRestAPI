# REST API for Bravi

This is a Spring API of a CRUD of contacts, using Spring Boot operations GET, PUT, POST and DELETE.
-Attributes: id, name and email.

## Requeriments

* Java - 1.8.x
* JDK 1.8.x
* Maven 3.x.x
* Spring 1.5.9.RELEASE - pom.xml

* Developed on:
* Windows 10
* Eclipse
* Spring IDE (imported from Market Place) which contains Boot Dashboard view.
* BD H2 (it is a database in memory) which dependency is placed inside the pom.xml
	- there is the file "import.sql" in the project, which contains initial data for this application

## How to run

**1. Clone the repository.**

-on git bash:
git clone https://github.com/ruanfelipe01/ContactListRestAPI.git

-import the project on the IDE (Eclipse)
- in Eclipse, open the Boot Dashboard view and start the Spring for project ContactsList

+ The application runs at <http://localhost:8080>.
+ The REST API runs at <http://localhost:8080/contacts>.


## Using the API

Download the Postman from internet and create a new workspace
import the json file contained in the project to the Collections Postman workspacce

1. Creating a new Contact using POST:
  http://localhost:8080/contacts
  Example: {"id": 3, "name": "Maria", "email": "maria@hotmail.com"}	

2. Retrieving all contacts using GET
  http://localhost:8080/contacts

3. Retrieving a single Contact by Id using GET (method search)
  http://localhost:8080/contacts/1

4. Updating a Contact using PUT
  http://localhost:8080/contacts/1
  Example: {"id": 1, "name": "Ruan Felipe da Silva", "email": "rfs_gtrs@hotmail.com"}
  
5. Deleting a Contact using DELETE 
  http://localhost:8080/contacts/1


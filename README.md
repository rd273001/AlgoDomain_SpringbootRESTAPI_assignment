# Spring Boot Application for Testing REST APIs with Postman

==> This is a sample Spring Boot application created for testing REST APIs through Postman. The application exposes a set of endpoints that you can use to test various HTTP methods like GET, POST, PUT, DELETE, etc. It also includes some sample data that you can use to make requests and test the endpoints.

=> Prerequisites :-
Before you can run this application, you need to have the following software installed on your machine:
Java Development Kit (JDK) version 8 or later
Apache Maven
Postman (for testing the APIs)

=> Getting Started :-
To run this application, follow these steps :
Clone the repository to your local machine.
Open a terminal window and navigate to the root directory of the application.
Run the following command to build the application :
mvn clean install

Once the build is complete, run the following command to start the application:
mvn spring-boot:run
This will start the application on http://localhost:8080.

Open Postman and import the sample requests provided in the requests folder of the project.

Test the endpoints by making requests and observing the responses.

=> Endpoints :-
The application exposes the following endpoints :
# GET    :   "/home/emp"       :  Returns a list of all employees.

# GET    :   "/home/emp/{id}"  :  Returns the details of a specific employee.

# POST   :   "/home/add"       :  Creates a new employee.

# PUT    :   "/home/update"    :  Updates an existing employee.

# DELETE :   "/home/emp/{id}"  :  Deletes an existing employee.

=> Sample Data :-
The application includes some sample data that you can use to make requests and test the endpoints. The sample data includes the following employees:
[ {  "id": 1, "name": "John Doe", "address": "123 Main St, Anytown USA", "salary": 50000 },
  {  "id": 2, "name": "Jane Doe", "address": "456 Elm St, Anytown USA",  "salary": 60000 },    
  {  "id": 3, "name": "Bob Smith", "address": "789 Oak St, Anytown USA", "salary": 70000 } ]
  
=> Conclusion :-
This Spring Boot application provides a simple way to test REST APIs through Postman. By following the steps outlined above, you can quickly set up the application and start testing your APIs.



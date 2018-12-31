# Rest-API Spring Boot Project

This repository aims to develop a simple web application using a REST API, which will be able to handle simple information storage and retrieval requests for a group of users.

## Functionalities 
The web application required to be able to implement the following functionalities:

1.	Storage of user information in a local database via a POST request that will handle the user information.
     
    This information will include the following fields: <*first_name*, *last_name*, *email*, *gender*, *ip_address*>

2.	Querying of the database, in order to retrieve specific user information via a GET request.
     
     This query was developed using the *user’s email address*, whereas similar implementation can be induced using the ip address.

## Web Application Structure
The application developed implements the following methods (using FTL pages):

1.	**/** : 

Displays all the records of the database. 
       
•  If the database (consisting of 1 table) is empty, this page shall display an empty table. This option was deliberately selected, so as to provide some basic information, regarding the dB’s fields to the user of the application.
            
•  Each column name is according to the dB’s fields, as a convenient measure to help the testing of our application (creating get/post parameters via postman application).
            
            
 2.	**/saveUser** : 
 
When the proper post parameter is sent from postman application, it stores the inserted value to the dB and then redirects the user to the /allUsers page, in order to display all the values. If the id provided already exists, it shall update the tuple’s fields.
        
        
3.	**/getUser** : 

When the proper post parameter is sent from postman application, the user is redirected to a new site.

•  If no entry is found (or wrong search input is provided) it displays a plain text message. 
       
•  If one or more entries exist, each row is presented in a table.


    
#### SQL structure & data dump
•	Regarding the Dbs username and password credentials:

In the *application.properties*(/src/main/resources) file change lines: 8(username) and 11(password)

•	Regarding the Dbs name:
In the *application.properties*(/src/main/resources) file change line: 5 there is the following command:

``spring.datasource.url =  jdbc:mysql://localhost:3306/**project1**?verifyServerCertificate=false&useSSL=false&requireSSL=false``

CHANGE ONLY: **project1** with the **name** of your local machine's *db name*.

#### Guidelines – Technologies Used

-Java v.11.0.1

-Spring Boot v.5.0	

-MySQL v.8.0.13

-Hibernate ORM v.5.3.3

-Bootstrap v.4

-Freemarker v.2.3.28

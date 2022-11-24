# Spring Boot "Microservice" SWAPI (Starwars API) Demo Project

This is a sample Java / Maven / Spring Boot application which is built to demonstrate SWAPI by exposing REST endpoints to access STARSHIPS inventory.

# Technologies Used

* Java 17.0.5
* Springboot 2.7.5
* SpringDataJPA
* Spring Security
* Hibernate
* H2 In-memory Database
* Lombok
* Docker

# Prerequisites

* JAVA 17
* Docker

# Database

Application makes use of H2 im-memory database to hold SWAPI Starships data.

```

src/main/resources/data/h2/schema.sql - To create database schema

src/main/resources/data/h2/import.sql - To populate table data.

```

## Instructions on how to run this application

###As a standalone REST service - ```without Docker```

This application is packaged as a jar which has Tomcat embedded. You run it using the ```java -jar``` command.

* Clone this repository
* Make sure you are using JDK 17 and Maven 3.x
* You can build the project and run the tests by running ```mvn clean package```
* Once successfully built, you can run the service by one of these two methods:
```
        java -jar target/swapi-project-0.0.1-SNAPSHOT.jar
or
        mvn spring-boot:run
```

### Inside a Docker container.

Use below docker commands to build and execute the Dockerfile.

```
-- Docker BUILD Command --

docker build -t swapi-project .

```
```
-- Docker RUN Command to run the application inside a container --

docker run -d -it -p 127.0.0.1:8080:8080 <<docker-image>> 

This will map the host port 8080 to Docker container port 8080.

Replace <<docker-image>> above with the docker image ID,

```

# Access to application
This application uses Spring Security - Basic Authentication to allow access to REST end-points.

```

-- Via Web Browser

http://localhost:8080

User is prompted for Username and Password. Use "user" as username and "password" as password to access the application.
```

```
Via Postman
 
 To do this, we simply go to the “Authorization” tab and select “Basic Auth” as the authorization type. 
 After that, we insert the username and password. 
 
 Use "user" as username and "password" as password to access the end-points.

```

# SWAPI Starship REST End-Points


```
1)  Get the total number of Starship units of a specific starship.

[ HTTP GET ] http://localhost:8080/starships/search/<<Starship Name >>

e.g.
http://localhost:8080/starships/search/Y-wing
This will return all the Starships from the inventory with matching name.

```

```
2) API to return all Starships from inventory.

[ HTTP GET ] http://localhost:8080/starships

```
```
3) API to add a Starship to the inventory.

[ HTTP POST ] - http://localhost:8080/starships

e.g.
http://localhost:8080/starships

POST DATA 
---------
       {
        "crew": 67,
        "mglt": "1400",
        "max_Atmosphering_Speed": "9350",
        "length": "134",
        "cost_In_Credits": "8800000",
        "model": "CR90 corvette",
        "acl": null,
        "starship_Class": "corvette",
        "name": "CR90 corvette",        
        "films": "",
        "consumables": "4 year",
        "manufacturer": "Corellian Engineering Corporation",
        "cargo_Capacity": "5000000",
        "passengers": "2300",
        "pilots": "",        
        "hyperdrive_Rating": 5
      }
```

```
4) API to return a Starship by ID.

[ HTTP GET ] http://localhost:8080/starships/12

```
```
5) API to update a Starship.

[ HTTP PUT ] - http://localhost:8080/starships

e.g.
http://localhost:8080/starships

PUT DATA 
---------
       {
        "crew": 67,
        "mglt": "1400",
        "max_Atmosphering_Speed": "9350",
        "length": "134",
        "cost_In_Credits": "8800000",
        "model": "CR90 corvette",
        "acl": null,
        "starship_Class": "corvette",
        "name": "CR90 corvette",        
        "films": "",
        "consumables": "4 year",
        "manufacturer": "Corellian Engineering Corporation",
        "cargo_Capacity": "5000000",
        "passengers": "2300",
        "pilots": "",        
        "hyperdrive_Rating": 5
      }
```
```
6) API to DELETE a Starship from the inventory.

[ HTTP DELETE ] - http://localhost:8080/starships/12

```

```
7) API to get count of Starships from the inventory by matching name.

[ HTTP GET ] - http://localhost:8080/starships/count/Y-wing

The above example will return 3 in case of "Y-wing".

```




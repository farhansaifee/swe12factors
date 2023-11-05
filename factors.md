# 12 Facotrs
This file describes the 8 factors used in this project.

## 1 Codebase
This project uses a single codebase tracked in version control, which is GIT, where the project is typically organized in a repository.

## 2 Dependencies
There is a file called pom.xml, where the project dependencies are being managed using Maven.

## 3 Config
In the folder resources there is a file called application.properties. In this file you can externalize configuration for server settings, database connection, and other configurations.

## 4 Build, Release, Run
In this project Maven is being used to build the project and package it into a runnable JAR file.
The JAR file contains the application and its dependencies.

## 5 Processes
Spring Boot manages the application process in this project. It's stateless and does not rely on external process management.

## 6 Concurrency
Spring Boot handles concurrency by managing incoming HTTP requests concurrently.

## 7 Disposability
This project can bes started and stopped easily by using Spring Boot, which makes it disposable. So there is no complex set up or scripts needed.

## 8 Logs
Logs are defined in the class TodoItemController for Create, Update, Delete and Get Todo Items.

# Other Factors
In this paragraph I will explain a little bit about how the other factors could be used in this project.
These 4, which were not included to this project, but are still very important.

## 9 Backing Services
I would use an in-memory H2 database as a backing service for storing those TODO-Items.
This would result to treating the database as an external resource that can be easily swapped for different environments.

## 10 Port Binding
The server port is actually defined in application.properties, which ensures the execution on different ports based on the environment, and also used, but I am not sure if something is missing or not.

## 11 Dev/Prod Parity
In future one can use different application.properties files for development and production, but in this project there is only one file. 

## 12 Admin Processes
Spring Boot Actuator provides various endpoints for monitoring and managing an application, which can be configured in application.properties file as well.
(Helps to maintain and observe the microservice)
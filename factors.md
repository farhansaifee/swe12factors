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

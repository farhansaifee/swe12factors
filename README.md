# Assignment - 8 of 12 Factors
This is a simple TODO List microservice project for an Assignment.

## Service Execution - on my PC
On my PC you just run the SimpleAppApplication to start the project.
With a CURL command, you can for example add a TODO-Item.
But to run the project on every machine, docker is required. So in the next chapter I will explain how to run it with Docker.

## Service Execution - using Docker
To ensure that this TODO List microservice is executableon any machine with Docker runtime, you can create a Docker image of your Spring Boot application and run it as a Docker container.

First of all, a Dockerfile should be created in the root directory of the Spring Boot project. (This file describes how to build your Docker image)


# Assignment - 8 of 12 Factors
This is a simple TODO List microservice project for an Assignment.

Here is the Repo-Link: https://github.com/farhansaifee/swe12factors.git


## Service Execution - on my PC
On my PC you just run the SimpleAppApplication to start the project.
With a CURL command, you can for example add a TODO-Item.
But to run the project on every machine, docker is required. So in the next chapter I will explain how to run it with Docker.

## Service Execution - using Docker
To ensure that this TODO List microservice is executableon any machine with Docker runtime, you can create a Docker image of your Spring Boot application and run it as a Docker container.

### JAR
First of all, the following command has to be entered, so that I can have my built Spring Boot project into a runnable JAR file.
```
mvn clean install
```
After that, the JAR file should be generated in the target directory. 

### Dockerfile
Then, a Dockerfile should be created in the root directory of the Spring Boot project. The Dockerfile describes how to build your Docker Image, which looks like this:

![Dockerfile](![image](https://github.com/farhansaifee/swe12factors/assets/46992929/582000b4-3431-4011-b732-b454e24ee1e3))

### Docker Image
In the directory, where the Dockerfile is located, the following command should be executed.
```
docker build -t simpleapp .
```
This builds a docker image called simpleapp (that's how my project is called).

### Docker Container
Once the docker image is built, the docker container can run by the command:
```
docker run -p 8080:8080 simpleapp
```
The docker container from the image 'simpleapp' and port 8080 will then start.
And after opening localhost:8080, everyone who did all the steps, is able to interact the todo list, as if it's running locally on your machine.

### Screenshots
Here are some screenshots of this project

![Docker Image](![image](https://github.com/farhansaifee/swe12factors/assets/46992929/1d795931-1692-4e2f-b4f7-7de507d005bc))

![Docker Container](![image](https://github.com/farhansaifee/swe12factors/assets/46992929/d966471c-c3de-41df-9f31-9f800e152ea4))


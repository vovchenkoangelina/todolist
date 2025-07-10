FROM openjdk:17-jdk-slim-buster
WORKDIR /todoapp
COPY /target/todo-0.0.1-SNAPSHOT.jar /todoapp/todo.jar
ENTRYPOINT ["java", "-jar", "todo.jar"]
# Spring boot application in docker

FROM openjdk:8-jdk-alpine
VOLUME [ "/tmp" ]
ADD ./simple-rest-service/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar" ]
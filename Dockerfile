FROM openjdk:18-jdk-slim

WORKDIR /app

COPY target/*.jar /app/api.jar

EXPOSE 8081
ENV VAR_DOCKER variável do docker

CMD ["java", "-jar","api.jar"]
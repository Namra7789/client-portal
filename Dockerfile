FROM maven:3.8.3-openjdk-17 AS build
COPY . . 
RUN mvn clean package -DskipTests

FROM openjdk:23-ea-17-jdk-slim
COPY --from=build target/client-portal-0.0.1-SNAPSHOT.jar client-portal.jar
EXPOSE 8080
ENTRYPOINT [ "java","-jar","client-portal.jar" ]
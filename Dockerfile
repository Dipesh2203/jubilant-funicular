# Build stage
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /project
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Run stage
FROM eclipse-temurin:17-jre
WORKDIR /project
COPY --from=build /project/target/*.jar project-0.0.1-SNAPSHOT.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","project-0.0.1-SNAPSHOT.jar"]
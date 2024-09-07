FROM openjdk:17
LABEL authors="erik-pc"
COPY src/main/java/spring/build/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
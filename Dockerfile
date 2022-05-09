FROM openjdk:17-jdk-slim
WORKDIR /app
EXPOSE 8080
COPY build/libs/*.jar app.jar
CMD ["java", "-jar", "app.jar"]

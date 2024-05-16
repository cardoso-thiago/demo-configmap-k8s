FROM eclipse-temurin:17.0.11_9-jdk-alpine
COPY build/libs/*.jar /app.jar

EXPOSE 8080

CMD ["java", "-jar", "/app.jar"]
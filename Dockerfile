FROM eclipse-temurin:24-jdk AS builder

WORKDIR /workspace
COPY . .
RUN chmod +x mvnw && ./mvnw clean package -DskipTests

FROM eclipse-temurin:24-jre

WORKDIR /app
COPY --from=builder /workspace/target/*.jar app.jar

USER nobody
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
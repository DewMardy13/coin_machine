FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/coin-machine-1.0-SNAPSHOT.jar /app/coin-machine.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "coin-machine.jar"]
FROM openjdk:17-jdk-slim
VOLUME /tmp
ARG JAR_FILE=target/spirit_be-0.0.1-SNAPSHOT
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
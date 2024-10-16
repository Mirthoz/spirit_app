FROM openjdk:17-jdk-slim
VOLUME /tmp
ARG JAR_FILE=target/spirit_app.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
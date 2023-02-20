FROM openjdk:11-jre-slim
ARG JAR_FILE=target/airlineTest-1.0.2.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
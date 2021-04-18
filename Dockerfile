# Start with a base image - in this case JDK 8 Alpine
#
FROM openjdk:11-jre
# Specify JAR location
ARG JAR_FILE=target/*.jar
# Copy the JAR
EXPOSE 8080
COPY ${JAR_FILE} demo.jar
# Set ENTRYPOINT in exec form to run the container as an executable
ENTRYPOINT ["java","-jar","/demo.jar"]

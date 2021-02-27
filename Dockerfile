FROM openjdk:8-alpine
ADD target/cloudDeployment.jar cloudDeployment.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "cloudDeployment.jar"]
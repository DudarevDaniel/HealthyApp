FROM openjdk:8-jdk-alpine
VOLUME /tmp

COPY /target/healthyapp-0.0.1-SNAPSHOT.jar /tmp
WORKDIR /tmp
EXPOSE 8080

ENTRYPOINT ["java","-jar","healthyapp-0.0.1-SNAPSHOT.jar"]
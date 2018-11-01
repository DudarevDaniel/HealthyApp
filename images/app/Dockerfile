FROM openjdk:8-jdk-alpine
VOLUME /tmp

COPY ./out/production/DockerJavaApp/ /tmp
WORKDIR /tmp
ENTRYPOINT ["java","Main"]
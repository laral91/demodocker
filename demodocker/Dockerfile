FROM openjdk:11 as build
#EXPOSE 8080
#ADD target/demodocker.jar demodocker.jar
#ENTRYPOINT ["java","-jar","/demodocker.jar"]

COPY ./target/demodocker-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch demodocker-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","demodocker-0.0.1-SNAPSHOT.jar"]
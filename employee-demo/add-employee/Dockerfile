FROM maven:3.5-jdk-8-alpine as build
MAINTAINER Krishna Murthy P Mirajkar <kpmirajkar@outlook.com>
VOLUME /tmp

COPY src /usr/app/src

COPY pom.xml /usr/app/

RUN ls /usr/app

RUN mvn -f /usr/app/pom.xml clean install


EXPOSE 8010
ENTRYPOINT ["java","-jar","/usr/app/target/add-employee-0.0.1-SNAPSHOT.jar"]
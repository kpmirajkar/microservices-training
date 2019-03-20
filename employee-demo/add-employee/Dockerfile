FROM maven:3.5-jdk-8-alpine as build
MAINTAINER Krishna Murthy P Mirajkar <kpmirajkar@outlook.com>
VOLUME /tmp
EXPOSE 8010

COPY src /usr/app/src
COPY pom.xml /usr/app/
RUN mvn -f /usr/app/pom.xml clean install

COPY --from=build /usr/app/target/add-employee-0.0.1-SNAPSHOT.jar /usr/app/add-employee-0.0.1-SNAPSHOT.jar

WORKDIR ./usr/app

ARG JAR_FILE=add-employee-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} add-employee-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/add-employee-0.0.1-SNAPSHOT.jar"]
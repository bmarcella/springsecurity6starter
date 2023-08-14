FROM openjdk:17
VOLUME /tmp
COPY target/*.jar app.jar
MAINTAINER monkata.com
ENTRYPOINT ["java","-jar","/app.jar"]
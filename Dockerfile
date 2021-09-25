FROM openjdk:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/mercado-0.0.1-SNAPSHOT-standalone.jar /mercado/app.jar

EXPOSE 8080

CMD ["java", "-jar", "/mercado/app.jar"]

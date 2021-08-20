FROM openjdk:11-jdk-oraclelinux8

EXPOSE 8080

ADD target/pswgen-0.0.1-SNAPSHOT.jar myapp.jar

ENTRYPOINT ["java", "-jar", "/myapp.jar"]
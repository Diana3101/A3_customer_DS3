FROM java:8

EXPOSE 8083

ADD target/A3_customer-1.0-SNAPSHOT.jar A3_customer-1.0-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "A3_customer-1.0-SNAPSHOT.jar"]
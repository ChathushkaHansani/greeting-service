from java:8
expose 8080
add /target/greeting-service-1.0-SNAPSHOT.jar /opt/greeting-service-1.0-SNAPSHOT.jar
workdir /opt
entrypoint ["java","-jar","greeting-service-1.0-SNAPSHOT.jar"]

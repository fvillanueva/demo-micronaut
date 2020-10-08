FROM openjdk:14-alpine
COPY target/micronaut-demo-*.jar micronaut-demo.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "micronaut-demo.jar"]
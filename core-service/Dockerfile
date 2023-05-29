FROM ghcr.io/graalvm/graalvm-ce:ol9-java17
#FROM openjdk:17
COPY target/core-service-1.0.0.jar /app
EXPOSE 8088
ENTRYPOINT ["java", "-jar", "/app/core-service-1.0.0.jar"]
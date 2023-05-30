#FROM ghcr.io/graalvm/graalvm-ce:ol9-java17
#COPY target/core-service-1.0.0.jar /app
#EXPOSE 8088
#ENTRYPOINT ["java", "-jar", "/app/core-service-1.0.0.jar"]

FROM gcr.io/distroless/base
COPY target/core-service /app
EXPOSE 8088
#ENTRYPOINT ["./app/core-service"]
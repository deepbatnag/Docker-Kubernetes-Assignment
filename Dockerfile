FROM openjdk:11
RUN mkdir /app
WORKDIR /app
COPY target/kubernetes-docker-assignment-0.0.1-SNAPSHOT.jar
EXPOSE 8001

ENTRYPOINT ["java", "-jar", "kubernetes-docker-assignment-0.0.1-SNAPSHOT.jar"]

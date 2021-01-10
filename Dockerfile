FROM openjdk:8

EXPOSE 9910 9911

RUN mkdir app

COPY test-docker-k8s-1.0-SNAPSHOT.jar app
COPY stage.yml app

WORKDIR app

RUN java -jar test-docker-k8s-1.0-SNAPSHOT.jar server stage.yml

#ADD test-docker-k8s.jar test-docker-k8s.jar

#CMD ["java", "-jar", "test-docker-k8s.jar", "server", "stage.yml"]

ENTRYPOINT ["java", "-jar", "test-docker-k8s.jar", "server", "stage.yml"]
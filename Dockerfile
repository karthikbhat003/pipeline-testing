FROM openjdk:8

EXPOSE 9910 9911

ADD target/test-docker-k8s.jar test-docker-k8s.jar

ENTRYPOINT ["java", "-jar", "test-docker-k8s.jar", "server", "stage.yml"]
FROM openjdk:8

EXPOSE 9910 9911

ADD out/test-docker-k8s.jar test-docker-k8s.jar

#ENV

ENTRYPOINT ["java", "-jar", "docker-demo.jar", "server", "stage.yml"]
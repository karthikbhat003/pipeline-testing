FROM openjdk:8

EXPOSE 9910 9911

COPY target/test-docker-k8s.jar /test-docker-k8s.jar

#ADD test-docker-k8s.jar test-docker-k8s.jar

#CMD ["java", "-jar", "test-docker-k8s.jar", "server", "stage.yml"]

ENTRYPOINT ["java", "-jar", "test-docker-k8s.jar", "server", "stage.yml"]
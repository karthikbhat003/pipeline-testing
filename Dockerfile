FROM java:8

EXPOSE 9110

ADD out/test-docker-k8s.jar test-docker-k8s.jar

ENV

ENTRYPOINT ["java", "-jar", "docker-demo.jar"]
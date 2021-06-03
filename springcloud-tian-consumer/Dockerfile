FROM java:8
MAINTAINER suaytian
VOLUME /tmp
ADD springcloud-tian-consumer-1.0-SNAPSHOT.jar app.jar
ENV spring.profiles.active=pro
CMD echo "springcloud-tian-consumer 启动"
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]
EXPOSE 8080
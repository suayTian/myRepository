FROM java:8
MAINTAINER suaytian
VOLUME /tmp
ADD springcloud-tian-company-1.0-SNAPSHOT.jar app.jar
CMD echo "springcloud-tian-company 启动"
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar","--spring.profiles.active=pro"]
EXPOSE 8002
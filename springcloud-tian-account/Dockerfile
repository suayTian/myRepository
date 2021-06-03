FROM java:8
MAINTAINER suaytian
VOLUME /tmp
ADD springcloud-tian-account-1.0-SNAPSHOT.jar app.jar
CMD echo "springcloud-tian-account 启动"
ENV spring.profiles.active=pro
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]
EXPOSE 8003
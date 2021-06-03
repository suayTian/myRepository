FROM java:8
MAINTAINER suaytian
VOLUME /tmp
RUN mkdir /springcloud-tian-config
COPY ./springcloud-tian-config/config-server-pro.yml  /springcloud-tian-config/config-server-pro.yml
COPY ./springcloud-tian-config/consumer-server-pro.yml  /springcloud-tian-config/consumer-server-pro.yml
COPY ./springcloud-tian-config/user-server-pro.yml  /springcloud-tian-config/user-server-pro.yml
ADD springcloud-tian-config-1.0-SNAPSHOT.jar app.jar
CMD echo "springcloud-tian-config 启动"
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar","--spring.profiles.active=pro"]
EXPOSE 9003
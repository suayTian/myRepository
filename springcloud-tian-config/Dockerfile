FROM java:8
MAINTAINER suaytian
VOLUME /tmp
ENV MYPATH  usr/lib
WORKDIR $MYPATH
RUN mkdir springcloud-tian-config
COPY ./springcloud-tian-config/config-server-pro.yml  /usr/lib/springcloud-tian-config/config-server-pro.yml
COPY ./springcloud-tian-config/consumer-server-pro.yml  /usr/lib/springcloud-tian-config/consumer-server-pro.yml
COPY ./springcloud-tian-config/user-server-pro.yml  usr/lib/user-server-pro.yml
CMD pwd
ARG JAR_FILE
ADD ${JAR_FILE} springcloud-tian-config-1.0-SNAPSHOT.jar
CMD echo "springcloud-tian-config 启动"
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","springcloud-tian-config-1.0-SNAPSHOT.jar","--spring.profiles.active=pro"]
EXPOSE 9003
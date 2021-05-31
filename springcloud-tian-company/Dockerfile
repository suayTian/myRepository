FROM java:8
MAINTAINER suaytian
VOLUME /tmp
ARG JAR_FILE
ADD ${JAR_FILE} springcloud-tian-company-1.0-SNAPSHOT.jar
#ENV MYPATH  usr/lib
#WORKDIR $MYPATH
CMD echo "springcloud-tian-company 启动"
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","springcloud-tian-company-1.0-SNAPSHOT.jar","--spring.profiles.active=pro"]
EXPOSE 8002
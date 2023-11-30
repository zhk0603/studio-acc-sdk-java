FROM adoptopenjdk/openjdk8-openj9:alpine

WORKDIR app
EXPOSE 8080

ENV JAVA_OPTS="-server -Xms512m -Xmx4g"

COPY ./studio-acc-sdk-sample/target/*.jar app.jar

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone


ENTRYPOINT java ${JAVA_OPTS} -Dfile.encoding=UTF-8 -Duser.timezone=Asia/Shanghai -jar /app/app.jar
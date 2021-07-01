FROM centos

RUN yum install -y \
       java-11-openjdk \
       java-11-openjdk-devel

ENV JAVA_HOME /etc/alternatives/jre
VOLUME /main-app
ADD target/OneEateries-0.0.1-SNAPSHOT.jar /main-app/app.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "/main-app/app.jar" ]
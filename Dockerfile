FROM openjdk:11
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
CMD ["/bin/sh", "-c", "java -jar myapi.jar"]
FROM openjdk:8
RUN mkdir -p testapp
ADD target/dkr.jar testapp/dkr.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar" , "testapp/dkr.jar"]
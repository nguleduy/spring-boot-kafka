FROM gradle:6.8.3-jdk11-hotspot AS build-env

WORKDIR /home/gradle
ADD src /home/gradle/src
COPY ./build.gradle /home/gradle

RUN gradle build --stacktrace

FROM adoptopenjdk:11-jre-hotspot
COPY --from=build-env /home/gradle/build/libs/*.jar /app/inventory-api.jar
EXPOSE 4002
CMD java -Djava.security.egd=file:/dev/./urandom $JAVA_OPTIONS -jar /app/inventory-api.jar

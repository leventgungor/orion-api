FROM gradle:jdk17-alpine
COPY . .
RUN gradle clean bootJar
WORKDIR ./build/libs
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
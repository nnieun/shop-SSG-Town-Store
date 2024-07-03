# base image
FROM amazoncorretto:17

# 현재 경로의 hello-world-app.jar를 이미지에 복사
COPY *.jar app.jar

# contaner start command
ENTRYPOINT ["java", "-jar", "/app.jar"]
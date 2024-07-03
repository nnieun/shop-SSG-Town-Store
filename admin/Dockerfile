# base image
FROM amazoncorretto:17

# build시 사용할 변수 선언
ARG JAR_FILE_PATH=build/libs/*.jar

# 현재 경로의 hello-world-app.jar를 이미지에 복사
COPY *.jar app.jar

# contaner start command
ENTRYPOINT ["java", "-jar", "/app.jar"]

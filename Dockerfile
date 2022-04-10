# define base docker image
FROM openjdk:11
LABEL maintainer="twinkle.me"
ADD build/libs/school-kotlin-0.0.1-SNAPSHOT.jar school-kotlin.jar
ENTRYPOINT ["java","-jar","school-kotlin.jar"]
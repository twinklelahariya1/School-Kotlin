School-Kotlin

Docker setup to run the application

step 1: Add Dockerfile with run configurations.

step 2: create docker image with the command `docker build -t school-kotlin:latest .`

step 3: check if the image is created with command `docker images`

step 4: run the docker image `docker run -p 8080:8080 school-kotlin`

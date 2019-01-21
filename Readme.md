URL to check:
####http://localhost:8080/actuator/health

##Docker commands:
######List all images: docker images -a
######List all containers: docker ps -a
######List all volumes: docker volume ls
######Purge all: docker system prune -a
######Purge image: docker rmi ${image_name}
######Purge volume: docker volume rm ${volume_name}
######Purge unused volumes: docker volume ls -f dangling=true

######Create network: docker create network healthy

######Build image with tagged ID: docker build -t db-healthy .
######Build image with tagged ID: docker build -t app-healthy -f images/app/Dockerfile .
######Run image with tagged ID: docker run --name db-healthy-container -it --rm --network=healthy --net-alias db-host -p 3306:3306 db-healthy
######Run image with tagged ID: docker run --name app-healthy-container -it --rm --network=healthy -p 8080:8080 app-healthy

#!/bin/bash

cd /home/kristofermar/development/Java-Guide/RestAPI

mvn clean install 

podman build -t restapi:latest .

podman stop java-rest-api
podman rm java-rest-api

podman run -d --name java-rest-api -p 8080:8080 -p 9990:9990 localhost/restapi


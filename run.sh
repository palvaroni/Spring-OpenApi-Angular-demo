#!/bin/bash

export JAVA_HOME="/usr/lib/jvm/java-17-openjdk-amd64"
export PATH=$JAVA_HOME/bin:$PATH

cd ./api
./mvnw spring-boot:run &

cd ../client
ng serve

trap "trap - SIGTERM && kill -- -$$" SIGINT SIGTERM EXIT

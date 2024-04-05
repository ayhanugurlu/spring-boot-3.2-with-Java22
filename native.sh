#!/usr/bin/env bash

./mvnw -Pnative -DskipTests native:compile
./target/spring-boot-3-2-with-Java22

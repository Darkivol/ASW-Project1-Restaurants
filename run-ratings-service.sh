#!/bin/bash

# Script per avviare il servizio S

echo Running Restaurants Service S

java -Xms64m -Xmx128m -jar -Dspring.profiles.active=ratings dist/ratings-0.0.1-SNAPSHOT.jar
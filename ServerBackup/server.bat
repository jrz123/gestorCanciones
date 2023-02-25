@echo off

md misCanciones
mvn clean && mvn compile && mvn exec:java -Dexec.mainClass=server.services.ServerObject

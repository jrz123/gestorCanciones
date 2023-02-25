@echo off

mvn clean && mvn compile && mvn exec:java -Dexec.mainClass=client.services.ClientObject

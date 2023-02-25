@echo off

if not exist misCanciones (
  mkdir misCanciones
)
mvn clean && mvn compile exec:java 

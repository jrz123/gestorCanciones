@echo off

cd Common && common.bat && timeout /t 20 /nobreak > NUL && cd .. && start cmd /K "orbd -ORBInitialHost localhost -ORBInitialPort 3030" && timeout /t 20 /nobreak > NUL && cd ServerBackup && start cmd /K server.bat && timeout /t 20 /nobreak > NUL && cd .. && cd ServerSongs && start cmd /K server.bat && timeout /t 20 /nobreak > NUL && cd .. && cd ServerUsers && start cmd /K server.bat && cd .. && timeout /t 20 /nobreak > NUL && cd ClientAdministrator && start cmd /K client.bat && timeout /t 20 /nobreak > NUL && cd ..

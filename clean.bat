@echo off

call :deleteFolder && call :deleteFile && pushd Client && mvn clean && popd && pushd ClientAdministrator && mvn clean && popd && pushd Common && mvn clean && popd && pushd ServerBackup && mvn clean && popd && pushd ServerSongs && mvn clean && popd && pushd ServerUsers && mvn clean && popd && goto :endScript

:deleteFolder
set "target=.settings .mvn misCanciones orb.db"
set base=%cd%
for /r "%base%" %%i in (%target%) do (
  if exist "%%i" (
    rd /s/q "%%i"
  )
)
goto :eof

:deleteFile
set "target=.project .classpath nb-configuration.xml"
set base=%cd%
for /r "%base%" %%i in (%target%) do (
  if exist "%%i" (
    del "%%i"
  )
)
goto :eof

:endScript


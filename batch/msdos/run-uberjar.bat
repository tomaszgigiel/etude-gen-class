cd %~dp0/../..
md "%HOMEPATH%/_delete_content/"
start java -jar ../target/uberjar/etude-gen-class-uberjar.jar
pause

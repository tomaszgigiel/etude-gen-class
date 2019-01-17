md "%HOMEPATH%\_delete_content\"
pushd %~dp0\..\..
call java -jar .\target\uberjar\etude-gen-class-uberjar.jar
pause
popd

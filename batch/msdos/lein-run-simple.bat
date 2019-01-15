cd %~dp0/../..
md "%HOMEPATH%/_delete_content/"
start lein do clean, uberjar, run-main-app
pause

cd %~dp0

SET old=..\..\..\etude-gen-class-old\
SET new=..\..\..\etude-gen-class\

diff -x target -x folder-diff.path -x .lein-failures -x .lein-repl-history -x .nrepl-port -x .project -x *.log -ruN %old% %new% > folder-diff.path
pause

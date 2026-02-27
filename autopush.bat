@echo off
:loop
git add .
git commit -m "auto save"
git push origin main
timeout /t 10
goto loop

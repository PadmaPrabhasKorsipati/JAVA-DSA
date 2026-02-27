@echo off
:loop
git add .
git commit -m "auto save"
git push origin main
timeout /t 30
goto loop

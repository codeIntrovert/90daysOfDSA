@echo off
setlocal enabledelayedexpansion

REM THIS CODE IS USED TO MAKE FOLDERS IN BULK
REM DO NOT RUN UNLESS YOU KNOW WHAT YOU ARE DOING, FOR ADMIN USE ONLY.


REM Set the number of days you want folders for INCRESE AS REQUIRED
set /A "num_days=15" 

REM Loop to create folders
for /L %%i in (1,1,%num_days%) do (
    set "day=%%i"
    set "day=0!day!"
    set "day=!day:~-2!"
    mkdir "Day !day!"
)

echo Folders created successfully.

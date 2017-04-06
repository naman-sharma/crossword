#NoEnv  ; Recommended for performance and compatibility with future AutoHotkey releases.
; #Warn  ; Enable warnings to assist with detecting common errors.
SendMode Input  ; Recommended for new scripts due to its superior speed and reliability.
SetWorkingDir %A_ScriptDir%  ; Ensures a consistent starting directory.

#SingleInstance Force

; Cygwin
#IfWinActive, ahk_exe mintty.exe

::gcc::gcc -ansi -W -Wall -pedantic
::g++::g{+}{+} -std=c{+}{+}11 -W -Wall -pedantic
::cda1::cd c:/cygwin/home/naman/programming/a1
::a1.cpp::g++::g{+}{+} -std=c{+}{+}11 -W -Wall -pedantic -o csort


; Notepad++
#IfWinActive, notepad++.exe

::header::



; Chrome
#IfWinActive, chrome.exe

::learn::learn.bcit.ca enter
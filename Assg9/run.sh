#!/bin/bash
javac "Q$1.java" -d out
if [ $# -eq 1 ]; then
  java -cp out "Q$1"
else
  java -cp out "Q$1" < "./input/Q$2.in"
fi
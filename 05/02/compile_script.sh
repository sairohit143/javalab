#!/bin/bash
mkdir class_files
javac ./source_files/Queue_Threads.java -d ./class_files

cd ./class_files

java Queue_Threads

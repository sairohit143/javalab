#!/bin/bash

#compilation of main source files from the ./ directory.
javac ./source_files/Shape2dDemo.java -d ./

#notifying the end user that the compilation is over.
echo "compilation of source files completed ..."

#notifying the end user that the program is about to begin.
echo "execution of program begins ..."

#executing the program from the present working directory.
java Shape2dDemo

#!/bin/bash

#compilation of auxillary source files from the ./source_files subdirectory.
javac ./source_files/BadOperandException.java -d ./class_files
javac ./source_files/BadOperatorException.java -d ./class_files
javac ./source_files/OperationFailedException.java -d ./class_files

#compilation of the ExceptionHandlingDemo source file which contains the main method.
javac ./source_files/ExceptionHandlingDemo.java -d ./class_files

#notifying the end user that the compilation is over.
echo "compilation of source files completed ..."

#moving into class_files subdirectory.
cd ./class_files

#notifying the end user that the program is about to begin.
echo "execution of program begins ..."

#executing the program from the present working directory.
java ExceptionHandlingDemo

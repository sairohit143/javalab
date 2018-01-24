#!/bin/bash

#compilation of main source file from the ./source_files/ directory.
javac ./source_files/twod.java -d ./class_files
javac ./source_files/threed.java -d ./class_files
javac ./source_files/Square.java -d ./class_files
javac ./source_files/Cube.java -d ./class_files
javac ./source_files/Rectangle.java -d ./class_files
javac ./source_files/Cuboid.java -d ./class_files
javac ./source_files/Circle.java -d ./class_files
javac ./source_files/Sphere.java -d ./class_files

#compilation of the BankDemo source file from the ./source_files/ directory that contains the main method.
javac ./source_files/ShapeDemo.java -d ./class_files

#notifying the end user that the compilation is over.
echo "compilation of source files completed ..."

cd ./class_files

#notifying the end user that the program is about to begin.
echo "execution of program begins ..."

#executing the program from the present working directory.
java ShapeDemo

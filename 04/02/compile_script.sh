#!/bin/bash

#compiling other auxillary source_files
javac ./source_files/ -d ./


#compiling the main File
javac ./source_files/BankDemo.java -d ./



#executing the Program
java BankDemo

#!/bin/bash
javac Source/*.java -d ./
javac BankDemo.java -cp ./
echo "Compiled"
java BankDemo 
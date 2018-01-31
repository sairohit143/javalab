#!/bin/bash
mkdir class_files
#compiling other auxillary source_files
javac ./source_files/InterestRate.java -d ./class_files/
javac ./source_files/Transaction.java -d ./class_files/
javac ./source_files/InsufficientFundsException.java -d ./class_files/
javac ./source_files/Account.java -d ./class_files/
javac ./source_files/SBAccount.java -d ./class_files/
javac ./source_files/FDAccount.java -d ./class_files/
javac ./source_files/Customer.java -d ./class_files/

#compiling the main File
javac ./source_files/BankDemo.java -d ./class_files/

#moving into ./class_files/ sub directory.
cd ./class_files/

#executing the Program
java BankDemo

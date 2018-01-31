#!/bin/bash

#compiling other auxillary sources
javac ./sources/InterestRate.java -d ./class_files/
javac ./sources/Transaction.java -d ./class_files/
javac ./sources/InsufficientFundsException.java -d ./class_files/
javac ./sources/Account.java -d ./class_files/
javac ./sources/SBAccount.java -d ./class_files/
javac ./sources/FDAccount.java -d ./class_files/
javac ./sources/Customer.java -d ./class_files/

#compiling the main File
javac ./sources/BankDemo.java -d ./class_files/

#moving into ./class_files/ sub directory.
cd ./class_files/

#executing the Program
java BankDemo

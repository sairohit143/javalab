#!/bin/bash
javac ./source_files/Transaction.java -d ./
javac ./source/InterestRate.java -d ./
javac ./source/Account.java -d ./
javac ./source/SBAccount.java -d ./
javac ./source/FDAccount.java -d ./
javac ./source/Customer.java -d ./
javac ./BankDemo.java -d ./
echo "compiled all source files ..."
echo "execution of program begins ..."
java BankDemo

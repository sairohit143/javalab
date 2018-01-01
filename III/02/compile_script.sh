#!/bin/bash
javac ./source_files/Transaction.java -d ./
javac ./source_files/InterestRate.java -d ./
javac ./source_files/Account.java -d ./
javac ./source_files/SBAccount.java -d ./
javac ./source_files/FDAccount.java -d ./
javac ./source_files/Customer.java -d ./
javac ./BankDemo.java -d ./
echo "compiled all source files ..."
echo "execution of program begins ..."
java BankDemo

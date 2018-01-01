import java.io.*;
import java.*;
import java.util.*;

class Account{
	protected int accnumber;
	protected double balance;
	public static int count = 0;

	Account(int acno, double bal){
		this.accnumber = acno;
		this.balance = bal;
		this.count++;
	}
}

class SBAccount extends Account{
	SBAccount(int acc, double bal){
		super(acc, bal);
	}
	void deposit(double depositAmount){
		if(depositAmount >= 0){
			this.balance += depositAmount;
			System.out.print("\nDeposit Amount : " + depositAmount + " has been deposited in the Account Number : " + this.accnumber);
		}
	}
	void withdraw(double withdrawAmount){
		if((this.balance - withdrawAmount) >= 1000){
			this.balance -= withdrawAmount;
			System.out.print("\nWithdraw Amount : " + withdrawAmount + " has been withdrawn from the Account Number : " + this.accnumber);
		}
		else{
			System.out.print("\nERROR : Insufficient Minimum Balance !");
		}
	}
	void calc_interest(){
		this.balance += (this.balance * 0.04);
	}
}

class FDAccount extends Account{
	int period;

	FDAccount(int acc, int per, double deposit){
		super(acc, deposit);
		this.period = per;
	}
	double calc_interest(){
		double interest = balance * 0.0825 * period;
		return interest;
	}
	void close(){
		System.out.print("\nInterest for " + this.balance + " for " + this.period + " is : " + this.calc_interest());
		this.balance += this.calc_interest();
	}
}

class Customer{
	int cust_id;
	String name;
	String address;
	SBAccount savingsAccount;
	FDAccount fixedDeposit;
	int type;

	Customer(int cid, String cname, String addr){
		this.cust_id = cid;
		this.name = cname;
		this.address = addr;
		Scanner in = new Scanner(System.in);
		int typ = in.nextInt();
		this.createAccount(typ);
		this.type = typ;
	}
	void createAccount(int type){
		this.type = type;
		Scanner in = new Scanner(System.in);
		if(this.type == 1){
			System.out.print("\nEnter Account Number : ");
			int accnum = in.nextInt();
			System.out.print("\nEnter Opening Balance for the Savings Account : ");
			double startbalance = in.nextDouble();
			this.savingsAccount = new SBAccount(accnum, startbalance);
		}
		if(this.type == 2){
			System.out.print("\nEnter Account Number : ");
			int accnum = in.nextInt();
			System.out.print("\nEnter Period : ");
			int per = in.nextInt();
			System.out.print("\nEnter Deposit Amount for the Fixed Deposit Account : ");
			double depositamt = in.nextDouble();
			this.fixedDeposit = new FDAccount(accnum, per, depositamt);
		}
	}
	void transaction(){
		if(this.type == 1){
			System.out.print("\nChoose Transaction : \n1.Withdraw\n2.Deposit\n3.Calculate Interest\nEnter : ");
			Scanner in = new Scanner(System.in);
			int choice = in.nextInt();
			switch(choice){
				case 1:
					System.out.print("\nEnter Amount to Withdraw : ");
					double wda = in.nextDouble();
					this.savingsAccount.withdraw(wda);
					break;
				case 2:
					System.out.print("\nEnter Amount to Deposit : ");
					double dpa = in.nextDouble();
					this.savingsAccount.deposit(dpa);
					break;
				case 3:
					System.out.print("\nInterest is added to the Balance !");
					this.savingsAccount.calc_interest();
					break;
				default:
					System.out.print("\nInvalid Choice !");
			}
			this.accountStatus(1);
		}
		if(this.type == 2){
			System.out.print("\nClosing Fixed Deposit Account !\nInterest is added to the Balance !");
			this.fixedDeposit.close();
			this.accountStatus(2);
		}
	}
	void accountStatus(int choice){
		if(choice == 1){
			System.out.print("\nSAVINGS ACCOUNT STATUS\n------- ------- ------");
			System.out.print("\nSavings Account Number : " + this.savingsAccount.accnumber + "\nCustomer ID : " + this.cust_id + "\nCustomer Name : " + this.name + "\nCustomer Address : " + this.address + "\nSavings Account Balance : " + this.savingsAccount.balance);
		}
		if(choice == 2){
			System.out.print("\nFIXED DEPOSIT STATUS\n----- ------- ------");
			System.out.print("\nFixed Deposit Account Number : " + this.fixedDeposit.accnumber + "\nCustomer ID : " + this.cust_id + "\nCustomer Name : " + this.name + "\nCustomer Address : " + this.address + "\nSavings Account Balance : " + this.fixedDeposit.balance + "\nPeriod : " + this.fixedDeposit.period);
		}
	}
}

public class BankDemo{
	public static void main(String[] args){
		Customer c1 = new Customer(001, "Aravind M", "Trichy");
		Customer c2 = new Customer(002, "Jaikanth J", "Trichy");
		c1.transaction();
		c2.transaction();
		System.out.print("\nNumber of Accounts : " + Account.count);
		//System.out.print("\nNumber of Account Numbers Created : " + )
		//need a method to count number of accounts created by customer class objects.
		//base class instantiation required
	}
}

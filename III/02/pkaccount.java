package pkbanking.pkaccount;

public abstract class Account{
  protected int accnumber;
  protected double balance;

  Account(int accnumber, double balance){
    this.accnumber = accnumber;
    if(balance <= 0){
      System.out.print("\nERROR 00AE-001: Unable to Assign Opening Balance, Opening Balance must be Positive !");
    }
    else{
      this.balance = balance;
    }
  }
}

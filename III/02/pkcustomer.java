package pkbanking.pkcustomer;

import pkbanking.pkaccount.*;

public class Customer{
  int cust_id;
  String name;
  String address;
  SBAccount[] savings;        //create a dynamic array of objects
  FDAccount[] deposits;       //create a dynamic array of objects

  Customer(int cust_id, String name, String address){
    this.cust_id = cust_id;
    this.name = name;
    this.address = address;
  }
  public void createAccount(int type){
    Scanner in = new Scanner(System.in);
    if(type == 1){
      System.out.print("\nEnter Account Number : ");
			int accnumber = in.nextInt();
			System.out.print("\nEnter Opening Balance for the Savings Account : ");
			double balance = in.nextDouble();
      SBAccount temp = new SBAccount(accnumber, balance);                  //devise a method to push the new object into the dynamic array of objects.
      this.savings = push(this.savings, temp);
    }
    if(type == 2){
      System.out.print("\nEnter Account Number : ");
			int accnumber = in.nextInt();
			System.out.print("\nEnter Period : ");
			int period = in.nextInt();
			System.out.print("\nEnter Deposit Amount for the Fixed Deposit Account : ");
			double depositAmount = in.nextDouble();
      FDAccount temp = new FDAccount(accnumber, depositAmount, period);    //devise a method to push the new object into the dynamic array of objects.
      this.deposits = push(this.deposits, temp);
    }
    else{
      System.out.print("\nERROR 00CE-001: Unable to create Account, type must be either Savings or Fixed Deposit !");
    }
  }
  public void transaction(int type){
    Scanner in = new Scanner(System.in);
    if(type == 1){
      System.out.print("\nEnter the Account Number to do transaction with : ");
      int account = in.nextInt();
      //include a search function of SBAccount type,
      //to search for the account number in the program,
      //to identify the object with which the transaction must be done.
    }
    if(type == 2){
      System.out.print("\nEnter the Account Number to do transaction with : ");
      int account = in.nextInt();
      //include a search function of FDAccount type,
      //to search for the account number in the program,
      //to identify the object with which the transaction must be done.
    }
    else{
      System.out.print("\nERROR 00CE-002: Unable to process transaction, type must be either either Savings or Fixed Deposit !");
    }
  }

  //push methods for dynamic array :
  private static SBAccount[] push(SBAccount array, SBAccount pushedItem){
    SBAccount[] longer = new SBAccount[array.length + 1];
    System.arraycopy(array, 0, longer, 0, array.length);
    longer[array.length] = pushedItem;
    return longer;
  }
  private static FDAccount[] push(FDAccount array, FDAccount pushedItem){
    FDAccount[] longer = new FDAccount[array.length + 1];
    System.arraycopy(array, 0, longer, 0, array.length);
    longer[array.length] = pushedItem;
    return longer;
  }
}

// private static String[] push(String[] array, String push) {
//     String[] longer = new String[array.length + 1];
//     for (int i = 0; i < array.length; i++)
//         longer[i] = array[i];
//     longer[array.length] = push;
//     return longer;
// }

// private static String[] push(String[] array, String push) {
//     String[] longer = new String[array.length + 1];
//     System.arraycopy(array, 0, longer, 0, array.length);
//     longer[array.length] = push;
//     return longer;
// }

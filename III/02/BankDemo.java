import pkbanking.*;

public class BankDemo{
  public static void main(){
    Customer c = new Customer(1001, "Aravind", "none");
    c.createAccount(1);
    c.createAccount(2);
    c.transaction(1);
    c.transaction(2);
  }
}

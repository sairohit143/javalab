package pkbanking.pkinterface;

interface Transaction{
  public final double min_balance = 500;
  void deposit(double);
  void withdraw(double);
}

interface InterestRate{
  public final double sbrate = 0.04;
  public final double fdrate = 0.0825;
}

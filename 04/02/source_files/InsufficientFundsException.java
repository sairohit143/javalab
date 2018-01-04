package pkbanking.pkexception;
class InsufficientFundsException extends Exception {
  String named;
  public InsufficientFundsException(String a){
    named = a;
  }
	public InsufficientFundsException(){
		named = new String("Insufficient funds for operation !");
	}

  public String getCause(){
    return named;
  }

	public String toString(){
		return ("ERROR IFE-001: " + this.named);
	}
}

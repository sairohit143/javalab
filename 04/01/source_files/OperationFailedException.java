package exception_handling;
import java.io.*;

public class OperationFailedException extends Exception, BadOperandException, BadOperatorException{
  public String des;

  public OperationFailedException(String str){

  }
  public OperationFailedException(String str, Throwable throw){

  }
  public String toString(){

  }
}

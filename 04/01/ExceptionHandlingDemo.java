import java.util.*;
import exception_handling.*;

public class ExceptionHandlingDemo{
  public static void main(String[] args){
    //Declaration of two operands(int) :
    int operand1 = 0;
    int operand2 = 0;

    //Declaration of one operator(char) :
    char operator = '.';

    //try-catch-finally statements
    try{
      //Instantiation of Scanner object :
      Scanner in = new Scanner(System.in);

      //Input for the operand1 :
      System.out.print("\nEnter Operand 1 : ");
      operand1 = in.nextInt();
      if(!((operand1 >= 10000) && (operand1 <= 50000))){
        throw new OperationFailedException("Bad Operand", new BadOperandException(operand1, 10000, 50000));
      }
      System.out.print("\nEnter Operator : ");
      operator = in.next().charAt(0);
      if(!((operator == '+') || ( operator == '-') || ( operator == '*') || ( operator == '/'))){
        throw new OperationFailedException("Bad Operator", new BadOperatorException( operator));
      }
      System.out.print("\nEnter Operand 2 : ");
       operand2 = in.nextInt();
      if(!(( operand2 >= 500) && ( operand2 <= 5000))){
        throw new OperationFailedException("Bad Operand", new BadOperandException( operand2, 500, 5000));
      }
      System.out.print("\nResult : " + calculate( operand1,  operand2,  operator) + ".\n");
    }
    catch(OperationFailedException failed){
      System.out.print(failed.getCause());
    }
  }

  //Calculate function :
  public static int calculate(int a, int b, char c){
    if(c == '+'){
      return (a + b);
    }
    if(c == '-'){
      return (a - b);
    }
    if(c == '*'){
      return (a * b);
    }
    if(c == '/'){
      return (a / b);
    }
    return -1;
  }
}

import java.util.*;
import exception_handling.*;

public class ExceptionHandlingDemo{
  //Declaration of two operands(int) :
  int operand1, operand2;

  //Declaration of one operator(char) :
  char operator;

  public static void main(String[] args){
    try{
      //Instantiation of Scanner object :
      Scanner in = new Scanner(System.in);

      //Input for the operands and operator :
      System.out.print("\nEnter Operand 1 : ");
      this.operand1 = in.nextInt();
      if((this.operand1 < 10000) && (this.operand1 > 50000)){
        throw new OperationFailedException("Bad Operand", new BadOperandException(this.operand1, 10000, 50000));
      }
      System.out.print("\nEnter Operator : ");
      this.operator = in.next().charAt(0);
      if(!
          (
            (this.operator == "+") ||
            (this.operator == "-") ||
            (this.operator == "*") ||
            (this.operator == "/")
          )
        ){
          throw new OperationFailed
        }
      System.out.print("\nEnter Operand 2 : ");
      this.operand2 = in.nextInt();

    }
    catch(OperationFailedException failed){
      System.out.print(failed.getCause());
    }
    finally{

    }

  }
}

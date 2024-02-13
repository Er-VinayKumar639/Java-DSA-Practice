import java.util.Scanner;
public class CalculatorApplication {
  
  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    CalculatorApplication calculator = new CalculatorApplication();
  do{
    System.out.println("Choose an operation: (*, -, /, %, +)");
    //take input from user and decide which operation needs to perform
    String input = sc.next();
    char ch = input.charAt(0);
    if(input.length()!= 1){
      System.out.println("Wrong input, please try again!");
    }else{
    calculator.chooseOperation(ch);
    }

    boolean exit = calculator.exitProgram();
    if(exit){
      break;
    }
  }while(true);
  System.out.println("Thanks for using our service!!");
    
  }

  public int getInteger(){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    return num;
  }

  public void chooseOperation(char ch){
    switch (ch) {
      case '*':
      System.out.print("Enter num1: ");
      int num1 = getInteger();
      System.out.print("Enter num2: ");
      int num2 = getInteger();
        System.out.println("Multiply Result -> " + num1*num2);
        break;
      case '+':
        System.out.print("Enter num1: ");
        int num3 = getInteger();
        System.out.print("Enter num2: ");
        int num4 = getInteger();
        System.out.println("Addition -> " + (num3+num4));
        break;
      case '-':
        System.out.print("Enter num1: ");
        int num5 = getInteger();
        System.out.print("Enter num2: ");
        int num6 = getInteger();
        System.out.println("Subtraction -> "+ (num5 - num6));
        break;
      case '/':
        System.out.print("Enter num1: ");
        int num7 = getInteger();
        System.out.print("Enter num2: ");
        int num8 = getInteger();
        System.out.println("Division -> " + (num7 / num8));
        break;
      case '%':
        System.out.print("Enter num1: ");
        int num9 = getInteger();
        System.out.print("Enter num2: ");
        int num10 = getInteger();
        System.out.println("Modulo -> "+ (num9 % num10));
        break;
      default:
        System.out.println("Invalid Choice. Please enter valid choice.");
        break;
    }
  }

  public boolean exitProgram(){
    int times = 0;
    int retry = 5;
    for(times = 0; times<retry; times++){
      System.out.println("Do you want to continue? (y/n)");
      Scanner sc = new Scanner(System.in);
      String exitInput = sc.next();
      char ch1 = exitInput.charAt(0);
      if(exitInput.length() == 1 && ch1  == 'n'){
        return true;
        // exit = true;
        // break;
      }else if(exitInput.length() == 1 && ch1 == 'y'){
        return false;
        // break;
      }else{
        System.out.println("Wrong input . please try again....");
      }
    }

    
    if (times>=retry){
      System.out.println("Maximum retry count exceeded! Exiting forcefully");
      return true;
    }
    return false;
  } 
}

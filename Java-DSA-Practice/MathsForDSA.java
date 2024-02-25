public class MathsForDSA {
  public static void main(String[] args) {
    decimalToBinary(23);
    decimalToAnyBase(5,2);
    binaryToDecimal(100010);
    anyBaseToDecimal(101,2);
    findEvenOdd(22);
    reverseNum(123);
    double pow = power(3,3);
    System.out.println("result is "+ pow);
  }

  static void decimalToBinary(int decimalNum){

    int resNum = 0;

    int power = 0;
    while(decimalNum>0){
      int rem = decimalNum % 2;
      decimalNum /= 2;
      resNum += rem * power(10,power);
      power++;
    }
    System.out.println("Result is : "+ resNum);
  }
  static void decimalToAnyBase(int decimalNum, int base){

    int resNum = 0;

    int power = 0;
    while(decimalNum>0){
      int rem = decimalNum % base;
      decimalNum /= base;
      resNum += rem * power(10,power);
      power++;
    }
    System.out.println("Result is : "+ resNum);
  }
  static void binaryToDecimal(int binaryNum){

    int resNum = 0;
    int pos = 0;
    while(binaryNum>0){
      if (binaryNum % 10 == 1) {
        resNum += (1 << pos);
      }
       pos++;
       binaryNum /= 10;
    }
    System.out.println("Result is : "+ resNum);
  }
  static void anyBaseToDecimal(int num, int base){
    int finalNum = 0;
    int pos = 0;
    while(num > 0){
      int unitDigit = num % 10;
      num /= 10;
      finalNum += unitDigit * power(base, pos);
      pos++;
    } 
    System.out.println("Result is : "+finalNum);
  }
  static void findEvenOdd(int num){
    if(num%2 == 0)
      System.out.println("Even");
    else 
      System.out.println("Odd");  
  }
  static void reverseNum(int num){
    int resNum = 0;
    while (num > 0) {
      
      int unitDigit = num % 10;
      resNum = unitDigit + resNum*10; 
      num/=10;
    }
    System.out.println("Result is: "+ resNum);
  }
  static double power(int num, int power){
    double result=1;
    for(int i= 0;i<power;i++){
      result = result*num;
    }
    return result;
  }
  
}
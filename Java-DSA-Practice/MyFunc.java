class Temp{
  int myVar;
}

class MyFunc{
  //instance variables declaration field
 
  public static void main(String[] args) {
    
    MyFunc myFuncObj = new MyFunc();

    Temp obj1 = new Temp();
    Temp obj2 = new Temp(); 

    obj1.myVar = 20;
    obj2.myVar = 10;
    myFuncObj.swapByReference(obj1, obj2);
    System.out.println("After call: " + obj1.myVar+" "+obj2.myVar);
    // int val1 = 40,val2 = 34;
    
    //int area = myFuncObj.calculateArea(230,4);
    // System.out.println("Calculated Area = "+area);
    
    // myFuncObj.swap(val1, val2);  //Pass by value
    // System.out.println(val1 +" "+ val2);
  }

  // public int calculateArea(int length, int width){
  //   int area = length*width;
  //   //System.out.println("Area = "+ area);
  //   return area;
  // }

  public void swap(int num1, int num2){
   int temp;
   temp = num1;
   num1 = num2;
   num2 = temp; 
  }
  public void swapByReference(Temp obj1,Temp obj2){
    System.out.println(obj1.myVar + ", " + obj2.myVar);
    int temp;
    temp = obj1.myVar;
    obj1.myVar = obj2.myVar;
    obj2.myVar = temp;
    System.out.println(obj1.myVar + ", " + obj2.myVar); 
   }
}